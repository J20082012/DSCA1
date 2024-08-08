package ds.client;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import generated.ds.service1.Service1Grpc;
import generated.ds.service1.HornRequest;
import generated.ds.service1.HornResponse;
import generated.ds.service1.HornStatusRequest;
import generated.ds.service1.HornStatusResponse;
import generated.ds.service2.Service2Grpc;
import generated.ds.service2.TrafficRequest;
import generated.ds.service2.TrafficResponse;
import generated.ds.service2.PlanningRequest;
import generated.ds.service2.PlanningResponse;
import generated.ds.service3.Service3Grpc;
import generated.ds.service3.DriverStatusRequest;
import generated.ds.service3.DriverStatusResponse;
import generated.ds.service3.RiskLevelRequest;
import generated.ds.service3.RiskAlarmResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ControllerGUI implements ActionListener {

    private JTextField entry1, reply1;
    private JTextField entry2, reply2;
    private JTextField entry3, reply3;

    private JPanel getService1JPanel() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Enter vehicle ID");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        entry1 = new JTextField("", 10);
        panel.add(entry1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button1 = new JButton("Activate Horn");
        button1.addActionListener(this);
        button1.setActionCommand("Activate Horn");
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button2 = new JButton("Retrieve Horn Status");
        button2.addActionListener(this);
        button2.setActionCommand("Retrieve Horn Status");
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply1 = new JTextField("", 20);
        reply1.setEditable(false);
        panel.add(reply1);

        panel.setLayout(boxlayout);
        return panel;
    }

    private JPanel getService2JPanel() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Enter Route Info (Starting point, Destination point)");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        entry2 = new JTextField("", 20); // Adjusted size for longer input
        panel.add(entry2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button1 = new JButton("Traffic Update");
        button1.addActionListener(this);
        button1.setActionCommand("Traffic Update");
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button2 = new JButton("Planning Update");
        button2.addActionListener(this);
        button2.setActionCommand("Planning Update");
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply2 = new JTextField("", 20);
        reply2.setEditable(false);
        panel.add(reply2);

        panel.setLayout(boxlayout);
        return panel;
    }

    private JPanel getService3JPanel() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Enter driver ID (String) / risk level(Int)");
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        entry3 = new JTextField("", 10);
        panel.add(entry3);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button1 = new JButton("Driver Status Update");
        button1.addActionListener(this);
        button1.setActionCommand("Driver Status Update");
        panel.add(button1);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button2 = new JButton("Risk Alarm");
        button2.addActionListener(this);
        button2.setActionCommand("Risk Alarm");
        panel.add(button2);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        reply3 = new JTextField("", 20);
        reply3.setEditable(false);
        panel.add(reply3);

        panel.setLayout(boxlayout);
        return panel;
    }

    public static void main(String[] args) {
        ControllerGUI gui = new ControllerGUI();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Service Controller Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        //////////////////////////////////////////////////////////////
        // Add title at the top of the panel
           JLabel titleLabel = new JLabel("Smart Car Panel"); // New title label
           titleLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Center alignment
           panel.add(titleLabel); // Add title to the panel
           panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add space below the title
   /////////////////////////////////////////////////////////////////////////////
        panel.add(getService1JPanel());
        panel.add(getService2JPanel());
        panel.add(getService3JPanel()); // Added Service 3 panel
      
        frame.setSize(500, 400); 
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String label = button.getActionCommand();

        final ManagedChannel channel; // Declare channel as final

        try {
            if (label.equals("Activate Horn")) {
                System.out.println("Activating horn for vehicle ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
                Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

                HornRequest request = HornRequest.newBuilder().setVehicleID(entry1.getText()).build();
                HornResponse response = blockingStub.activateHorn(request);
                reply1.setText(String.valueOf(response.getActivateConfirmation()));

            } else if (label.equals("Retrieve Horn Status")) {
                System.out.println("Retrieving horn status for vehicle ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
                Service1Grpc.Service1BlockingStub blockingStub = Service1Grpc.newBlockingStub(channel);

                HornStatusRequest request = HornStatusRequest.newBuilder().setVehicleID(entry1.getText()).build();
                HornStatusResponse response = blockingStub.retrieveHornStatus(request);
                reply1.setText(response.getHornStatus());

            } else if (label.equals("Traffic Update")) {
                System.out.println("Retrieving traffic update ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
                Service2Grpc.Service2BlockingStub blockingStub = Service2Grpc.newBlockingStub(channel);

                String[] points = entry2.getText().split(",");
                if (points.length == 2) {
                    TrafficRequest request = TrafficRequest.newBuilder()
                            .setStartingPoint(points[0].trim())
                            .setDestinationPoint(points[1].trim())
                            .build();
                    Iterator<TrafficResponse> responseIterator = blockingStub.trafficUpdate(request);
                    StringBuilder responses = new StringBuilder();
                    while (responseIterator.hasNext()) {
                        TrafficResponse response = responseIterator.next();
                        responses.append(response.getCurrentLocation()).append(", ");
                    }
                    reply2.setText(responses.toString());
                } else {
                    reply2.setText("Invalid input format. Use 'startingPoint, destinationPoint'.");
                }

            } else if (label.equals("Planning Update")) {
                System.out.println("Sending planning update ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
                Service2Grpc.Service2Stub asyncStub = Service2Grpc.newStub(channel);

                StreamObserver<PlanningRequest> requestObserver = asyncStub.planningUpdate(new StreamObserver<PlanningResponse>() {
                    @Override
                    public void onNext(PlanningResponse response) {
                        reply2.setText(response.getRouteChangeAdvice());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        if (channel != null) {
                            channel.shutdown();
                        }
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Planning update completed.");
                        if (channel != null) {
                            channel.shutdown();
                        }
                    }
                });

                String[] locations = entry2.getText().split(",");
                for (String location : locations) {
                    PlanningRequest request = PlanningRequest.newBuilder()
                            .setCurrentLocation(location.trim())
                            .build();
                    requestObserver.onNext(request);
                }
                requestObserver.onCompleted();

            } else if (label.equals("Driver Status Update")) { // New case for Service 3
                System.out.println("Fetching driver status ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                Service3Grpc.Service3BlockingStub blockingStub = Service3Grpc.newBlockingStub(channel);

                DriverStatusRequest request = DriverStatusRequest.newBuilder().setDriverID(entry3.getText()).build();
                DriverStatusResponse response = blockingStub.driverStatusUpdate(request);
                reply3.setText(response.getHealthProfile());

            } else if (label.equals("Risk Alarm")) { // New case for Service 3
                System.out.println("Streaming risk levels ...");
                channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
                Service3Grpc.Service3Stub asyncStub = Service3Grpc.newStub(channel);

                StreamObserver<RiskLevelRequest> requestObserver = asyncStub.riskAlarm(new StreamObserver<RiskAlarmResponse>() {
                    @Override
                    public void onNext(RiskAlarmResponse response) {
                        reply3.setText(String.valueOf(response.getAlertAction()));
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        if (channel != null) {
                            channel.shutdown();
                        }
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Risk alarm streaming completed.");
                        if (channel != null) {
                            channel.shutdown();
                        }
                    }
                });

                String[] riskLevels = entry3.getText().split(",");
                for (String riskLevel : riskLevels) {
                    RiskLevelRequest request = RiskLevelRequest.newBuilder()
                            .setRiskLevel(Integer.parseInt(riskLevel.trim()))
                            .build();
                    requestObserver.onNext(request);
                }
                requestObserver.onCompleted();
            }
        } finally {
        }
    }
}
