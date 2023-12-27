package kr.spring.ch07;

public class RegisterService {
	private RegisterDAO registerDAO;

	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	} //set메서드를 만들어주는 것 = 프로퍼티 방식
	
	public void wrtie() {
		System.out.println("RegisterService의 write() 메서드 실행");
		registerDAO.insert();
	}
}
