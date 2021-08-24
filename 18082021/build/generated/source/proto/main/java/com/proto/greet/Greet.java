// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: greet/greet.proto

package com.proto.greet;

public final class Greet {
  private Greet() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetManyTimeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetManyTimeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetManyTimeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetManyTimeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_LongGreetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_LongGreetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_LongGreetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_LongGreetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetEveryoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetEveryoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greet_GreetEveryoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greet_GreetEveryoneResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021greet/greet.proto\022\005greet\"1\n\010Greeting\022\022" +
      "\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\"1\n" +
      "\014GreetRequest\022!\n\010greeting\030\001 \001(\0132\017.greet." +
      "Greeting\"\037\n\rGreetResponse\022\016\n\006result\030\001 \001(" +
      "\t\"9\n\024GreetManyTimeRequest\022!\n\010greeting\030\001 " +
      "\001(\0132\017.greet.Greeting\"\'\n\025GreetManyTimeRes" +
      "ponse\022\016\n\006result\030\001 \001(\t\"5\n\020LongGreetReques" +
      "t\022!\n\010greeting\030\001 \001(\0132\017.greet.Greeting\"#\n\021" +
      "LongGreetResponse\022\016\n\006result\030\001 \001(\t\"9\n\024Gre" +
      "etEveryoneRequest\022!\n\010greeting\030\001 \001(\0132\017.gr" +
      "eet.Greeting\"\'\n\025GreetEveryoneResponse\022\016\n" +
      "\006result\030\001 \001(\t2\252\002\n\014GreetService\0224\n\005Greet\022" +
      "\023.greet.GreetRequest\032\024.greet.GreetRespon" +
      "se\"\000\022N\n\rGreetManyTime\022\033.greet.GreetManyT" +
      "imeRequest\032\034.greet.GreetManyTimeResponse" +
      "\"\0000\001\022B\n\tLongGreet\022\027.greet.LongGreetReque" +
      "st\032\030.greet.LongGreetResponse\"\000(\001\022P\n\rGree" +
      "tEveryOne\022\033.greet.GreetEveryoneRequest\032\034" +
      ".greet.GreetEveryoneResponse\"\000(\0010\001B\023\n\017co" +
      "m.proto.greetP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greet_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greet_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_Greeting_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_greet_GreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greet_GreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_greet_GreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_GreetManyTimeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_greet_GreetManyTimeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetManyTimeRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetManyTimeResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_greet_GreetManyTimeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetManyTimeResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_LongGreetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_greet_LongGreetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_LongGreetRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_LongGreetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_greet_LongGreetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_LongGreetResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greet_GreetEveryoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_greet_GreetEveryoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetEveryoneRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greet_GreetEveryoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_greet_GreetEveryoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greet_GreetEveryoneResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
