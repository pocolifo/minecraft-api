package com.pocolifo.minecraftapi.request;

import com.pocolifo.restclientframework.request.Endpoint;
import com.pocolifo.restclientframework.request.RequestParameter;
import com.pocolifo.restclientframework.request.methods.get.GetRequest;
import com.pocolifo.restclientframework.response.BinaryResponse;
import com.pocolifo.restclientframework.response.NonJsonResponse;

@Endpoint("https://resources.download.minecraft.net/%firstTwoCharsOfHash%/%hash%")
@BinaryResponse
@NonJsonResponse
public class ObjectRequest extends GetRequest<byte[]> {
    @RequestParameter
    public String hash;

    @RequestParameter
    public String firstTwoCharsOfHash;
}
