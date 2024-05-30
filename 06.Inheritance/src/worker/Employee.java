package worker;

abstract public class Employee {
//	사번 이름 급여 근로형태
//	월급여를 계산한다	
	String  name, workType;
	int employeeNo, pay;
	static int seq = 24001;
	Employee( String name, String workType, int pay){
		this.employeeNo = seq++;
		this.name = name;
		this.workType = workType;
		this.pay = pay;
	}
	
	abstract int getMonthPay();
}
