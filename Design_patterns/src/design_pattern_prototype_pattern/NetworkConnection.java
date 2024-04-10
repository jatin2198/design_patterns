package design_pattern_prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{

	private String id;
	
	private String data;

	private List<String> domains=new ArrayList<String>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "NetworkConnection [id=" + id + ", data=" + data + ", domains=" + domains +"]" ;
	}
	
	
	public void loadImpData() {
		
		this.data="ImportantData take time...";
		
	List<String> list=	List.of("test@mail.com","reck@mail.com","jac@mail.com");
		domains.addAll(list);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	//this method is for shallow copy
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException{
	 * 
	 * return super.clone();
	 * 
	 * 
	 * }
	 */
	

	//this method is for Deep copy
	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		NetworkConnection connection=new NetworkConnection();
		connection.setId(this.id);
		connection.setData(this.data);
		for(String d:this.domains) {
			
			connection.getDomains().add(d);
		}
		
		return connection;
		
		
	}
	
}
