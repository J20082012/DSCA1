package ds.service2;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import generated.ds.service2.Service2Grpc;
import generated.ds.service2.TrafficRequest;
import generated.ds.service2.TrafficResponse;
import generated.ds.service2.PlanningRequest;
import generated.ds.service2.PlanningResponse;

public class Service2 extends Service2Grpc.Service2ImplBase {

    @Override
    public void trafficUpdate(TrafficRequest request, StreamObserver<TrafficResponse> responseObserver) {
        String startingPoint = request.getStartingPoint();
        String destinationPoint = request.getDestinationPoint();

        // Dummy logic for current location
        String currentLocation = "Current Location for route from " + startingPoint + " to " + destinationPoint;

        TrafficResponse response = TrafficResponse.newBuilder()
                .setCurrentLocation(currentLocation)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<PlanningRequest> planningUpdate(StreamObserver<PlanningResponse> responseObserver) {
        return new StreamObserver<PlanningRequest>() {
            List<String> locations = new ArrayList<>();

            @Override
            public void onNext(PlanningRequest request) {
                locations.add(request.getCurrentLocation());
                // Dummy advice based on location
                String advice = "Advice for location: " + request.getCurrentLocation();

                PlanningResponse response = PlanningResponse.newBuilder()
                        .setRouteChangeAdvice(advice)
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) {
        try {
            Server server = ServerBuilder.forPort(50052)
                    .addService(new Service2())
                    .build()
                    .start();
            System.out.println("Service2 started, listening on " + server.getPort());

            // Server will keep running until JVM is shut down
            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
