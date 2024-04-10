package desingpattern_factory;

public class DeveloperSalary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Employee employee=EmployeeFactory.getDeveloperObject(AndroidDeveloper.class);
		
		System.out.println(employee.salary());

	}

}
