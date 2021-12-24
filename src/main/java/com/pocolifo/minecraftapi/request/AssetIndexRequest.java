package com.pocolifo.minecraftapi.request;

import com.pocolifo.minecraftapi.request.template.AssetIndexTemplate;
import com.pocolifo.restclientframework.request.Endpoint;
import com.pocolifo.restclientframework.request.RequestParameter;
import com.pocolifo.restclientframework.request.methods.get.GetRequest;

@Endpoint("https://launchermeta.mojang.com/v1/packages/%sha1%/%version%.json")
public class AssetIndexRequest extends GetRequest<AssetIndexTemplate> {
    @RequestParameter
    public String sha1;

    @RequestParameter
    public String version;
}
