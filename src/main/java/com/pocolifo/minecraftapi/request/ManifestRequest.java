package com.pocolifo.minecraftapi.request;

import com.pocolifo.minecraftapi.request.template.ManifestTemplate;
import com.pocolifo.restclientframework.request.Endpoint;
import com.pocolifo.restclientframework.request.methods.get.GetRequest;

@Endpoint("https://launchermeta.mojang.com/mc/game/version_manifest_v2.json")
public class ManifestRequest extends GetRequest<ManifestTemplate> {

}
