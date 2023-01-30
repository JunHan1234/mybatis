package ch05.ex07;

import java.util.List;

import ch05.domain.User;

public interface Map {
	//parameter name이 없는경우 2.
	List<User> selectUsers(int[] userIds);
	List<User> selectUsers2(List<String> userNames);
}
