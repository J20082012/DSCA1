package ds.service1;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Service1Registration {

    private JmDNS jmdns;
    private ServiceInfo serviceInfo;

    public void registerService() {
        try {
            // Create a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service with a unique name
            serviceInfo = ServiceInfo.create("_http._tcp.local.", "service1", 50051, "path=/Horn");
            jmdns.registerService(serviceInfo);

            System.out.println("Service1 registered.");
        } catch (IOException e) {
            Logger.getLogger(Service1Registration.class.getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public boolean isServiceRegistered() {
        if (jmdns != null && serviceInfo != null) {
            ServiceInfo registeredServiceInfo = jmdns.getServiceInfo(serviceInfo.getType(), serviceInfo.getName());
            if (registeredServiceInfo != null) {
                System.out.println("Service1 registration successful. Host: " + registeredServiceInfo.getHostAddresses()[0] + " Port: " + registeredServiceInfo.getPort());
                return true;
            } else {
                System.out.println("Service1 registration failed.");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Service1Registration service1Registration = new Service1Registration();
        service1Registration.registerService();

        // Check if the service is registered
        boolean isRegistered = service1Registration.isServiceRegistered();
        System.out.println("Service registration status: " + (isRegistered ? "Successful" : "Failed"));
    }
}
