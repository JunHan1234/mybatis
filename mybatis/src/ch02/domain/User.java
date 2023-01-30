package ch02.domain;

import java.time.LocalDate;
//jdbc가 아니라 mybatis는 LocalDate 사용가능.
//User class가 ORMapping에 쓸 object이 된다.
public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	
	public User(int userId, String userName, LocalDate regDate) {
		this.userId = userId;
		this.userName = userName;
		this.regDate =regDate;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
}