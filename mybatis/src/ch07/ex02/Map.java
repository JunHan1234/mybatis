package ch07.ex02;

import org.apache.ibatis.annotations.Select;

import ch07.domain.User;

public interface Map {
	//parameter 이용한 select절.
	@Select("""
			select user_id userId, user_name userName, reg_date regDate
			from users
			where user_id = #{userId}
			""")
	User selectUser(int userId);
}
