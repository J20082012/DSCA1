package ds.service2;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

public class Service2Registration {

    private JmDNS jmdns;
    private ServiceInfo serviceInfo;

    public void registerService() {
        try {
            // Create a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service with a unique name
            serviceInfo = ServiceInfo.create("_http._tcp.local.", "service2", 50052, "path=/Navigation");
            jmdns.registerService(serviceInfo);

            System.out.println("Service2 registered.");
        } catch (IOException e) {
            Logger.getLogger(Service2Registration.class.getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public boolean isServiceRegistered() {
        if (jmdns != null && serviceInfo != null) {
            ServiceInfo registeredServiceInfo = jmdns.getServiceInfo(serviceInfo.getType(), serviceInfo.getName());
            if (registeredServiceInfo != null) {
                System.out.println("Service2 registration successful. Host: " + registeredServiceInfo.getHostAddresses()[0] + " Port: " + registeredServiceInfo.getPort());
                return true;
            } else {
                System.out.println("Service2 registration failed.");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Service2Registration service2Registration = new Service2Registration();
        service2Registration.registerService();

        // Check if the service is registered
        boolean isRegistered = service2Registration.isServiceRegistered();
        System.out.println("Service registration status: " + (isRegistered ? "Successful" : "Failed"));
    }
}
