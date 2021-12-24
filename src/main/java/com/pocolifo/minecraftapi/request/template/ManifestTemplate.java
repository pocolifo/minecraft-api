package com.pocolifo.minecraftapi.request.template;

import com.google.gson.annotations.SerializedName;
import com.pocolifo.minecraftapi.common.VersionType;
import com.pocolifo.minecraftapi.request.VersionMetadataRequest;

import java.net.URL;
import java.util.List;

public class ManifestTemplate {
    public static class Latest {
        @SerializedName("release")
        public String release;

        @SerializedName("snapshot")
        public String snapshot;
    }

    public static class Version {
        @SerializedName("id")
        public String id;

        @SerializedName("type")
        public VersionType type;

        @SerializedName("url")
        public URL url;

        @SerializedName("time")
        public String time;

        @SerializedName("releaseTime")
        public String releaseType;

        @SerializedName("sha1")
        public String sha1;

        @SerializedName("complianceLevel")
        public int complianceLevel;

        public VersionMetadataRequest getMetadataRequest() {
            VersionMetadataRequest request = new VersionMetadataRequest();

            request.version = this.id;
            request.sha1 = this.sha1;

            return request;
        }
    }

    @SerializedName("latest")
    public Latest latest;

    @SerializedName("versions")
    public List<Version> versions;
}
