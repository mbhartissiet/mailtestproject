package com.testngscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunner {

	public static void main(String[] args) {

    TestNG obj = new TestNG();
    //define a list
    List<String> suites = new ArrayList<String>();
    suites.add("F:\\workstaion\\MailTest\\testngRun1.xml");
    suites.add("F:\\workstaion\\MailTest\\testngRun2.xml");
    //set suite to run
    obj.setTestSuites(suites);
    //call the run method
    obj.run();

	}

}
