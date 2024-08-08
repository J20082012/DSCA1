package generated.ds.service1;

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
    comments = "Source: service1.proto")
public final class Service1Grpc {

  private Service1Grpc() {}

  public static final String SERVICE_NAME = "service1.Service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.ds.service1.HornRequest,
      generated.ds.service1.HornResponse> getActivateHornMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateHorn",
      requestType = generated.ds.service1.HornRequest.class,
      responseType = generated.ds.service1.HornResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ds.service1.HornRequest,
      generated.ds.service1.HornResponse> getActivateHornMethod() {
    io.grpc.MethodDescriptor<generated.ds.service1.HornRequest, generated.ds.service1.HornResponse> getActivateHornMethod;
    if ((getActivateHornMethod = Service1Grpc.getActivateHornMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getActivateHornMethod = Service1Grpc.getActivateHornMethod) == null) {
          Service1Grpc.getActivateHornMethod = getActivateHornMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service1.HornRequest, generated.ds.service1.HornResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "ActivateHorn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service1.HornRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service1.HornResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("ActivateHorn"))
                  .build();
          }
        }
     }
     return getActivateHornMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ds.service1.HornStatusRequest,
      generated.ds.service1.HornStatusResponse> getRetrieveHornStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveHornStatus",
      requestType = generated.ds.service1.HornStatusRequest.class,
      responseType = generated.ds.service1.HornStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ds.service1.HornStatusRequest,
      generated.ds.service1.HornStatusResponse> getRetrieveHornStatusMethod() {
    io.grpc.MethodDescriptor<generated.ds.service1.HornStatusRequest, generated.ds.service1.HornStatusResponse> getRetrieveHornStatusMethod;
    if ((getRetrieveHornStatusMethod = Service1Grpc.getRetrieveHornStatusMethod) == null) {
      synchronized (Service1Grpc.class) {
        if ((getRetrieveHornStatusMethod = Service1Grpc.getRetrieveHornStatusMethod) == null) {
          Service1Grpc.getRetrieveHornStatusMethod = getRetrieveHornStatusMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service1.HornStatusRequest, generated.ds.service1.HornStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.Service1", "RetrieveHornStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service1.HornStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service1.HornStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Service1MethodDescriptorSupplier("RetrieveHornStatus"))
                  .build();
          }
        }
     }
     return getRetrieveHornStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service1Stub newStub(io.grpc.Channel channel) {
    return new Service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service1FutureStub(channel);
  }

  /**
   */
  public static abstract class Service1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void activateHorn(generated.ds.service1.HornRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service1.HornResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateHornMethod(), responseObserver);
    }

    /**
     */
    public void retrieveHornStatus(generated.ds.service1.HornStatusRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service1.HornStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveHornStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActivateHornMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ds.service1.HornRequest,
                generated.ds.service1.HornResponse>(
                  this, METHODID_ACTIVATE_HORN)))
          .addMethod(
            getRetrieveHornStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ds.service1.HornStatusRequest,
                generated.ds.service1.HornStatusResponse>(
                  this, METHODID_RETRIEVE_HORN_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class Service1Stub extends io.grpc.stub.AbstractStub<Service1Stub> {
    private Service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1Stub(channel, callOptions);
    }

    /**
     */
    public void activateHorn(generated.ds.service1.HornRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service1.HornResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateHornMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveHornStatus(generated.ds.service1.HornStatusRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service1.HornStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveHornStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Service1BlockingStub extends io.grpc.stub.AbstractStub<Service1BlockingStub> {
    private Service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1BlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.ds.service1.HornResponse activateHorn(generated.ds.service1.HornRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateHornMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.ds.service1.HornStatusResponse retrieveHornStatus(generated.ds.service1.HornStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveHornStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Service1FutureStub extends io.grpc.stub.AbstractStub<Service1FutureStub> {
    private Service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ds.service1.HornResponse> activateHorn(
        generated.ds.service1.HornRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateHornMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ds.service1.HornStatusResponse> retrieveHornStatus(
        generated.ds.service1.HornStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveHornStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTIVATE_HORN = 0;
  private static final int METHODID_RETRIEVE_HORN_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTIVATE_HORN:
          serviceImpl.activateHorn((generated.ds.service1.HornRequest) request,
              (io.grpc.stub.StreamObserver<generated.ds.service1.HornResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_HORN_STATUS:
          serviceImpl.retrieveHornStatus((generated.ds.service1.HornStatusRequest) request,
              (io.grpc.stub.StreamObserver<generated.ds.service1.HornStatusResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ds.service1.Service1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service1");
    }
  }

  private static final class Service1FileDescriptorSupplier
      extends Service1BaseDescriptorSupplier {
    Service1FileDescriptorSupplier() {}
  }

  private static final class Service1MethodDescriptorSupplier
      extends Service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service1FileDescriptorSupplier())
              .addMethod(getActivateHornMethod())
              .addMethod(getRetrieveHornStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
