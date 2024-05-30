package worker;

public class RegularEmployee
		extends Employee{
//	사번 이름 급여(연봉)  근로형태 보너스
	int bonus;
	RegularEmployee(String employeeNo
			, String name, String workType
			, int pay, int bonus){
		super(employeeNo, name, workType, pay);
		this.bonus = bonus;
	}
	
//	월급여를 계산한다
	void getMonthPay() {
		
	}
}
