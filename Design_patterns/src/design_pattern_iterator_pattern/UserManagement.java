package design_pattern_iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

	List<User> userList=new ArrayList<User>();
	
	public void addUser(User user) {
		
		userList.add(user);
	}
	
public User getUser(int index) {
		
		return userList.get(index);
	}

public MyIterator getCustomIterator() {
	return new MyIteratorImp(userList);
	
	
}
}
