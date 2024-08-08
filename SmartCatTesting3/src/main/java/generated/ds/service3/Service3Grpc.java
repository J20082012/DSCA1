package generated.ds.service3;

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
    comments = "Source: service3.proto")
public final class Service3Grpc {

  private Service3Grpc() {}

  public static final String SERVICE_NAME = "service3.Service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.ds.service3.DriverStatusRequest,
      generated.ds.service3.DriverStatusResponse> getDriverStatusUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DriverStatusUpdate",
      requestType = generated.ds.service3.DriverStatusRequest.class,
      responseType = generated.ds.service3.DriverStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ds.service3.DriverStatusRequest,
      generated.ds.service3.DriverStatusResponse> getDriverStatusUpdateMethod() {
    io.grpc.MethodDescriptor<generated.ds.service3.DriverStatusRequest, generated.ds.service3.DriverStatusResponse> getDriverStatusUpdateMethod;
    if ((getDriverStatusUpdateMethod = Service3Grpc.getDriverStatusUpdateMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getDriverStatusUpdateMethod = Service3Grpc.getDriverStatusUpdateMethod) == null) {
          Service3Grpc.getDriverStatusUpdateMethod = getDriverStatusUpdateMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service3.DriverStatusRequest, generated.ds.service3.DriverStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "DriverStatusUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service3.DriverStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service3.DriverStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("DriverStatusUpdate"))
                  .build();
          }
        }
     }
     return getDriverStatusUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ds.service3.RiskLevelRequest,
      generated.ds.service3.RiskAlarmResponse> getRiskAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RiskAlarm",
      requestType = generated.ds.service3.RiskLevelRequest.class,
      responseType = generated.ds.service3.RiskAlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.ds.service3.RiskLevelRequest,
      generated.ds.service3.RiskAlarmResponse> getRiskAlarmMethod() {
    io.grpc.MethodDescriptor<generated.ds.service3.RiskLevelRequest, generated.ds.service3.RiskAlarmResponse> getRiskAlarmMethod;
    if ((getRiskAlarmMethod = Service3Grpc.getRiskAlarmMethod) == null) {
      synchronized (Service3Grpc.class) {
        if ((getRiskAlarmMethod = Service3Grpc.getRiskAlarmMethod) == null) {
          Service3Grpc.getRiskAlarmMethod = getRiskAlarmMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service3.RiskLevelRequest, generated.ds.service3.RiskAlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.Service3", "RiskAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service3.RiskLevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service3.RiskAlarmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service3MethodDescriptorSupplier("RiskAlarm"))
                  .build();
          }
        }
     }
     return getRiskAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service3Stub newStub(io.grpc.Channel channel) {
    return new Service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service3FutureStub(channel);
  }

  /**
   */
  public static abstract class Service3ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void driverStatusUpdate(generated.ds.service3.DriverStatusRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service3.DriverStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDriverStatusUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.ds.service3.RiskLevelRequest> riskAlarm(
        io.grpc.stub.StreamObserver<generated.ds.service3.RiskAlarmResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRiskAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDriverStatusUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ds.service3.DriverStatusRequest,
                generated.ds.service3.DriverStatusResponse>(
                  this, METHODID_DRIVER_STATUS_UPDATE)))
          .addMethod(
            getRiskAlarmMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.ds.service3.RiskLevelRequest,
                generated.ds.service3.RiskAlarmResponse>(
                  this, METHODID_RISK_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class Service3Stub extends io.grpc.stub.AbstractStub<Service3Stub> {
    private Service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void driverStatusUpdate(generated.ds.service3.DriverStatusRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service3.DriverStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDriverStatusUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.ds.service3.RiskLevelRequest> riskAlarm(
        io.grpc.stub.StreamObserver<generated.ds.service3.RiskAlarmResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRiskAlarmMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Service3BlockingStub extends io.grpc.stub.AbstractStub<Service3BlockingStub> {
    private Service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public generated.ds.service3.DriverStatusResponse driverStatusUpdate(generated.ds.service3.DriverStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getDriverStatusUpdateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service3FutureStub extends io.grpc.stub.AbstractStub<Service3FutureStub> {
    private Service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service3FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ds.service3.DriverStatusResponse> driverStatusUpdate(
        generated.ds.service3.DriverStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDriverStatusUpdateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DRIVER_STATUS_UPDATE = 0;
  private static final int METHODID_RISK_ALARM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DRIVER_STATUS_UPDATE:
          serviceImpl.driverStatusUpdate((generated.ds.service3.DriverStatusRequest) request,
              (io.grpc.stub.StreamObserver<generated.ds.service3.DriverStatusResponse>) responseObserver);
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
        case METHODID_RISK_ALARM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.riskAlarm(
              (io.grpc.stub.StreamObserver<generated.ds.service3.RiskAlarmResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ds.service3.Service3Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service3");
    }
  }

  private static final class Service3FileDescriptorSupplier
      extends Service3BaseDescriptorSupplier {
    Service3FileDescriptorSupplier() {}
  }

  private static final class Service3MethodDescriptorSupplier
      extends Service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service3FileDescriptorSupplier())
              .addMethod(getDriverStatusUpdateMethod())
              .addMethod(getRiskAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
