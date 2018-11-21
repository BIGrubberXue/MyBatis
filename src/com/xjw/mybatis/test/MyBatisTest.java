package com.xjw.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.xjw.mybatis.bean.Employee;

class MyBatisTest {

	@Test
	void test() throws IOException {
		String resource = "mybatis-config.xml"; 
		InputStream inputStream = Resources.getResourceAsStream(resource); 
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			Employee employee =openSession.selectOne("com.xjw.mybatis.EmployeeMapper.selectEmp", 1);
			System.out.println(employee);
		}finally {
			openSession.close();
		}
	}

}
