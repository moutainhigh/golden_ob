// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataCommission.proto

package com.jsj.member.ob.dto.proto;

public final class DataCommissionOuterClass {
  private DataCommissionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code com.jsj.member.ob.dto.proto.DataCommission}
   */
  public enum DataCommission
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DataCommissionNoSetting = 0;</code>
     */
    DataCommissionNoSetting(0, 0),
    /**
     * <code>Personal = 1;</code>
     */
    Personal(1, 1),
    /**
     * <code>Department = 2;</code>
     */
    Department(2, 2),
    /**
     * <code>DepartmentAndSub = 3;</code>
     */
    DepartmentAndSub(3, 3),
    /**
     * <code>All = 4;</code>
     */
    All(4, 4),
    ;

    /**
     * <code>DataCommissionNoSetting = 0;</code>
     */
    public static final int DataCommissionNoSetting_VALUE = 0;
    /**
     * <code>Personal = 1;</code>
     */
    public static final int Personal_VALUE = 1;
    /**
     * <code>Department = 2;</code>
     */
    public static final int Department_VALUE = 2;
    /**
     * <code>DepartmentAndSub = 3;</code>
     */
    public static final int DepartmentAndSub_VALUE = 3;
    /**
     * <code>All = 4;</code>
     */
    public static final int All_VALUE = 4;


    public final int getNumber() { return value; }

    public static DataCommission valueOf(int value) {
      switch (value) {
        case 0: return DataCommissionNoSetting;
        case 1: return Personal;
        case 2: return Department;
        case 3: return DepartmentAndSub;
        case 4: return All;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataCommission>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<DataCommission>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DataCommission>() {
            public DataCommission findValueByNumber(int number) {
              return DataCommission.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.jsj.member.ob.dto.proto.DataCommissionOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DataCommission[] VALUES = values();

    public static DataCommission valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private DataCommission(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.jsj.member.ob.dto.proto.DataCommission)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024DataCommission.proto\022\033com.jsj.member.o" +
      "b.dto.proto*j\n\016DataCommission\022\033\n\027DataCom" +
      "missionNoSetting\020\000\022\014\n\010Personal\020\001\022\016\n\nDepa" +
      "rtment\020\002\022\024\n\020DepartmentAndSub\020\003\022\007\n\003All\020\004"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
