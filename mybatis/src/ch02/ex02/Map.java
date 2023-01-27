package ch02.ex02;

import java.time.LocalDate;

import ch02.domain.User;

public interface Map {
	User selectUser(int userId/*where절에 쓸 key*/);
	User selectUser2(String userName);
	User selectUser3(LocalDate regDate);
}
