// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spotify/login5/v3/client_info.proto

package com.spotifyxp.deps.com.spotify.login5v3;

public final class ClientInfoOuterClass {
    private ClientInfoOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ClientInfoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:spotify.login5.v3.ClientInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string client_id = 1;</code>
         *
         * @return The clientId.
         */
        java.lang.String getClientId();

        /**
         * <code>string client_id = 1;</code>
         *
         * @return The bytes for clientId.
         */
        com.google.protobuf.ByteString
        getClientIdBytes();

        /**
         * <code>string device_id = 2;</code>
         *
         * @return The deviceId.
         */
        java.lang.String getDeviceId();

        /**
         * <code>string device_id = 2;</code>
         *
         * @return The bytes for deviceId.
         */
        com.google.protobuf.ByteString
        getDeviceIdBytes();
    }

    /**
     * Protobuf type {@code spotify.login5.v3.ClientInfo}
     */
    public static final class ClientInfo extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:spotify.login5.v3.ClientInfo)
            ClientInfoOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use ClientInfo.newBuilder() to construct.
        private ClientInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ClientInfo() {
            clientId_ = "";
            deviceId_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new ClientInfo();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.internal_static_spotify_login5_v3_ClientInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.internal_static_spotify_login5_v3_ClientInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.class, com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.Builder.class);
        }

        public static final int CLIENT_ID_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private volatile java.lang.Object clientId_ = "";

        /**
         * <code>string client_id = 1;</code>
         *
         * @return The clientId.
         */
        @java.lang.Override
        public java.lang.String getClientId() {
            java.lang.Object ref = clientId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                clientId_ = s;
                return s;
            }
        }

        /**
         * <code>string client_id = 1;</code>
         *
         * @return The bytes for clientId.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getClientIdBytes() {
            java.lang.Object ref = clientId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                clientId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int DEVICE_ID_FIELD_NUMBER = 2;
        @SuppressWarnings("serial")
        private volatile java.lang.Object deviceId_ = "";

        /**
         * <code>string device_id = 2;</code>
         *
         * @return The deviceId.
         */
        @java.lang.Override
        public java.lang.String getDeviceId() {
            java.lang.Object ref = deviceId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                deviceId_ = s;
                return s;
            }
        }

        /**
         * <code>string device_id = 2;</code>
         *
         * @return The bytes for deviceId.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getDeviceIdBytes() {
            java.lang.Object ref = deviceId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                deviceId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceId_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deviceId_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo)) {
                return super.equals(obj);
            }
            com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo other = (com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo) obj;

            if (!getClientId()
                    .equals(other.getClientId())) return false;
            if (!getDeviceId()
                    .equals(other.getDeviceId())) return false;
            if (!getUnknownFields().equals(other.getUnknownFields())) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
            hash = (53 * hash) + getClientId().hashCode();
            hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getDeviceId().hashCode();
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
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
         * Protobuf type {@code spotify.login5.v3.ClientInfo}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:spotify.login5.v3.ClientInfo)
                com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.internal_static_spotify_login5_v3_ClientInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.internal_static_spotify_login5_v3_ClientInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.class, com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.Builder.class);
            }

            // Construct using com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                clientId_ = "";
                deviceId_ = "";
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.internal_static_spotify_login5_v3_ClientInfo_descriptor;
            }

            @java.lang.Override
            public com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo getDefaultInstanceForType() {
                return com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.getDefaultInstance();
            }

            @java.lang.Override
            public com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo build() {
                com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo buildPartial() {
                com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo result = new com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo(this);
                if (bitField0_ != 0) {
                    buildPartial0(result);
                }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.clientId_ = clientId_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.deviceId_ = deviceId_;
                }
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo) {
                    return mergeFrom((com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo other) {
                if (other == com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo.getDefaultInstance())
                    return this;
                if (!other.getClientId().isEmpty()) {
                    clientId_ = other.clientId_;
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                if (!other.getDeviceId().isEmpty()) {
                    deviceId_ = other.deviceId_;
                    bitField0_ |= 0x00000002;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                if (extensionRegistry == null) {
                    throw new java.lang.NullPointerException();
                }
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 10: {
                                clientId_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 10
                            case 18: {
                                deviceId_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 18
                            default: {
                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                    done = true; // was an endgroup tag
                                }
                                break;
                            } // default:
                        } // switch (tag)
                    } // while (!done)
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.unwrapIOException();
                } finally {
                    onChanged();
                } // finally
                return this;
            }

            private int bitField0_;

            private java.lang.Object clientId_ = "";

            /**
             * <code>string client_id = 1;</code>
             *
             * @return The clientId.
             */
            public java.lang.String getClientId() {
                java.lang.Object ref = clientId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    clientId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string client_id = 1;</code>
             *
             * @return The bytes for clientId.
             */
            public com.google.protobuf.ByteString
            getClientIdBytes() {
                java.lang.Object ref = clientId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    clientId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string client_id = 1;</code>
             *
             * @param value The clientId to set.
             * @return This builder for chaining.
             */
            public Builder setClientId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                clientId_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }

            /**
             * <code>string client_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearClientId() {
                clientId_ = getDefaultInstance().getClientId();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            /**
             * <code>string client_id = 1;</code>
             *
             * @param value The bytes for clientId to set.
             * @return This builder for chaining.
             */
            public Builder setClientIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                clientId_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }

            private java.lang.Object deviceId_ = "";

            /**
             * <code>string device_id = 2;</code>
             *
             * @return The deviceId.
             */
            public java.lang.String getDeviceId() {
                java.lang.Object ref = deviceId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    deviceId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string device_id = 2;</code>
             *
             * @return The bytes for deviceId.
             */
            public com.google.protobuf.ByteString
            getDeviceIdBytes() {
                java.lang.Object ref = deviceId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    deviceId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string device_id = 2;</code>
             *
             * @param value The deviceId to set.
             * @return This builder for chaining.
             */
            public Builder setDeviceId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                deviceId_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }

            /**
             * <code>string device_id = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDeviceId() {
                deviceId_ = getDefaultInstance().getDeviceId();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
                return this;
            }

            /**
             * <code>string device_id = 2;</code>
             *
             * @param value The bytes for deviceId to set.
             * @return This builder for chaining.
             */
            public Builder setDeviceIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);
                deviceId_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:spotify.login5.v3.ClientInfo)
        }

        // @@protoc_insertion_point(class_scope:spotify.login5.v3.ClientInfo)
        private static final com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo();
        }

        public static com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ClientInfo>
                PARSER = new com.google.protobuf.AbstractParser<ClientInfo>() {
            @java.lang.Override
            public ClientInfo parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Builder builder = newBuilder();
                try {
                    builder.mergeFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(builder.buildPartial());
                } catch (com.google.protobuf.UninitializedMessageException e) {
                    throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(e)
                            .setUnfinishedMessage(builder.buildPartial());
                }
                return builder.buildPartial();
            }
        };

        public static com.google.protobuf.Parser<ClientInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ClientInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.spotifyxp.deps.com.spotify.login5v3.ClientInfoOuterClass.ClientInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_spotify_login5_v3_ClientInfo_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_spotify_login5_v3_ClientInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n#spotify/login5/v3/client_info.proto\022\021s" +
                        "potify.login5.v3\"2\n\nClientInfo\022\021\n\tclient" +
                        "_id\030\001 \001(\t\022\021\n\tdevice_id\030\002 \001(\tB)\n\'com.spot" +
                        "ifyxp.deps.com.spotify.login5v3b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_spotify_login5_v3_ClientInfo_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_spotify_login5_v3_ClientInfo_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_spotify_login5_v3_ClientInfo_descriptor,
                new java.lang.String[]{"ClientId", "DeviceId",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
