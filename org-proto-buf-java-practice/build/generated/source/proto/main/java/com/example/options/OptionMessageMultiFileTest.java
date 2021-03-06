// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: options_example.proto

package com.example.options;

/**
 * Protobuf type {@code example.options.OptionMessageMultiFileTest}
 */
public  final class OptionMessageMultiFileTest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.options.OptionMessageMultiFileTest)
    OptionMessageMultiFileTestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OptionMessageMultiFileTest.newBuilder() to construct.
  private OptionMessageMultiFileTest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OptionMessageMultiFileTest() {
    hello_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OptionMessageMultiFileTest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            hello_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.options.OptionsExample.internal_static_example_options_OptionMessageMultiFileTest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.options.OptionsExample.internal_static_example_options_OptionMessageMultiFileTest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.options.OptionMessageMultiFileTest.class, com.example.options.OptionMessageMultiFileTest.Builder.class);
  }

  public static final int HELLO_FIELD_NUMBER = 1;
  private volatile java.lang.Object hello_;
  /**
   * <code>string hello = 1;</code>
   */
  public java.lang.String getHello() {
    java.lang.Object ref = hello_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hello_ = s;
      return s;
    }
  }
  /**
   * <code>string hello = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHelloBytes() {
    java.lang.Object ref = hello_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hello_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getHelloBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hello_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHelloBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hello_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.options.OptionMessageMultiFileTest)) {
      return super.equals(obj);
    }
    com.example.options.OptionMessageMultiFileTest other = (com.example.options.OptionMessageMultiFileTest) obj;

    boolean result = true;
    result = result && getHello()
        .equals(other.getHello());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HELLO_FIELD_NUMBER;
    hash = (53 * hash) + getHello().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessageMultiFileTest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessageMultiFileTest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.options.OptionMessageMultiFileTest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.options.OptionMessageMultiFileTest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code example.options.OptionMessageMultiFileTest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.options.OptionMessageMultiFileTest)
      com.example.options.OptionMessageMultiFileTestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.options.OptionsExample.internal_static_example_options_OptionMessageMultiFileTest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.options.OptionsExample.internal_static_example_options_OptionMessageMultiFileTest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.options.OptionMessageMultiFileTest.class, com.example.options.OptionMessageMultiFileTest.Builder.class);
    }

    // Construct using com.example.options.OptionMessageMultiFileTest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      hello_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.options.OptionsExample.internal_static_example_options_OptionMessageMultiFileTest_descriptor;
    }

    public com.example.options.OptionMessageMultiFileTest getDefaultInstanceForType() {
      return com.example.options.OptionMessageMultiFileTest.getDefaultInstance();
    }

    public com.example.options.OptionMessageMultiFileTest build() {
      com.example.options.OptionMessageMultiFileTest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.options.OptionMessageMultiFileTest buildPartial() {
      com.example.options.OptionMessageMultiFileTest result = new com.example.options.OptionMessageMultiFileTest(this);
      result.hello_ = hello_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.options.OptionMessageMultiFileTest) {
        return mergeFrom((com.example.options.OptionMessageMultiFileTest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.options.OptionMessageMultiFileTest other) {
      if (other == com.example.options.OptionMessageMultiFileTest.getDefaultInstance()) return this;
      if (!other.getHello().isEmpty()) {
        hello_ = other.hello_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.options.OptionMessageMultiFileTest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.options.OptionMessageMultiFileTest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hello_ = "";
    /**
     * <code>string hello = 1;</code>
     */
    public java.lang.String getHello() {
      java.lang.Object ref = hello_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hello_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hello = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHelloBytes() {
      java.lang.Object ref = hello_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hello_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hello = 1;</code>
     */
    public Builder setHello(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hello_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string hello = 1;</code>
     */
    public Builder clearHello() {
      
      hello_ = getDefaultInstance().getHello();
      onChanged();
      return this;
    }
    /**
     * <code>string hello = 1;</code>
     */
    public Builder setHelloBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hello_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:example.options.OptionMessageMultiFileTest)
  }

  // @@protoc_insertion_point(class_scope:example.options.OptionMessageMultiFileTest)
  private static final com.example.options.OptionMessageMultiFileTest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.options.OptionMessageMultiFileTest();
  }

  public static com.example.options.OptionMessageMultiFileTest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OptionMessageMultiFileTest>
      PARSER = new com.google.protobuf.AbstractParser<OptionMessageMultiFileTest>() {
    public OptionMessageMultiFileTest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OptionMessageMultiFileTest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OptionMessageMultiFileTest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OptionMessageMultiFileTest> getParserForType() {
    return PARSER;
  }

  public com.example.options.OptionMessageMultiFileTest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

