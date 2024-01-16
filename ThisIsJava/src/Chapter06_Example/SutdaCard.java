package Chapter06_Example;

class SutdaCard {
    int num = 1;
    
    boolean isKwang = true;
        
    SutdaCard(int num){
    	if(num<1 || num>10) {
    		num = 1;
    	}else {
    		this.num = num;
    	}
    }
	
    SutdaCard (boolean isKwang){
    	if(isKwang == true) {
    		System.out.println(num+"K");
    	}
    }
    
	SutdaCard(int num, boolean isKwang) {
    	this.num = num;
    	this.isKwang = isKwang;
    }
	
	SutdaCard(){
		num = 1;
		isKwang = true;
	}
    
	String info(){
		if(isKwang == true) {
			return num+"K";
		}else {
			return Integer.toString(num);
		}
	}
}
