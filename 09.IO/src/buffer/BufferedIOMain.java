package buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOMain {
	public static void main(String[] args) {
		String filename = "buffered";
		
		BufferedOutputStream out = null;
	
		try {
			out = new BufferedOutputStream(
						new FileOutputStream(filename), 1024 );
			byte[] datas = { 10, 20, 30, 40, 50, 60, 110, 120, 112, 113} ;
			out.write(datas);
			//버퍼가 다 채워지지 않더라도 바로 스트림을 내려보내려면 flush 처리가 필요함
			out.flush();
		}catch(IOException e) {
			System.out.println( e.getMessage() );
		}finally {
			try{ out.close();}catch(IOException e) {}
		}
		System.out.println("쓰기 완료");
		
		
		BufferedInputStream in = null;
		
		try {
			in = new BufferedInputStream( 
					new FileInputStream(filename) );
			while(true) {
				byte data = (byte)in.read();
				if( data == -1 ) break;
				System.out.println( data );
			}
			
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			if( in!=null ) {
				try{ in.close(); }catch(Exception e) {}
			}
		}
		System.out.println("읽기완료");
		
	}
}
