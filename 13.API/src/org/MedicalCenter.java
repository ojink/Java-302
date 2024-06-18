package org;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONArray;
import org.json.JSONObject;

import common.CommonUtility;

public class MedicalCenter {
	CommonUtility common = new CommonUtility();
	
	void display() {
//		http통신으로 요청해
//		그 결과를 html 페이지로 출력 -> 자동실행
//		기본: 기관명, 전화번호, 주소, 점심시간대
//
//		data-portal-test-key
//		https://api.odcloud.kr/api/apnmOrg/v2/list?
		//page=1
		//&perPage=10
		//&serviceKey=data-portal-test-key
		StringBuffer url 
			= new StringBuffer("https://api.odcloud.kr/api/apnmOrg/v2/list?");
		url.append("page=").append( 1 );
		url.append("&perPage=").append( 10 );
		url.append("&serviceKey=").append( "data-portal-test-key" );
		String response = common.requestAPI(url);

		JSONObject json = new JSONObject( response );
		JSONArray list = json.getJSONArray( "data" );
		
		viewHtml( list );
	}
	
	void viewHtml( JSONArray list ) {
		
		String path = "D:/io/medical/";
		File dir = new File( path );
		if( ! dir.exists() )  dir.mkdirs();
		
		String filename = "list.html";
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter( path + filename );
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>코로나19 예방접종 위탁의료기관</h2>");
			writer.print("<table border='1'>");
//			기본: 기관명, 전화번호, 주소, 점심시간대
			writer.print("<colgroup>"
						+ "<col width='300px'>"
						+ "<col width='150px'>"
						+ "<col width='400px'>"
						+ "<col width='200px'>"
						+ "<colgroup>");
			writer.print("<tr><th>의료기관명</th><th>전화번호</th><th>주소</th><th>점심시간대</th></tr>");

			for(int idx=0; idx<list.length(); idx++) {
				JSONObject json = list.getJSONObject(idx);
				writer.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>"
								, json.getString("orgnm")
								, json.getString("orgTlno")
								, json.getString("orgZipaddr")
								, checkNull(json, "lunchSttTm", "lunchEndTm")
								
								);
			}
			
			writer.print("</table>");
			writer.print("</body>");
			writer.print("</html>");
			
		} catch (IOException e) {
		} finally {
			writer.close();
		}
		
		
		// 생성된 html 파일 실행하기
		String url = "file:///" + path + filename;
		try {
			Desktop.getDesktop().browse( new URI( url ) );
			
		} catch (IOException e) {
		} catch (URISyntaxException e) {
		}
				
	}
	
	String checkNull(JSONObject json, String start, String end) {
		System.out.println( json.get( start ) );
		start = json.get( start )== JSONObject.NULL ? "" : json.getString(start);
		end = json.get( end )==JSONObject.NULL ? "" : json.getString(end);
		return start.isEmpty() ? "" : start + "-" + end;
	}
	
}
