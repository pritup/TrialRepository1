package com.test.cucumberproject.MavenProject;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

	@RunWith (Cucumber.class)
	@Cucumber.Options(
	        format = {"html:target1/cucumber-html-report","json-pretty:target1/cucumber-report.json"})
//	@Cucumber.Options(format={"html:output"})
		public class ExecuteClass 
		{
		
		}
