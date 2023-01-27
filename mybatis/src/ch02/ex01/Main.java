package ch02.ex01;

import java.util.List;

import ch02.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		//Map.class는 Class<ch02.ex01.Map> 이라는 x 객체 생성 후 그 객체를 mapper에 담는다.
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> users = mapper.selectUsers();
		users.forEach(System.out::println);
	}
}
