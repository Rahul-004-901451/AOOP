package com.example.servicelocator;

public class ServiceB implements Service{
	 @Override
	    public void execute() {
	        System.out.println("Executing Service B");
	    }

	    @Override
	    public String getName() {
	        return "ServiceB";
	    }
}
