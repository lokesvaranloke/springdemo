package com.samples.s06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/s06SpringJdbc/SpringConfig.xml");
        
        JdbcTemplate jdbctemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
        String sql = "insert into employee values (?,?,?)";
        int updateResult = jdbctemplate.update(sql,1,"John","Wilson");
        System.out.println("Number of rows inserted " +updateResult);
    }
}
