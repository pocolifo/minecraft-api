package com.pocolifo.minecraftapi.common;

import com.google.gson.annotations.SerializedName;

public enum VersionType {
    @SerializedName("snapshot")
    SNAPSHOT,

    @SerializedName("release")
    RELEASE;
}
