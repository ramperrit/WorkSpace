package Chapter6_Example;

class Mypoint {
	int x;
	int y;
	
	Mypoint (int x, int y){
		this.x = x;
		this.y = y;
	}

    double getDistance(int x1, int y1) {
	  return Math.sqrt(Math.pow((x1-x),2.0) + Math.pow((y1-y), 2.0));
    }
}

class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mypoint p = new Mypoint(1, 1);
		
		//p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));

	}

}
