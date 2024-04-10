package designpattern_abstract_factory;

public class EmpoyeeFactory {
	
	public static Employee getEmpoyee(EmployeeAbstractFactory factory  ) {
		
		return factory.createEmployee();
	}

}
