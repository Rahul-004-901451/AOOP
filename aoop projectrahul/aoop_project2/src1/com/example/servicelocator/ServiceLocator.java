package com.example.servicelocator;
import java.util.HashMap;
import java.util.Map;
public class ServiceLocator {

    private static Map<String, Service> services = new HashMap<>();

    // Registers a service
    public static void registerService(Service service) {
        services.put(service.getName(), service);
    }

    // Retrieves a service by name
    public static Service getService(String serviceName) {
        return services.get(serviceName);
    }
}
