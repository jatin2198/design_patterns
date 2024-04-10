package design_pattern_iterator_pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserManagement management=new UserManagement();
		management.addUser(new User("Test1", "1234"));
		management.addUser(new User("Test2", "1235"));
		management.addUser(new User("Test3", "1236"));
		
	//User user=	(User) management.MyIteratorImp().next();
	
	//System.out.println(user);
		MyIterator iterator= management.getCustomIterator();
		
		while(iterator.hasNext()) {
			
			User user=	(User) iterator.next();
			
			System.out.println(user);
		}

	}

}
