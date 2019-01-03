// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetCustomerIdByPhoneRequ.proto

package com.jsj.member.ob.dto.proto;

public final class GetCustomerIdByPhoneRequOuterClass {
  private GetCustomerIdByPhoneRequOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetCustomerIdByPhoneRequOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    boolean hasBaseRequest();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    BaseRequestOuterClass.BaseRequest getBaseRequest();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    BaseRequestOuterClass.BaseRequestOrBuilder getBaseRequestOrBuilder();

    /**
     * <code>optional string Phone = 2;</code>
     */
    boolean hasPhone();
    /**
     * <code>optional string Phone = 2;</code>
     */
    String getPhone();
    /**
     * <code>optional string Phone = 2;</code>
     */
    com.google.protobuf.ByteString
        getPhoneBytes();
  }
  /**
   * Protobuf type {@code com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ}
   */
  public static final class GetCustomerIdByPhoneRequ extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ)
      GetCustomerIdByPhoneRequOrBuilder {
    // Use GetCustomerIdByPhoneRequ.newBuilder() to construct.
    private GetCustomerIdByPhoneRequ(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetCustomerIdByPhoneRequ(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetCustomerIdByPhoneRequ defaultInstance;
    public static GetCustomerIdByPhoneRequ getDefaultInstance() {
      return defaultInstance;
    }

    public GetCustomerIdByPhoneRequ getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetCustomerIdByPhoneRequ(
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
              BaseRequestOuterClass.BaseRequest.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = baseRequest_.toBuilder();
              }
              baseRequest_ = input.readMessage(BaseRequestOuterClass.BaseRequest.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseRequest_);
                baseRequest_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              phone_ = bs;
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
      return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.class, com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.Builder.class);
    }

    public static com.google.protobuf.Parser<GetCustomerIdByPhoneRequ> PARSER =
        new com.google.protobuf.AbstractParser<GetCustomerIdByPhoneRequ>() {
      public GetCustomerIdByPhoneRequ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetCustomerIdByPhoneRequ(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<GetCustomerIdByPhoneRequ> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BASEREQUEST_FIELD_NUMBER = 1;
    private BaseRequestOuterClass.BaseRequest baseRequest_;
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    public boolean hasBaseRequest() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    public BaseRequestOuterClass.BaseRequest getBaseRequest() {
      return baseRequest_;
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
     */
    public BaseRequestOuterClass.BaseRequestOrBuilder getBaseRequestOrBuilder() {
      return baseRequest_;
    }

    public static final int PHONE_FIELD_NUMBER = 2;
    private Object phone_;
    /**
     * <code>optional string Phone = 2;</code>
     */
    public boolean hasPhone() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string Phone = 2;</code>
     */
    public String getPhone() {
      Object ref = phone_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          phone_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string Phone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      baseRequest_ = BaseRequestOuterClass.BaseRequest.getDefaultInstance();
      phone_ = "";
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
        output.writeMessage(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPhoneBytes());
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
          .computeMessageSize(1, baseRequest_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPhoneBytes());
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

    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ prototype) {
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
     * Protobuf type {@code com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ)
        com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.class, com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.Builder.class);
      }

      // Construct using com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.newBuilder()
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
          getBaseRequestFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (baseRequestBuilder_ == null) {
          baseRequest_ = BaseRequestOuterClass.BaseRequest.getDefaultInstance();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        phone_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor;
      }

      public com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ getDefaultInstanceForType() {
        return com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.getDefaultInstance();
      }

      public com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ build() {
        com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ buildPartial() {
        com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ result = new com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (baseRequestBuilder_ == null) {
          result.baseRequest_ = baseRequest_;
        } else {
          result.baseRequest_ = baseRequestBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.phone_ = phone_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ) {
          return mergeFrom((com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ other) {
        if (other == com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ.getDefaultInstance()) return this;
        if (other.hasBaseRequest()) {
          mergeBaseRequest(other.getBaseRequest());
        }
        if (other.hasPhone()) {
          bitField0_ |= 0x00000002;
          phone_ = other.phone_;
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
        com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequOuterClass.GetCustomerIdByPhoneRequ) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private BaseRequestOuterClass.BaseRequest baseRequest_ = BaseRequestOuterClass.BaseRequest.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          BaseRequestOuterClass.BaseRequest, BaseRequestOuterClass.BaseRequest.Builder, BaseRequestOuterClass.BaseRequestOrBuilder> baseRequestBuilder_;
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public boolean hasBaseRequest() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public BaseRequestOuterClass.BaseRequest getBaseRequest() {
        if (baseRequestBuilder_ == null) {
          return baseRequest_;
        } else {
          return baseRequestBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(BaseRequestOuterClass.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseRequest_ = value;
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public Builder setBaseRequest(
          BaseRequestOuterClass.BaseRequest.Builder builderForValue) {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = builderForValue.build();
          onChanged();
        } else {
          baseRequestBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public Builder mergeBaseRequest(BaseRequestOuterClass.BaseRequest value) {
        if (baseRequestBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              baseRequest_ != BaseRequestOuterClass.BaseRequest.getDefaultInstance()) {
            baseRequest_ =
              BaseRequestOuterClass.BaseRequest.newBuilder(baseRequest_).mergeFrom(value).buildPartial();
          } else {
            baseRequest_ = value;
          }
          onChanged();
        } else {
          baseRequestBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public Builder clearBaseRequest() {
        if (baseRequestBuilder_ == null) {
          baseRequest_ = BaseRequestOuterClass.BaseRequest.getDefaultInstance();
          onChanged();
        } else {
          baseRequestBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public BaseRequestOuterClass.BaseRequest.Builder getBaseRequestBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBaseRequestFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      public BaseRequestOuterClass.BaseRequestOrBuilder getBaseRequestOrBuilder() {
        if (baseRequestBuilder_ != null) {
          return baseRequestBuilder_.getMessageOrBuilder();
        } else {
          return baseRequest_;
        }
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BaseRequest BaseRequest = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          BaseRequestOuterClass.BaseRequest, BaseRequestOuterClass.BaseRequest.Builder, BaseRequestOuterClass.BaseRequestOrBuilder>
          getBaseRequestFieldBuilder() {
        if (baseRequestBuilder_ == null) {
          baseRequestBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              BaseRequestOuterClass.BaseRequest, BaseRequestOuterClass.BaseRequest.Builder, BaseRequestOuterClass.BaseRequestOrBuilder>(
                  getBaseRequest(),
                  getParentForChildren(),
                  isClean());
          baseRequest_ = null;
        }
        return baseRequestBuilder_;
      }

      private Object phone_ = "";
      /**
       * <code>optional string Phone = 2;</code>
       */
      public boolean hasPhone() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string Phone = 2;</code>
       */
      public String getPhone() {
        Object ref = phone_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            phone_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string Phone = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneBytes() {
        Object ref = phone_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          phone_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string Phone = 2;</code>
       */
      public Builder setPhone(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        phone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string Phone = 2;</code>
       */
      public Builder clearPhone() {
        bitField0_ = (bitField0_ & ~0x00000002);
        phone_ = getDefaultInstance().getPhone();
        onChanged();
        return this;
      }
      /**
       * <code>optional string Phone = 2;</code>
       */
      public Builder setPhoneBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        phone_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ)
    }

    static {
      defaultInstance = new GetCustomerIdByPhoneRequ(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jsj.member.ob.dto.proto.GetCustomerIdByPhoneRequ)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\036GetCustomerIdByPhoneRequ.proto\022\033com.js" +
      "j.member.ob.dto.proto\032\021BaseRequest.proto" +
      "\"h\n\030GetCustomerIdByPhoneRequ\022=\n\013BaseRequ" +
      "est\030\001 \001(\0132(.com.jsj.member.ob.dto.proto." +
      "BaseRequest\022\r\n\005Phone\030\002 \001(\t"
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
          BaseRequestOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jsj_member_ob_dto_proto_GetCustomerIdByPhoneRequ_descriptor,
        new String[] { "BaseRequest", "Phone", });
    BaseRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
