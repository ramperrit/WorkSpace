package Chapter8_Example3;

public class Dog extends Pet{
	private String speices;
	private boolean shot;
	
	public boolean shot(String answer) {
		if(answer == "예") {
			shot = true;
		}else if (answer == "아니오"){
			shot = false;
		}
		return shot;
	}
	
	public String speices(String speices) {
		return this.speices = speices;
	}
	
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Info() {
		// TODO Auto-generated method stub
		
	}
	
	

}