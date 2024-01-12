package Chapter8;

public class SmartTvExam {

	public static void main(String[] args) {
//		RemoteCon rc = new SmartTvImpl();
//		rc.turnOn();
//		rc.turnOff();
//		
//		Searchable searchable = new SmartTvImpl();
//		searchable.search("naver");
		
		SmartTv st = new SmartTvImpl();
		st.turnOn();
		st.search("naver");
		st.turnOff();
		
		
		
	}

	static void exam (RemoteCon st) {
		System.out.println("RemoteCon");
	}
	static void exam (Searchable st) {
		System.out.println("Searchable");
	}
	static void exam (SmartTv st) {
		System.out.println("SmartTv");
	}
}
