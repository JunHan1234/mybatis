package ch02.ex01;

import java.util.List;

import ch02.domain.User;

public interface Map {
	//DAO 역할.
	//mapper interface에 list<User>를 얻고싶다고, 그 이름을 selectUsers로 설정.
	List<User> selectUsers(); //없는 User row를 select할 경우, 비어있는 List<>가 return된다.
}
