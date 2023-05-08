package com.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.dao.Account;
import com.spring.aop.dao.AccountDAO;

public class AfterThrowingMainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new	AnnotationConfigApplicationContext(AopConfig.class);
		
		AccountDAO accoutDAO=context.getBean("accountDAO",AccountDAO.class);
		try
		{
			
		
		List<Account> list=accoutDAO.findAccount(true);
		System.out.println("main app");
		context.close();
	    }
		catch(Exception exc)
		{
			System.out.println(exc);
		}

	
	
	}

}
