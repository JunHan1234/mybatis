package ch07.ex03;

import org.apache.ibatis.annotations.Insert;

import ch07.domain.User;

public interface Map { //dml ~ insert update delete문장.
	//userName에 null값 들어오는것 방지용. #{userName, jdbcType=VARCHAR}
	@Insert("""
			insert into users
			values(#{userId}, #{userName, jdbcType=VARCHAR}, #{regDate})
			""")
	int insertUser(User user);
}
