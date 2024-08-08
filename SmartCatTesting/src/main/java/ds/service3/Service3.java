package ds.service3;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

import generated.ds.service3.DriverStatusRequest;
import generated.ds.service3.DriverStatusResponse;
import generated.ds.service3.RiskLevelRequest;
import generated.ds.service3.RiskAlarmResponse;
import generated.ds.service3.Service3Grpc.Service3ImplBase;

public class Service3 extends Service3ImplBase {

    @Override
    public void driverStatusUpdate(DriverStatusRequest request, StreamObserver<DriverStatusResponse> responseObserver) {
        String driverID = request.getDriverID();

        // Generate a random number based on the hash code of the driverID
        int hash = driverID.hashCode();
        int randomNumber = Math.abs(hash) % 100; // Ensure the number is between 0 and 99

        // Determine health profile based on the random number
        String healthProfile;
        if (randomNumber < 50) { // Example threshold
            healthProfile = "Healthy";
        } else {
            healthProfile = "Unhealthy";
        }

        DriverStatusResponse response = DriverStatusResponse.newBuilder()
                .setHealthProfile(healthProfile)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RiskLevelRequest> riskAlarm(StreamObserver<RiskAlarmResponse> responseObserver) {
        return new StreamObserver<RiskLevelRequest>() {
            int maxRiskLevel = 0;

            @Override
            public void onNext(RiskLevelRequest request) {
                int riskLevel = request.getRiskLevel();
                // Update maxRiskLevel if the current riskLevel is higher
                if (riskLevel > maxRiskLevel) {
                    maxRiskLevel = riskLevel;
                }
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                // Logic to decide alert action based on maxRiskLevel
                boolean alertAction = maxRiskLevel > 5; // Dummy logic

                RiskAlarmResponse response = RiskAlarmResponse.newBuilder()
                        .setAlertAction(alertAction)
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(50053)
                    .addService(new Service3())
                    .build()
                    .start();
            System.out.println("Service3 started, listening on " + server.getPort());

            // Server will keep running until JVM is shut down
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
