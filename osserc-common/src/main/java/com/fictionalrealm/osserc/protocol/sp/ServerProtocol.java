// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerProtocol.proto

package com.fictionalrealm.osserc.protocol.sp;

public final class ServerProtocol {
  private ServerProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_osserc_sp_WelcomeSP_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_osserc_sp_WelcomeSP_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_osserc_sp_DisconnectionNoticeSP_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_osserc_sp_DisconnectionNoticeSP_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024ServerProtocol.proto\022\tosserc.sp\032\017DataT" +
      "ypes.proto\"X\n\tWelcomeSP\022\017\n\007version\030\001 \002(\005" +
      "\022-\n\014serverStatus\030\002 \002(\0162\027.osserc.dt.Serve" +
      "rStatus\022\013\n\003msg\030\003 \001(\t\"T\n\025DisconnectionNot" +
      "iceSP\022.\n\006reason\030\001 \002(\0162\036.osserc.dt.Discon" +
      "nectionReason\022\013\n\003msg\030\002 \001(\tB;\n%com.fictio" +
      "nalrealm.osserc.protocol.spB\016ServerProto" +
      "colH\001P\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_osserc_sp_WelcomeSP_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_osserc_sp_WelcomeSP_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_osserc_sp_WelcomeSP_descriptor,
              new String[] { "Version", "ServerStatus", "Msg", },
              WelcomeSP.class,
              WelcomeSP.Builder.class);
          internal_static_osserc_sp_DisconnectionNoticeSP_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_osserc_sp_DisconnectionNoticeSP_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_osserc_sp_DisconnectionNoticeSP_descriptor,
              new String[] { "Reason", "Msg", },
              DisconnectionNoticeSP.class,
              DisconnectionNoticeSP.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.fictionalrealm.osserc.protocol.datatypes.DataTypes.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}