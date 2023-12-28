package kr.spring.ch13;

import java.util.Properties;

public class BookClient {
	private Properties prop; //generic 표현을 사용하지않음

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "BookClient [prop=" + prop + "]";
	}
	
}
