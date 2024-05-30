package worker;

abstract public class Employee {
//	사번 이름 급여 근로형태
//	월급여를 계산한다
	String employeeNo, name, workType;
	int pay;
	Employee(String employeeNo, String name
				, String workType, int pay){
		this.employeeNo = employeeNo;
		this.name = name;
		this.workType = workType;
		this.pay = pay;
	}
	
	abstract void getMonthPay();
}
