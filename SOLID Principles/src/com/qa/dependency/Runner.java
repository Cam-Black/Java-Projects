package com.qa.dependency;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Developer> devs = new ArrayList<>();
		Project myProj = new Project(devs);
		
		BackendDeveloper backOne = new BackendDeveloper();
		BackendDeveloper backTwo = new BackendDeveloper();
		FrontendDeveloper frontOne = new FrontendDeveloper();
		
		devs.add(backOne);
		devs.add(backTwo);
		devs.add(frontOne);
		
		myProj.implement();
	}
}