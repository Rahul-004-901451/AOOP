package com.example.servicelocator;

public class Main {
	public static void main(String[] args) {
        // Register services
        ServiceLocator.registerService(new ServiceA());
        ServiceLocator.registerService(new ServiceB());

        // Retrieve and use services
        Service service1 = ServiceLocator.getService("ServiceA");
        service1.execute();

        Service service2 = ServiceLocator.getService("ServiceB");
        service2.execute();
    }
}
