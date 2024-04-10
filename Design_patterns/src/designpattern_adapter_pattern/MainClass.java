package designpattern_adapter_pattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program started......");
		
		//AppleCharger appleCharger=new AppleChargerImpl();
		AndroidCharger androidCharger=new AndroidChargerImpl();
		AppleCharger appleCharger=new AdapterCharger(androidCharger);
		ApplePhone applePhone=new ApplePhone(appleCharger);
		applePhone.chargeIPhone();

	}

}
