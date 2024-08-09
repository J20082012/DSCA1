package ds.service3;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class Service3Discovery {

    private ServiceInfo serviceInfo;

    private class SampleListener implements ServiceListener {
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            serviceInfo = event.getInfo();
            System.out.println("Host: " + serviceInfo.getHostAddresses()[0] + " Port: " + serviceInfo.getPort());
        }
    }

    public void discoverService() {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());

            // Wait for the service to be discovered
            Thread.sleep(30000);

        } catch (IOException | InterruptedException e) {
            Logger.getLogger(Service3Discovery.class.getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    // Method to check if service discovery was successful
    public boolean isServiceDiscovered() {
        if (serviceInfo != null) {
            System.out.println("Service discovery successful. Host: " + serviceInfo.getHostAddresses()[0] + " Port: " + serviceInfo.getPort());
            return true;
        } else {
            System.out.println("Service discovery failed.");
            return false;
        }
    }

    public static void main(String[] args) {
        Service3Discovery service3Discovery = new Service3Discovery();
        service3Discovery.discoverService();

        // Check if the service was discovered successfully
        boolean isDiscovered = service3Discovery.isServiceDiscovered();
        System.out.println("Service discovery status: " + (isDiscovered ? "Successful" : "Failed"));
    }
}
