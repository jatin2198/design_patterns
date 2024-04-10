package design_pattern_prototype_pattern;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		NetworkConnection  connection=new NetworkConnection();
		connection.setId("197.89.120");
		connection.loadImpData();
		//connection.getData();
		
		System.out.println(connection);

		NetworkConnection connection2=(NetworkConnection) connection.clone();
		connection.getDomains().remove(0);
		connection2.setId("1897.123.189");
		//connection2.loadImpData();
		System.out.println(connection2);
				
	}

}
