package variables;

public class variable4 {
int empid=100;
double salary=7896;
double res=empid*salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
variable4 v1=new variable4();
v1.empid=234;
v1.salary=12345;
System.out.println("empid is:"+v1.empid);
System.out.println("salary is:"+v1.salary);
System.out.println("res is:"+v1.res);

variable4 v2=new variable4();
v2.empid=123;
v2.salary=34567;

System.out.println("empid is:"+v2.empid);
System.out.println("salary is:"+v2.salary);
System.out.println("res is:"+v2.res);
	}

}
