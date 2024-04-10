package designpattern_adapter_pattern;

public class ApplePhone {
	
	private AppleCharger applecharger;
	
	public void chargeIPhone() {
		
		applecharger.chargePhone();
	}

	public ApplePhone(AppleCharger applecharger) {
		super();
		this.applecharger = applecharger;
	}
	
	

}
