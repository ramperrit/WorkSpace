package Chapter6;

class MemberService {
	
	String id;
	String password;
	boolean login = false;
	
	boolean login(String id, String password) {
		boolean result = false;
		if(id == "hong" && password == "12345") {
			result = true;
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		return result;
	}
	
	void logout() {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
	

}
