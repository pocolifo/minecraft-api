package com.pocolifo.minecraftapi.request.template;

import com.google.gson.annotations.SerializedName;
import com.pocolifo.minecraftapi.request.ObjectRequest;

import java.util.Map;

public class AssetIndexTemplate {
    public static class AssetIndexObject {
        @SerializedName("hash")
        public String hash;

        @SerializedName("size")
        public long size;

        public ObjectRequest getObjectRequest() {
            ObjectRequest request = new ObjectRequest();

            request.firstTwoCharsOfHash = hash.substring(0, 2);
            request.hash = hash;

            return request;
        }
    }

    @SerializedName("objects")
    public Map<String, AssetIndexObject> objects;
}
