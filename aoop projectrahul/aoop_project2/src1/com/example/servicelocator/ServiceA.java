package com.example.servicelocator;

public class ServiceA implements Service {

	  @Override
	    public void execute() {
	        System.out.println("Executing Service A");
	    }

	    @Override
	    public String getName() {
	        return "ServiceA";
	    }
	}
