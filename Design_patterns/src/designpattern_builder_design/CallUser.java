package designpattern_builder_design;

public class CallUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User.UserBuilder()
		.setUserId("123").setUserName("Jatin")
		.setEmailId("test@mail.com").build();
		
		System.out.println(user);
		//System.out.println(user.getUserId() +" "+ user.getUserName()+" "+ user.getEmailId());

	}

}
