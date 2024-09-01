// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: extension_kind.proto

package com.spotifyxp.deps.com.spotify.extendedmetadata;

public final class ExtensionKindOuterClass {
  private ExtensionKindOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code spotify.extendedmetadata.proto.ExtensionKind}
   */
  public enum ExtensionKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN_EXTENSION = 0;</code>
     */
    UNKNOWN_EXTENSION(0),
    /**
     * <code>CANVAZ = 1;</code>
     */
    CANVAZ(1),
    /**
     * <code>STORYLINES = 2;</code>
     */
    STORYLINES(2),
    /**
     * <code>PODCAST_TOPICS = 3;</code>
     */
    PODCAST_TOPICS(3),
    /**
     * <code>PODCAST_SEGMENTS = 4;</code>
     */
    PODCAST_SEGMENTS(4),
    /**
     * <code>AUDIO_FILES = 5;</code>
     */
    AUDIO_FILES(5),
    /**
     * <code>TRACK_DESCRIPTOR = 6;</code>
     */
    TRACK_DESCRIPTOR(6),
    /**
     * <code>ARTIST_V4 = 8;</code>
     */
    ARTIST_V4(8),
    /**
     * <code>ALBUM_V4 = 9;</code>
     */
    ALBUM_V4(9),
    /**
     * <code>TRACK_V4 = 10;</code>
     */
    TRACK_V4(10),
    /**
     * <code>SHOW_V4 = 11;</code>
     */
    SHOW_V4(11),
    /**
     * <code>EPISODE_V4 = 12;</code>
     */
    EPISODE_V4(12),
    /**
     * <code>PODCAST_HTML_DESCRIPTION = 13;</code>
     */
    PODCAST_HTML_DESCRIPTION(13),
    /**
     * <code>PODCAST_QUOTES = 14;</code>
     */
    PODCAST_QUOTES(14),
    /**
     * <code>USER_PROFILE = 15;</code>
     */
    USER_PROFILE(15),
    /**
     * <code>CANVAS_V1 = 16;</code>
     */
    CANVAS_V1(16),
    /**
     * <code>SHOW_V4_BASE = 17;</code>
     */
    SHOW_V4_BASE(17),
    /**
     * <code>SHOW_V4_EPISODES_ASSOC = 18;</code>
     */
    SHOW_V4_EPISODES_ASSOC(18),
    /**
     * <code>TRACK_DESCRIPTOR_SIGNATURES = 19;</code>
     */
    TRACK_DESCRIPTOR_SIGNATURES(19),
    /**
     * <code>PODCAST_AD_SEGMENTS = 20;</code>
     */
    PODCAST_AD_SEGMENTS(20),
    /**
     * <code>TRANSCRIPTS = 21;</code>
     */
    TRANSCRIPTS(21),
    ;

    /**
     * <code>UNKNOWN_EXTENSION = 0;</code>
     */
    public static final int UNKNOWN_EXTENSION_VALUE = 0;
    /**
     * <code>CANVAZ = 1;</code>
     */
    public static final int CANVAZ_VALUE = 1;
    /**
     * <code>STORYLINES = 2;</code>
     */
    public static final int STORYLINES_VALUE = 2;
    /**
     * <code>PODCAST_TOPICS = 3;</code>
     */
    public static final int PODCAST_TOPICS_VALUE = 3;
    /**
     * <code>PODCAST_SEGMENTS = 4;</code>
     */
    public static final int PODCAST_SEGMENTS_VALUE = 4;
    /**
     * <code>AUDIO_FILES = 5;</code>
     */
    public static final int AUDIO_FILES_VALUE = 5;
    /**
     * <code>TRACK_DESCRIPTOR = 6;</code>
     */
    public static final int TRACK_DESCRIPTOR_VALUE = 6;
    /**
     * <code>ARTIST_V4 = 8;</code>
     */
    public static final int ARTIST_V4_VALUE = 8;
    /**
     * <code>ALBUM_V4 = 9;</code>
     */
    public static final int ALBUM_V4_VALUE = 9;
    /**
     * <code>TRACK_V4 = 10;</code>
     */
    public static final int TRACK_V4_VALUE = 10;
    /**
     * <code>SHOW_V4 = 11;</code>
     */
    public static final int SHOW_V4_VALUE = 11;
    /**
     * <code>EPISODE_V4 = 12;</code>
     */
    public static final int EPISODE_V4_VALUE = 12;
    /**
     * <code>PODCAST_HTML_DESCRIPTION = 13;</code>
     */
    public static final int PODCAST_HTML_DESCRIPTION_VALUE = 13;
    /**
     * <code>PODCAST_QUOTES = 14;</code>
     */
    public static final int PODCAST_QUOTES_VALUE = 14;
    /**
     * <code>USER_PROFILE = 15;</code>
     */
    public static final int USER_PROFILE_VALUE = 15;
    /**
     * <code>CANVAS_V1 = 16;</code>
     */
    public static final int CANVAS_V1_VALUE = 16;
    /**
     * <code>SHOW_V4_BASE = 17;</code>
     */
    public static final int SHOW_V4_BASE_VALUE = 17;
    /**
     * <code>SHOW_V4_EPISODES_ASSOC = 18;</code>
     */
    public static final int SHOW_V4_EPISODES_ASSOC_VALUE = 18;
    /**
     * <code>TRACK_DESCRIPTOR_SIGNATURES = 19;</code>
     */
    public static final int TRACK_DESCRIPTOR_SIGNATURES_VALUE = 19;
    /**
     * <code>PODCAST_AD_SEGMENTS = 20;</code>
     */
    public static final int PODCAST_AD_SEGMENTS_VALUE = 20;
    /**
     * <code>TRANSCRIPTS = 21;</code>
     */
    public static final int TRANSCRIPTS_VALUE = 21;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExtensionKind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExtensionKind forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN_EXTENSION;
        case 1: return CANVAZ;
        case 2: return STORYLINES;
        case 3: return PODCAST_TOPICS;
        case 4: return PODCAST_SEGMENTS;
        case 5: return AUDIO_FILES;
        case 6: return TRACK_DESCRIPTOR;
        case 8: return ARTIST_V4;
        case 9: return ALBUM_V4;
        case 10: return TRACK_V4;
        case 11: return SHOW_V4;
        case 12: return EPISODE_V4;
        case 13: return PODCAST_HTML_DESCRIPTION;
        case 14: return PODCAST_QUOTES;
        case 15: return USER_PROFILE;
        case 16: return CANVAS_V1;
        case 17: return SHOW_V4_BASE;
        case 18: return SHOW_V4_EPISODES_ASSOC;
        case 19: return TRACK_DESCRIPTOR_SIGNATURES;
        case 20: return PODCAST_AD_SEGMENTS;
        case 21: return TRANSCRIPTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExtensionKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExtensionKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExtensionKind>() {
            public ExtensionKind findValueByNumber(int number) {
              return ExtensionKind.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.spotifyxp.deps.com.spotify.extendedmetadata.ExtensionKindOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExtensionKind[] VALUES = values();

    public static ExtensionKind valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ExtensionKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:spotify.extendedmetadata.proto.ExtensionKind)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024extension_kind.proto\022\036spotify.extended" +
      "metadata.proto*\247\003\n\rExtensionKind\022\025\n\021UNKN" +
      "OWN_EXTENSION\020\000\022\n\n\006CANVAZ\020\001\022\016\n\nSTORYLINE" +
      "S\020\002\022\022\n\016PODCAST_TOPICS\020\003\022\024\n\020PODCAST_SEGME" +
      "NTS\020\004\022\017\n\013AUDIO_FILES\020\005\022\024\n\020TRACK_DESCRIPT" +
      "OR\020\006\022\r\n\tARTIST_V4\020\010\022\014\n\010ALBUM_V4\020\t\022\014\n\010TRA" +
      "CK_V4\020\n\022\013\n\007SHOW_V4\020\013\022\016\n\nEPISODE_V4\020\014\022\034\n\030" +
      "PODCAST_HTML_DESCRIPTION\020\r\022\022\n\016PODCAST_QU" +
      "OTES\020\016\022\020\n\014USER_PROFILE\020\017\022\r\n\tCANVAS_V1\020\020\022" +
      "\020\n\014SHOW_V4_BASE\020\021\022\032\n\026SHOW_V4_EPISODES_AS" +
      "SOC\020\022\022\037\n\033TRACK_DESCRIPTOR_SIGNATURES\020\023\022\027" +
      "\n\023PODCAST_AD_SEGMENTS\020\024\022\017\n\013TRANSCRIPTS\020\025" +
      "B3\n/com.spotifyxp.deps.com.spotify.exten" +
      "dedmetadataH\002"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
