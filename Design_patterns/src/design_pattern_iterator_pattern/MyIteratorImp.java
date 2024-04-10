package design_pattern_iterator_pattern;

import java.util.List;

public class MyIteratorImp implements MyIterator {

	private List<User> list;
	
	private int length;
	
	private int position=0;
	
	public MyIteratorImp(List<User> userList) {
		// TODO Auto-generated constructor stub
	this.list=userList;
	this.length=userList.size();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if(position>=length) {
			
			return false;
		}
		else {
		
		return true;}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		
		User user=list.get(position);
		position++;
		return user;
	}

}
