// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: 1-scalar-types.proto

public final class 1ScalarTypes {
  private 1ScalarTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 age = 1;</code>
     */
    int getAge();

    /**
     * <code>string first_name = 2;</code>
     */
    java.lang.String getFirstName();
    /**
     * <code>string first_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    /**
     * <code>string last_name = 3;</code>
     */
    java.lang.String getLastName();
    /**
     * <code>string last_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getLastNameBytes();

    /**
     * <code>bytes small_picture = 4;</code>
     */
    com.google.protobuf.ByteString getSmallPicture();

    /**
     * <code>bool is_profile_verified = 5;</code>
     */
    boolean getIsProfileVerified();

    /**
     * <code>float height = 6;</code>
     */
    float getHeight();
  }
  /**
   * Protobuf type {@code Person}
   */
  public  static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      age_ = 0;
      firstName_ = "";
      lastName_ = "";
      smallPicture_ = com.google.protobuf.ByteString.EMPTY;
      isProfileVerified_ = false;
      height_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
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
            case 8: {

              age_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              firstName_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              lastName_ = s;
              break;
            }
            case 34: {

              smallPicture_ = input.readBytes();
              break;
            }
            case 40: {

              isProfileVerified_ = input.readBool();
              break;
            }
            case 53: {

              height_ = input.readFloat();
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
      return 1ScalarTypes.internal_static_Person_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return 1ScalarTypes.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              1ScalarTypes.Person.class, 1ScalarTypes.Person.Builder.class);
    }

    public static final int AGE_FIELD_NUMBER = 1;
    private int age_;
    /**
     * <code>int32 age = 1;</code>
     */
    public int getAge() {
      return age_;
    }

    public static final int FIRST_NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object firstName_;
    /**
     * <code>string first_name = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      }
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LAST_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object lastName_;
    /**
     * <code>string last_name = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SMALL_PICTURE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString smallPicture_;
    /**
     * <code>bytes small_picture = 4;</code>
     */
    public com.google.protobuf.ByteString getSmallPicture() {
      return smallPicture_;
    }

    public static final int IS_PROFILE_VERIFIED_FIELD_NUMBER = 5;
    private boolean isProfileVerified_;
    /**
     * <code>bool is_profile_verified = 5;</code>
     */
    public boolean getIsProfileVerified() {
      return isProfileVerified_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 6;
    private float height_;
    /**
     * <code>float height = 6;</code>
     */
    public float getHeight() {
      return height_;
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
      if (age_ != 0) {
        output.writeInt32(1, age_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
      }
      if (!smallPicture_.isEmpty()) {
        output.writeBytes(4, smallPicture_);
      }
      if (isProfileVerified_ != false) {
        output.writeBool(5, isProfileVerified_);
      }
      if (height_ != 0F) {
        output.writeFloat(6, height_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, age_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
      }
      if (!smallPicture_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, smallPicture_);
      }
      if (isProfileVerified_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isProfileVerified_);
      }
      if (height_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, height_);
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
      if (!(obj instanceof 1ScalarTypes.Person)) {
        return super.equals(obj);
      }
      1ScalarTypes.Person other = (1ScalarTypes.Person) obj;

      boolean result = true;
      result = result && (getAge()
          == other.getAge());
      result = result && getFirstName()
          .equals(other.getFirstName());
      result = result && getLastName()
          .equals(other.getLastName());
      result = result && getSmallPicture()
          .equals(other.getSmallPicture());
      result = result && (getIsProfileVerified()
          == other.getIsProfileVerified());
      result = result && (
          java.lang.Float.floatToIntBits(getHeight())
          == java.lang.Float.floatToIntBits(
              other.getHeight()));
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
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstName().hashCode();
      hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getLastName().hashCode();
      hash = (37 * hash) + SMALL_PICTURE_FIELD_NUMBER;
      hash = (53 * hash) + getSmallPicture().hashCode();
      hash = (37 * hash) + IS_PROFILE_VERIFIED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsProfileVerified());
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static 1ScalarTypes.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 1ScalarTypes.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 1ScalarTypes.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 1ScalarTypes.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 1ScalarTypes.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static 1ScalarTypes.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static 1ScalarTypes.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static 1ScalarTypes.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static 1ScalarTypes.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static 1ScalarTypes.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static 1ScalarTypes.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static 1ScalarTypes.Person parseFrom(
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
    public static Builder newBuilder(1ScalarTypes.Person prototype) {
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
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        1ScalarTypes.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return 1ScalarTypes.internal_static_Person_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return 1ScalarTypes.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                1ScalarTypes.Person.class, 1ScalarTypes.Person.Builder.class);
      }

      // Construct using 1ScalarTypes.Person.newBuilder()
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
        age_ = 0;

        firstName_ = "";

        lastName_ = "";

        smallPicture_ = com.google.protobuf.ByteString.EMPTY;

        isProfileVerified_ = false;

        height_ = 0F;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return 1ScalarTypes.internal_static_Person_descriptor;
      }

      public 1ScalarTypes.Person getDefaultInstanceForType() {
        return 1ScalarTypes.Person.getDefaultInstance();
      }

      public 1ScalarTypes.Person build() {
        1ScalarTypes.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public 1ScalarTypes.Person buildPartial() {
        1ScalarTypes.Person result = new 1ScalarTypes.Person(this);
        result.age_ = age_;
        result.firstName_ = firstName_;
        result.lastName_ = lastName_;
        result.smallPicture_ = smallPicture_;
        result.isProfileVerified_ = isProfileVerified_;
        result.height_ = height_;
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
        if (other instanceof 1ScalarTypes.Person) {
          return mergeFrom((1ScalarTypes.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(1ScalarTypes.Person other) {
        if (other == 1ScalarTypes.Person.getDefaultInstance()) return this;
        if (other.getAge() != 0) {
          setAge(other.getAge());
        }
        if (!other.getFirstName().isEmpty()) {
          firstName_ = other.firstName_;
          onChanged();
        }
        if (!other.getLastName().isEmpty()) {
          lastName_ = other.lastName_;
          onChanged();
        }
        if (other.getSmallPicture() != com.google.protobuf.ByteString.EMPTY) {
          setSmallPicture(other.getSmallPicture());
        }
        if (other.getIsProfileVerified() != false) {
          setIsProfileVerified(other.getIsProfileVerified());
        }
        if (other.getHeight() != 0F) {
          setHeight(other.getHeight());
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
        1ScalarTypes.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (1ScalarTypes.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 1;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 1;</code>
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 1;</code>
       */
      public Builder clearAge() {
        
        age_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object firstName_ = "";
      /**
       * <code>string first_name = 2;</code>
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string first_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string first_name = 2;</code>
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 2;</code>
       */
      public Builder clearFirstName() {
        
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 2;</code>
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        firstName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lastName_ = "";
      /**
       * <code>string last_name = 3;</code>
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string last_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string last_name = 3;</code>
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 3;</code>
       */
      public Builder clearLastName() {
        
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 3;</code>
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lastName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString smallPicture_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes small_picture = 4;</code>
       */
      public com.google.protobuf.ByteString getSmallPicture() {
        return smallPicture_;
      }
      /**
       * <code>bytes small_picture = 4;</code>
       */
      public Builder setSmallPicture(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        smallPicture_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes small_picture = 4;</code>
       */
      public Builder clearSmallPicture() {
        
        smallPicture_ = getDefaultInstance().getSmallPicture();
        onChanged();
        return this;
      }

      private boolean isProfileVerified_ ;
      /**
       * <code>bool is_profile_verified = 5;</code>
       */
      public boolean getIsProfileVerified() {
        return isProfileVerified_;
      }
      /**
       * <code>bool is_profile_verified = 5;</code>
       */
      public Builder setIsProfileVerified(boolean value) {
        
        isProfileVerified_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_profile_verified = 5;</code>
       */
      public Builder clearIsProfileVerified() {
        
        isProfileVerified_ = false;
        onChanged();
        return this;
      }

      private float height_ ;
      /**
       * <code>float height = 6;</code>
       */
      public float getHeight() {
        return height_;
      }
      /**
       * <code>float height = 6;</code>
       */
      public Builder setHeight(float value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float height = 6;</code>
       */
      public Builder clearHeight() {
        
        height_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final 1ScalarTypes.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new 1ScalarTypes.Person();
    }

    public static 1ScalarTypes.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    public 1ScalarTypes.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\0241-scalar-types.proto\"\200\001\n\006Person\022\013\n\003age" +
      "\030\001 \001(\005\022\022\n\nfirst_name\030\002 \001(\t\022\021\n\tlast_name\030" +
      "\003 \001(\t\022\025\n\rsmall_picture\030\004 \001(\014\022\033\n\023is_profi" +
      "le_verified\030\005 \001(\010\022\016\n\006height\030\006 \001(\002b\006proto" +
      "3"
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
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Age", "FirstName", "LastName", "SmallPicture", "IsProfileVerified", "Height", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}