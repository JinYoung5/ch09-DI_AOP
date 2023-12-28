package kr.spring.ch15;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//applicationContext3.xml의 설정파일을 읽어들여 스프링 컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		SystemMonitor monitor = (SystemMonitor)context.getBean("systemMonitor");
		
		//출력
		System.out.println(monitor);
		
		//자원정리
		context.close();
	}
}
