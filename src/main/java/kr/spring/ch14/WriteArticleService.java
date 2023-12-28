package kr.spring.ch14;

public class WriteArticleService {
	private WriteArticleDAO writeArticleDAO;
	
	//프로퍼티 방식으로 의존관계 만들기 위함
	public void setWriteArticleDAO(WriteArticleDAO writeArticleDAO) {
		this.writeArticleDAO = writeArticleDAO;
	}
	public void write() {
		System.out.println("WriteArticleService의 write() 메서드 실행");
		writeArticleDAO.insert();
	}
}
