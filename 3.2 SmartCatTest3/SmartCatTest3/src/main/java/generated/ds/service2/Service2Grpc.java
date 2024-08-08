package generated.ds.service2;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.ds.service2.TrafficRequest,
      generated.ds.service2.TrafficResponse> getTrafficUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrafficUpdate",
      requestType = generated.ds.service2.TrafficRequest.class,
      responseType = generated.ds.service2.TrafficResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.ds.service2.TrafficRequest,
      generated.ds.service2.TrafficResponse> getTrafficUpdateMethod() {
    io.grpc.MethodDescriptor<generated.ds.service2.TrafficRequest, generated.ds.service2.TrafficResponse> getTrafficUpdateMethod;
    if ((getTrafficUpdateMethod = Service2Grpc.getTrafficUpdateMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getTrafficUpdateMethod = Service2Grpc.getTrafficUpdateMethod) == null) {
          Service2Grpc.getTrafficUpdateMethod = getTrafficUpdateMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service2.TrafficRequest, generated.ds.service2.TrafficResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "TrafficUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.TrafficRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.TrafficResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("TrafficUpdate"))
                  .build();
          }
        }
     }
     return getTrafficUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ds.service2.PlanningRequest,
      generated.ds.service2.PlanningResponse> getPlanningUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlanningUpdate",
      requestType = generated.ds.service2.PlanningRequest.class,
      responseType = generated.ds.service2.PlanningResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.ds.service2.PlanningRequest,
      generated.ds.service2.PlanningResponse> getPlanningUpdateMethod() {
    io.grpc.MethodDescriptor<generated.ds.service2.PlanningRequest, generated.ds.service2.PlanningResponse> getPlanningUpdateMethod;
    if ((getPlanningUpdateMethod = Service2Grpc.getPlanningUpdateMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getPlanningUpdateMethod = Service2Grpc.getPlanningUpdateMethod) == null) {
          Service2Grpc.getPlanningUpdateMethod = getPlanningUpdateMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service2.PlanningRequest, generated.ds.service2.PlanningResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "PlanningUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.PlanningRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.PlanningResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("PlanningUpdate"))
                  .build();
          }
        }
     }
     return getPlanningUpdateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void trafficUpdate(generated.ds.service2.TrafficRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service2.TrafficResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTrafficUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.ds.service2.PlanningRequest> planningUpdate(
        io.grpc.stub.StreamObserver<generated.ds.service2.PlanningResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPlanningUpdateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTrafficUpdateMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.ds.service2.TrafficRequest,
                generated.ds.service2.TrafficResponse>(
                  this, METHODID_TRAFFIC_UPDATE)))
          .addMethod(
            getPlanningUpdateMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.ds.service2.PlanningRequest,
                generated.ds.service2.PlanningResponse>(
                  this, METHODID_PLANNING_UPDATE)))
          .build();
    }
  }

  /**
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void trafficUpdate(generated.ds.service2.TrafficRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service2.TrafficResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTrafficUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.ds.service2.PlanningRequest> planningUpdate(
        io.grpc.stub.StreamObserver<generated.ds.service2.PlanningResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPlanningUpdateMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public java.util.Iterator<generated.ds.service2.TrafficResponse> trafficUpdate(
        generated.ds.service2.TrafficRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getTrafficUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TRAFFIC_UPDATE = 0;
  private static final int METHODID_PLANNING_UPDATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRAFFIC_UPDATE:
          serviceImpl.trafficUpdate((generated.ds.service2.TrafficRequest) request,
              (io.grpc.stub.StreamObserver<generated.ds.service2.TrafficResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLANNING_UPDATE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.planningUpdate(
              (io.grpc.stub.StreamObserver<generated.ds.service2.PlanningResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getTrafficUpdateMethod())
              .addMethod(getPlanningUpdateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
