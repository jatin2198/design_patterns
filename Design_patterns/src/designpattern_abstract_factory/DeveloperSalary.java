package designpattern_abstract_factory;

public class DeveloperSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee employee= EmpoyeeFactory.getEmpoyee(new AndroidFactory());

System.out.println(employee.name()+" "+ "Salary= "+employee.salary());
	

Employee emp2= EmpoyeeFactory.getEmpoyee(new WebDeveloperFactory());

System.out.println(emp2.name()+" "+ "Salary= "+emp2.salary());
	}

}
