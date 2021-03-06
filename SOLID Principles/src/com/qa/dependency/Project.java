package com.qa.dependency;

import java.util.List;

public class Project {
	
	private List<Developer> devs;
	
	public Project() {}
	
	public Project(List<Developer> devs) {
		this.devs = devs;
	}

    public void implement() {
        for (Developer dev : this.devs) {
        	dev.writeCode();
        }
    }
}