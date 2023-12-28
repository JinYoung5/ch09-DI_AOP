package kr.spring.ch12;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		/*
		 * applicationContext2.xml의 설정파일을 읽어들여 스프링 컨테이너를 생성
		 */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Set타입 프로퍼티 설정
		VideoClient video = (VideoClient)context.getBean("videoClient");
		
		//toString을 정의했으니 출력
		System.out.println(video);
		
		//자원정리
		context.close();
	}
}
