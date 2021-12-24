package com.pocolifo.minecraftapi;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.pocolifo.minecraftapi.request.ManifestRequest;
import com.pocolifo.minecraftapi.request.VersionMetadataRequest;
import com.pocolifo.minecraftapi.request.template.ManifestTemplate;
import com.pocolifo.minecraftapi.request.template.VersionMetadataTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VersionMetadataTest {
    @Test
    public void main() throws Exception {
        ManifestRequest request = new ManifestRequest();
        ManifestTemplate template = request.getResponse(Constants.API);

        ManifestTemplate.Version version = template.versions.get(0);
        VersionMetadataRequest metadataRequest = version.getMetadataRequest();
        VersionMetadataTemplate response = metadataRequest.getResponse(Constants.API);

        for (JsonElement jsonElement : response.arguments.jvm) {
            if (jsonElement instanceof JsonPrimitive) {
                System.out.println(jsonElement.getAsString());
            } else {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                System.out.println(jsonObject.get("value"));
            }
        }


        Assertions.assertNotNull(response);
    }
}
