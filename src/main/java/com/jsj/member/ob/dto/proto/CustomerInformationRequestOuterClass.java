// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomerInformationRequest.proto

package com.jsj.member.ob.dto.proto;

public final class CustomerInformationRequestOuterClass {
  private CustomerInformationRequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CustomerInformationRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.jsj.member.ob.dto.proto.CustomerInformationRequest)
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
     * <code>optional string JSJID = 2;</code>
     */
    boolean hasJSJID();
    /**
     * <code>optional string JSJID = 2;</code>
     */
    String getJSJID();
    /**
     * <code>optional string JSJID = 2;</code>
     */
    com.google.protobuf.ByteString
        getJSJIDBytes();

    /**
     * <code>optional int32 Type = 3 [default = 0];</code>
     */
    boolean hasType();
    /**
     * <code>optional int32 Type = 3 [default = 0];</code>
     */
    int getType();

    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
     */
    boolean hasBusinessType();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
     */
    BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType getBusinessType();

    /**
     * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
     */
    boolean hasCompanyType();
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
     */
    CompanyTypeOuterClass.CompanyType getCompanyType();
  }
  /**
   * Protobuf type {@code com.jsj.member.ob.dto.proto.CustomerInformationRequest}
   */
  public static final class CustomerInformationRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.jsj.member.ob.dto.proto.CustomerInformationRequest)
      CustomerInformationRequestOrBuilder {
    // Use CustomerInformationRequest.newBuilder() to construct.
    private CustomerInformationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CustomerInformationRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CustomerInformationRequest defaultInstance;
    public static CustomerInformationRequest getDefaultInstance() {
      return defaultInstance;
    }

    public CustomerInformationRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CustomerInformationRequest(
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
              jSJID_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType value = BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                businessType_ = value;
              }
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              CompanyTypeOuterClass.CompanyType value = CompanyTypeOuterClass.CompanyType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                companyType_ = value;
              }
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
      return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.class, com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<CustomerInformationRequest> PARSER =
        new com.google.protobuf.AbstractParser<CustomerInformationRequest>() {
      public CustomerInformationRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomerInformationRequest(input, extensionRegistry);
      }
    };

    @Override
    public com.google.protobuf.Parser<CustomerInformationRequest> getParserForType() {
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

    public static final int JSJID_FIELD_NUMBER = 2;
    private Object jSJID_;
    /**
     * <code>optional string JSJID = 2;</code>
     */
    public boolean hasJSJID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string JSJID = 2;</code>
     */
    public String getJSJID() {
      Object ref = jSJID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          jSJID_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string JSJID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getJSJIDBytes() {
      Object ref = jSJID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        jSJID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>optional int32 Type = 3 [default = 0];</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 Type = 3 [default = 0];</code>
     */
    public int getType() {
      return type_;
    }

    public static final int BUSINESSTYPE_FIELD_NUMBER = 4;
    private BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType businessType_;
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
     */
    public boolean hasBusinessType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
     */
    public BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType getBusinessType() {
      return businessType_;
    }

    public static final int COMPANYTYPE_FIELD_NUMBER = 5;
    private CompanyTypeOuterClass.CompanyType companyType_;
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
     */
    public boolean hasCompanyType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
     */
    public CompanyTypeOuterClass.CompanyType getCompanyType() {
      return companyType_;
    }

    private void initFields() {
      baseRequest_ = BaseRequestOuterClass.BaseRequest.getDefaultInstance();
      jSJID_ = "";
      type_ = 0;
      businessType_ = BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType.BigCustFlight;
      companyType_ = CompanyTypeOuterClass.CompanyType.UnKnow;
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
        output.writeBytes(2, getJSJIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, businessType_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, companyType_.getNumber());
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
          .computeBytesSize(2, getJSJIDBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, businessType_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, companyType_.getNumber());
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

    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest prototype) {
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
     * Protobuf type {@code com.jsj.member.ob.dto.proto.CustomerInformationRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.jsj.member.ob.dto.proto.CustomerInformationRequest)
        com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor;
      }

      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.class, com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.Builder.class);
      }

      // Construct using com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.newBuilder()
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
        jSJID_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        businessType_ = BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType.BigCustFlight;
        bitField0_ = (bitField0_ & ~0x00000008);
        companyType_ = CompanyTypeOuterClass.CompanyType.UnKnow;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor;
      }

      public com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest getDefaultInstanceForType() {
        return com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.getDefaultInstance();
      }

      public com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest build() {
        com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest buildPartial() {
        com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest result = new com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest(this);
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
        result.jSJID_ = jSJID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.businessType_ = businessType_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.companyType_ = companyType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest) {
          return mergeFrom((com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest other) {
        if (other == com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest.getDefaultInstance()) return this;
        if (other.hasBaseRequest()) {
          mergeBaseRequest(other.getBaseRequest());
        }
        if (other.hasJSJID()) {
          bitField0_ |= 0x00000002;
          jSJID_ = other.jSJID_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasBusinessType()) {
          setBusinessType(other.getBusinessType());
        }
        if (other.hasCompanyType()) {
          setCompanyType(other.getCompanyType());
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
        com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.jsj.member.ob.dto.proto.CustomerInformationRequestOuterClass.CustomerInformationRequest) e.getUnfinishedMessage();
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

      private Object jSJID_ = "";
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public boolean hasJSJID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public String getJSJID() {
        Object ref = jSJID_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            jSJID_ = s;
          }
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public com.google.protobuf.ByteString
          getJSJIDBytes() {
        Object ref = jSJID_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          jSJID_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public Builder setJSJID(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        jSJID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public Builder clearJSJID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        jSJID_ = getDefaultInstance().getJSJID();
        onChanged();
        return this;
      }
      /**
       * <code>optional string JSJID = 2;</code>
       */
      public Builder setJSJIDBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        jSJID_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>optional int32 Type = 3 [default = 0];</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 Type = 3 [default = 0];</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>optional int32 Type = 3 [default = 0];</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 Type = 3 [default = 0];</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }

      private BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType businessType_ = BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType.BigCustFlight;
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
       */
      public boolean hasBusinessType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
       */
      public BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType getBusinessType() {
        return businessType_;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
       */
      public Builder setBusinessType(BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        businessType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.BigCustomerBusinessType BusinessType = 4 [default = BigCustFlight];</code>
       */
      public Builder clearBusinessType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        businessType_ = BigCustomerBusinessTypeOuterClass.BigCustomerBusinessType.BigCustFlight;
        onChanged();
        return this;
      }

      private CompanyTypeOuterClass.CompanyType companyType_ = CompanyTypeOuterClass.CompanyType.UnKnow;
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
       */
      public boolean hasCompanyType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
       */
      public CompanyTypeOuterClass.CompanyType getCompanyType() {
        return companyType_;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
       */
      public Builder setCompanyType(CompanyTypeOuterClass.CompanyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        companyType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .com.jsj.member.ob.dto.proto.CompanyType CompanyType = 5 [default = UnKnow];</code>
       */
      public Builder clearCompanyType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        companyType_ = CompanyTypeOuterClass.CompanyType.UnKnow;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.jsj.member.ob.dto.proto.CustomerInformationRequest)
    }

    static {
      defaultInstance = new CustomerInformationRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.jsj.member.ob.dto.proto.CustomerInformationRequest)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n CustomerInformationRequest.proto\022\033com." +
      "jsj.member.ob.dto.proto\032\021BaseRequest.pro" +
      "to\032\035BigCustomerBusinessType.proto\032\021Compa" +
      "nyType.proto\"\235\002\n\032CustomerInformationRequ" +
      "est\022=\n\013BaseRequest\030\001 \001(\0132(.com.jsj.membe" +
      "r.ob.dto.proto.BaseRequest\022\r\n\005JSJID\030\002 \001(" +
      "\t\022\017\n\004Type\030\003 \001(\005:\0010\022Y\n\014BusinessType\030\004 \001(\016" +
      "24.com.jsj.member.ob.dto.proto.BigCustom" +
      "erBusinessType:\rBigCustFlight\022E\n\013Company" +
      "Type\030\005 \001(\0162(.com.jsj.member.ob.dto.proto",
      ".CompanyType:\006UnKnow"
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
          BigCustomerBusinessTypeOuterClass.getDescriptor(),
          CompanyTypeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_jsj_member_ob_dto_proto_CustomerInformationRequest_descriptor,
        new String[] { "BaseRequest", "JSJID", "Type", "BusinessType", "CompanyType", });
    BaseRequestOuterClass.getDescriptor();
    BigCustomerBusinessTypeOuterClass.getDescriptor();
    CompanyTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
