package designpattern_adapter_pattern;

public class AdapterCharger implements AppleCharger {

	private AndroidCharger androidCharger;
	
	public AdapterCharger(AndroidCharger androidCharger) {
		super();
		this.androidCharger = androidCharger;
	}
	@Override
	public void chargePhone() {
		// TODO Auto-generated method stub
		
		androidCharger.chargePhone();
	}

}
