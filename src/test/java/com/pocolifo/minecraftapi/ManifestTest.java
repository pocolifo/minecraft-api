package com.pocolifo.minecraftapi;

import com.pocolifo.minecraftapi.request.ManifestRequest;
import com.pocolifo.minecraftapi.request.template.ManifestTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManifestTest {
    @Test
    public void main() throws Exception {
        ManifestRequest request = new ManifestRequest();
        ManifestTemplate template = request.getResponse(Constants.API);

        Assertions.assertNotNull(template);
    }
}
