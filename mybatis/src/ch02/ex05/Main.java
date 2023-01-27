package ch02.ex05;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		if(mapper.deleteUser(11) > 0) /*return되는 row의 개수가 0보다 크면 실행.*/
			System.out.println("성공");
	}
}