/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testcase.utilmodule;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 
 * @author fjaekel
 */
@WebListener
public class ContextListener implements ServletContextListener
{
	public static String TEST_STRING = "listener not initialized";

	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		TEST_STRING = "listener initialized";
		System.out.println(TEST_STRING);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		TEST_STRING = "listener destroyed";
		System.out.println(TEST_STRING);
	}
}
