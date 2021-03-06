// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddServiceResponse.proto

package com.jsj.member.ob.dto.proto;

public final class AddServiceResponseOuterClass {
  private AddServiceResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AddServiceResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jsj.member.ob.dto.proto.AddServiceResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    boolean hasBaseResponse();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    BaseResponseOuterClass.BaseResponse getBaseResponse();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    BaseResponseOuterClass.BaseResponseOrBuilder getBaseResponseOrBuilder();

    /**
     * <code>optional bool ResultFlag = 2 [default = false];</code>
     */
    boolean hasResultFlag();
    /**
     * <code>optional bool ResultFlag = 2 [default = false];</code>
     */
    boolean getResultFlag();

    /**
     * <code>optional string message = 3;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    String getMessage();
    /**
     * <code>optional string message = 3;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code com.jsj.member.ob.dto.proto.AddServiceResponse}
   */
  public static final class AddServiceResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jsj.member.ob.dto.proto.AddServiceResponse)
      AddServiceResponseOrBuilder {
    // Use AddServiceResponse.newBuilder() to construct.
    private AddServiceResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AddServiceResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AddServiceResponse defaultInstance;
    public static AddServiceResponse getDefaultInstance() {
      return defaultInstance;
    }

    public AddServiceResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AddServiceResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              BaseResponseOuterClass.BaseResponse.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseResponse_.toBuilder();
              }
              baseResponse_ = input.readMessage(BaseResponseOuterClass.BaseResponse.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseResponse_);
                baseResponse_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              resultFlag_ = input.readBool();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              message_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.class, com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<AddServiceResponse> PARSER =
        new com.google.protobuf.AbstractParser<AddServiceResponse>() {
      public AddServiceResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddServiceResponse(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<AddServiceResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BASERESPONSE_FIELD_NUMBER = 1;
    private BaseResponseOuterClass.BaseResponse baseResponse_;
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    public BaseResponseOuterClass.BaseResponse getBaseResponse() {
      return baseResponse_;
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
     */
    public BaseResponseOuterClass.BaseResponseOrBuilder getBaseResponseOrBuilder() {
      return baseResponse_;
    }

    public static final int RESULTFLAG_FIELD_NUMBER = 2;
    private boolean resultFlag_;
    /**
     * <code>optional bool ResultFlag = 2 [default = false];</code>
     */
    public boolean hasResultFlag() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool ResultFlag = 2 [default = false];</code>
     */
    public boolean getResultFlag() {
      return resultFlag_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 3;
    private Object message_;
    /**
     * <code>optional string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      baseResponse_ = BaseResponseOuterClass.BaseResponse.getDefaultInstance();
      resultFlag_ = false;
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, resultFlag_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, baseResponse_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, resultFlag_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @Override
    protected Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.jsj.member.ob.dto.proto.AddServiceResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jsj.member.ob.dto.proto.AddServiceResponse)
        com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.class, com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.Builder.class);
      }

      // Construct using com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBaseResponseFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseResponseBuilder_ == null) {
          baseResponse_ = BaseResponseOuterClass.BaseResponse.getDefaultInstance();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        resultFlag_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor;
      }

      public com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse getDefaultInstanceForType() {
        return com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.getDefaultInstance();
      }

      public com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse build() {
        com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse buildPartial() {
        com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse result = new com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseResponseBuilder_ == null) {
          result.baseResponse_ = baseResponse_;
        } else {
          result.baseResponse_ = baseResponseBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.resultFlag_ = resultFlag_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse) {
          return mergeFrom((com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse other) {
        if (other == com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.hasResultFlag()) {
          setResultFlag(other.getResultFlag());
        }
        if (other.hasMessage()) {
          bitField0_ |= 0x00000004;
          message_ = other.message_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jsj.member.ob.dto.proto.AddServiceResponseOuterClass.AddServiceResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private BaseResponseOuterClass.BaseResponse baseResponse_ = BaseResponseOuterClass.BaseResponse.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          BaseResponseOuterClass.BaseResponse, BaseResponseOuterClass.BaseResponse.Builder, BaseResponseOuterClass.BaseResponseOrBuilder> baseResponseBuilder_;
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public boolean hasBaseResponse() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public BaseResponseOuterClass.BaseResponse getBaseResponse() {
        if (baseResponseBuilder_ == null) {
          return baseResponse_;
        } else {
          return baseResponseBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(BaseResponseOuterClass.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseResponse_ = value;
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public Builder setBaseResponse(
          BaseResponseOuterClass.BaseResponse.Builder builderForValue) {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = builderForValue.build();
          onChanged();
        } else {
          baseResponseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public Builder mergeBaseResponse(BaseResponseOuterClass.BaseResponse value) {
        if (baseResponseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseResponse_ != BaseResponseOuterClass.BaseResponse.getDefaultInstance()) {
            baseResponse_ =
              BaseResponseOuterClass.BaseResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
          } else {
            baseResponse_ = value;
          }
          onChanged();
        } else {
          baseResponseBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public Builder clearBaseResponse() {
        if (baseResponseBuilder_ == null) {
          baseResponse_ = BaseResponseOuterClass.BaseResponse.getDefaultInstance();
          onChanged();
        } else {
          baseResponseBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public BaseResponseOuterClass.BaseResponse.Builder getBaseResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      public BaseResponseOuterClass.BaseResponseOrBuilder getBaseResponseOrBuilder() {
        if (baseResponseBuilder_ != null) {
          return baseResponseBuilder_.getMessageOrBuilder();
        } else {
          return baseResponse_;
        }
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseResponse BaseResponse = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          BaseResponseOuterClass.BaseResponse, BaseResponseOuterClass.BaseResponse.Builder, BaseResponseOuterClass.BaseResponseOrBuilder>
          getBaseResponseFieldBuilder() {
        if (baseResponseBuilder_ == null) {
          baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              BaseResponseOuterClass.BaseResponse, BaseResponseOuterClass.BaseResponse.Builder, BaseResponseOuterClass.BaseResponseOrBuilder>(
                  getBaseResponse(),
                  getParentForChildren(),
                  isClean());
          baseResponse_ = null;
        }
        return baseResponseBuilder_;
      }

      private boolean resultFlag_ ;
      /**
       * <code>optional bool ResultFlag = 2 [default = false];</code>
       */
      public boolean hasResultFlag() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool ResultFlag = 2 [default = false];</code>
       */
      public boolean getResultFlag() {
        return resultFlag_;
      }
      /**
       * <code>optional bool ResultFlag = 2 [default = false];</code>
       */
      public Builder setResultFlag(boolean value) {
        bitField0_ |= 0x00000002;
        resultFlag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool ResultFlag = 2 [default = false];</code>
       */
      public Builder clearResultFlag() {
        bitField0_ = (bitField0_ & ~0x00000002);
        resultFlag_ = false;
        onChanged();
        return this;
      }

      private Object message_ = "";
      /**
       * <code>optional string message = 3;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public String getMessage() {
        Object ref = message_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessage(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>optional string message = 3;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jsj.member.ob.dto.proto.AddServiceResponse)
    }

    static {
      defaultInstance = new AddServiceResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jsj.member.ob.dto.proto.AddServiceResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030AddServiceResponse.proto\022\033com.jsj.memb" +
      "er.ob.dto.proto\032\022BaseResponse.proto\"\201\001\n\022" +
      "AddServiceResponse\022?\n\014BaseResponse\030\001 \001(\013" +
      "2).com.jsj.member.ob.dto.proto.BaseRespo" +
      "nse\022\031\n\nResultFlag\030\002 \001(\010:\005false\022\017\n\007messag" +
      "e\030\003 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          BaseResponseOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jsj_member_ob_dto_proto_AddServiceResponse_descriptor,
        new String[] { "BaseResponse", "ResultFlag", "Message", });
    BaseResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
