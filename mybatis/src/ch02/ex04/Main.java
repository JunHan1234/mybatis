package ch02.ex04;

import java.time.LocalDate;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		 /*return되는 row의 개수가 0보다 크면 실행.*/
		if(mapper.updateUser(new User(11, "King", LocalDate.of(2023, 2, 1))) > 0)
			System.out.println("성공");
	}
}
