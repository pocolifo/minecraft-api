package com.pocolifo.minecraftapi.request.template;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.pocolifo.minecraftapi.common.VersionType;
import com.pocolifo.minecraftapi.request.AssetIndexRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class VersionMetadataTemplate {
    public static class ShaSizeUrl {
        @SerializedName("sha1")
        public String sha1;

        @SerializedName("size")
        public long size;

        @SerializedName("url")
        public URL url;
    }

    public static class LogConfigFile extends ShaSizeUrl {
        @SerializedName("id")
        public String id;
    }

    public static class AssetIndex extends ShaSizeUrl {
        @SerializedName("id")
        public String id;

        @SerializedName("totalSize")
        public long totalSize;

        public AssetIndexRequest getAssetIndex() {
            AssetIndexRequest request = new AssetIndexRequest();

            request.version = this.id;
            request.sha1 = this.sha1;

            return request;
        }
    }

    public static class JavaVersion {
        @SerializedName("component")
        public String component;

        @SerializedName("majorVersion")
        public int majorVersion;
    }

    public static class Artifact extends ShaSizeUrl {
        @SerializedName("path")
        public String path;
    }

    public static class Library {
        public static class Downloads {
            @SerializedName("artifact")
            public Artifact artifact;

            @SerializedName("classifiers")
            public Map<String, Artifact> classifiers;
        }

        public static class Extract {
            @SerializedName("exclude")
            public List<String> exclude;
        }

        @SerializedName("downloads")
        public Downloads downloads;

        @SerializedName("name")
        public String name;

        @SerializedName("natives")
        public Map<String, String> natives;

        @SerializedName("extract")
        public Extract extract;

        @SerializedName("rules")
        public List<Rule> rules;
    }

    public static class Logging {
        @SerializedName("argument")
        public String argument;

        @SerializedName("file")
        public LogConfigFile file;

        @SerializedName("type")
        public String type;
    }

    public static class Rule {
        public enum Action {
            @SerializedName("allow")
            ALLOW,

            @SerializedName("disallow")
            DISALLOW;
        }

        public static class OS {
            @Nullable
            @SerializedName("name")
            public String name;

            @Nullable
            @SerializedName("arch")
            public String arch;

            @Nullable
            @SerializedName("version")
            public String version;
        }

        @SerializedName("action")
        @Nullable
        public Action action;

        @SerializedName("os")
        @Nullable
        public OS os;

        @SerializedName("value")
        @Nullable
        public Object value;
    }

    public static class Arguments {
        @NotNull
        @SerializedName("game")
        public List<JsonElement> game;

        @NotNull
        @SerializedName("jvm")
        public List<JsonElement> jvm;
    }

    @SerializedName("assetIndex")
    public AssetIndex assetIndex;

    @SerializedName("assets")
    public String assets;

    @SerializedName("complianceLevel")
    public int complianceLevel;

    @SerializedName("downloads")
    public Map<String, ShaSizeUrl> downloads;

    @SerializedName("id")
    public String id;

    @SerializedName("javaVersion")
    public JavaVersion javaVersion;

    @SerializedName("libraries")
    public List<Library> libraries;

    @SerializedName("logging")
    public Map<String, Logging> logging;

    @SerializedName("mainClass")
    public String mainClass;

    @SerializedName("minecraftArguments")
    public String minecraftArguments;

    @SerializedName("minimumLauncherVersion")
    public int minimumLauncherVersion;

    @SerializedName("releaseTime")
    public String releaseTime;

    @SerializedName("time")
    public String time;

    @SerializedName("type")
    public VersionType type;

    @SerializedName("arguments")
    @Nullable
    public VersionMetadataTemplate.Arguments arguments;
}
