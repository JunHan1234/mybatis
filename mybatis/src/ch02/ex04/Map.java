package ch02.ex04;

import ch02.domain.User;

public interface Map {
	int updateUser(User user); //true일 경우 0 초과 return, false일 경우 0을 return한다.
}
