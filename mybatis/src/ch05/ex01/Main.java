package ch05.ex01;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		User user = mapper.selectUser(new Search("john", null));
		//isEmpty()를 썼다면, null값을 넣어서는 안된다.
		//user = mapper.selectUser(new Search("john", new Post("정의", null)));
		user = mapper.selectUser(new Search("john", new Post("정의", "")));
		//user = mapper.selectUser(new Search("john", new Post(null, "고리")));
		System.out.println(user);
	}
}
