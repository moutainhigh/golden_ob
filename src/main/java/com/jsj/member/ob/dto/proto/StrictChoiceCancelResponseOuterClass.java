// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StrictChoiceCancelResponse.proto

package com.jsj.member.ob.dto.proto;

public final class StrictChoiceCancelResponseOuterClass {
  private StrictChoiceCancelResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StrictChoiceCancelResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse)
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
     * <code>optional int32 LockID = 2 [default = 0];</code>
     */
    boolean hasLockID();
    /**
     * <code>optional int32 LockID = 2 [default = 0];</code>
     */
    int getLockID();
  }
  /**
   * Protobuf type {@code com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse}
   */
  public static final class StrictChoiceCancelResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse)
      StrictChoiceCancelResponseOrBuilder {
    // Use StrictChoiceCancelResponse.newBuilder() to construct.
    private StrictChoiceCancelResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StrictChoiceCancelResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StrictChoiceCancelResponse defaultInstance;
    public static StrictChoiceCancelResponse getDefaultInstance() {
      return defaultInstance;
    }

    public StrictChoiceCancelResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StrictChoiceCancelResponse(
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
              lockID_ = input.readInt32();
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
      return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.class, com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<StrictChoiceCancelResponse> PARSER =
        new com.google.protobuf.AbstractParser<StrictChoiceCancelResponse>() {
      public StrictChoiceCancelResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StrictChoiceCancelResponse(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<StrictChoiceCancelResponse> getParserForType() {
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

    public static final int LOCKID_FIELD_NUMBER = 2;
    private int lockID_;
    /**
     * <code>optional int32 LockID = 2 [default = 0];</code>
     */
    public boolean hasLockID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 LockID = 2 [default = 0];</code>
     */
    public int getLockID() {
      return lockID_;
    }

    private void initFields() {
      baseResponse_ = BaseResponseOuterClass.BaseResponse.getDefaultInstance();
      lockID_ = 0;
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
        output.writeInt32(2, lockID_);
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
          .computeInt32Size(2, lockID_);
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

    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse prototype) {
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
     * Protobuf type {@code com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse)
        com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.class, com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.Builder.class);
      }

      // Construct using com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.newBuilder()
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
        lockID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor;
      }

      public com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse getDefaultInstanceForType() {
        return com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.getDefaultInstance();
      }

      public com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse build() {
        com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse buildPartial() {
        com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse result = new com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse(this);
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
        result.lockID_ = lockID_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse) {
          return mergeFrom((com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse other) {
        if (other == com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse.getDefaultInstance()) return this;
        if (other.hasBaseResponse()) {
          mergeBaseResponse(other.getBaseResponse());
        }
        if (other.hasLockID()) {
          setLockID(other.getLockID());
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
        com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jsj.member.ob.dto.proto.StrictChoiceCancelResponseOuterClass.StrictChoiceCancelResponse) e.getUnfinishedMessage();
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

      private int lockID_ ;
      /**
       * <code>optional int32 LockID = 2 [default = 0];</code>
       */
      public boolean hasLockID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 LockID = 2 [default = 0];</code>
       */
      public int getLockID() {
        return lockID_;
      }
      /**
       * <code>optional int32 LockID = 2 [default = 0];</code>
       */
      public Builder setLockID(int value) {
        bitField0_ |= 0x00000002;
        lockID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 LockID = 2 [default = 0];</code>
       */
      public Builder clearLockID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lockID_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse)
    }

    static {
      defaultInstance = new StrictChoiceCancelResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jsj.member.ob.dto.proto.StrictChoiceCancelResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n StrictChoiceCancelResponse.proto\022\033com." +
      "jsj.member.ob.dto.proto\032\022BaseResponse.pr" +
      "oto\"p\n\032StrictChoiceCancelResponse\022?\n\014Bas" +
      "eResponse\030\001 \001(\0132).com.jsj.member.ob.dto." +
      "proto.BaseResponse\022\021\n\006LockID\030\002 \001(\005:\0010"
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
    internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jsj_member_ob_dto_proto_StrictChoiceCancelResponse_descriptor,
        new String[] { "BaseResponse", "LockID", });
    BaseResponseOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
