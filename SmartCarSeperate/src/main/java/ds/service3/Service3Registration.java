package ds.service3;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Service3Registration {

    private JmDNS jmdns;
    private ServiceInfo serviceInfo;

    public void registerService() {
        try {
            // Create a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service with a unique name
            serviceInfo = ServiceInfo.create("_http._tcp.local.", "service3", 50053, "path=/Health");
            jmdns.registerService(serviceInfo);

            System.out.println("Service3 registered.");
        } catch (IOException e) {
            Logger.getLogger(Service3Registration.class.getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public boolean isServiceRegistered() {
        if (jmdns != null && serviceInfo != null) {
            ServiceInfo registeredServiceInfo = jmdns.getServiceInfo(serviceInfo.getType(), serviceInfo.getName());
            if (registeredServiceInfo != null) {
                System.out.println("Service3 registration successful. Host: " + registeredServiceInfo.getHostAddresses()[0] + " Port: " + registeredServiceInfo.getPort());
                return true;
            } else {
                System.out.println("Service3 registration failed.");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Service3Registration service3Registration = new Service3Registration();
        service3Registration.registerService();

        // Check if the service is registered
        boolean isRegistered = service3Registration.isServiceRegistered();
        System.out.println("Service registration status: " + (isRegistered ? "Successful" : "Failed"));
    }
}
