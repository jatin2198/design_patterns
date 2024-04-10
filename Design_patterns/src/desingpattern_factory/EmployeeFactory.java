package desingpattern_factory;

public class EmployeeFactory {

	
	public static Employee getDeveloperObject(Class cls ) throws Exception {
		
		if(cls.getName().equals("desingpattern_factory.AndroidDeveloper")) {
			
			
			return new AndroidDeveloper();
		}
		
		else if(cls.getName().equals("desingpattern_factory.WebDeveloper")) {
			
			return new WebDeveloper();
		}
		
		else {
			
			throw new Exception("No Class present with this name");
		}
		
		
		
		
	}
	
}
