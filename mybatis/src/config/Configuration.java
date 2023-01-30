package config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Configuration {
	private static SqlSessionFactory sqlSessionFactory;
	
	//static 이므로 byte code roading시 읽혀진다.
	static {
		try {
			// xml문서의 객체화
			Reader reader = Resources.getResourceAsReader("config/sqlMapConfig.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static <T> T getMapper(Class<T> arg) {
		//openSesstion을 통해 true(auto commit) 설정했다.
		//Mapper pool 내에서 mapper 객체들 중에
		//arg type의 mapper만 골라내는 작업을
		//sqlsessionfactory로 찾아낸 session 객체에 시킨다.
		return sqlSessionFactory.openSession(true).getMapper(arg);
	}
}
