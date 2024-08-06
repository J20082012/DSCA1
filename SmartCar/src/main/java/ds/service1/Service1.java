package ds.service1;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

import generated.ds.service1.HornRequest;
import generated.ds.service1.HornResponse;
import generated.ds.service1.HornStatusRequest;
import generated.ds.service1.HornStatusResponse;
import generated.ds.service1.Service1Grpc.Service1ImplBase;

public class Service1 extends Service1ImplBase {

    @Override
    public void activateHorn(HornRequest request, StreamObserver<HornResponse> responseObserver) {
        String vehicleID = request.getVehicleID();
        // Logic to activate the horn for the vehicle with the given vehicleID
        boolean confirmation = true; // Assuming activation is successful

        HornResponse response = HornResponse.newBuilder()
                .setActivateConfirmation(confirmation)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void retrieveHornStatus(HornStatusRequest request, StreamObserver<HornStatusResponse> responseObserver) {
        String vehicleID = request.getVehicleID();
        // Logic to retrieve the horn status for the vehicle with the given vehicleID
        String hornStatus = "Active"; // Assuming the horn status is active

        HornStatusResponse response = HornStatusResponse.newBuilder()
                .setHornStatus(hornStatus)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(50051)
                    .addService(new Service1())
                    .build()
                    .start();
            System.out.println("Server started, listening on " + server.getPort());

            // Server will keep running until JVM is shut down
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
