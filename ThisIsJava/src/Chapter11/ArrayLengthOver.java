package Chapter11;

public class ArrayLengthOver extends Exception{
	//exception 상속
	
	ArrayLengthOver() {}
	
	ArrayLengthOver(String message){
		super(message);
	}
}
