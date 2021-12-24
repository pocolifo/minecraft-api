package com.pocolifo.minecraftapi;

import com.pocolifo.restclientframework.RestClientFramework;
import com.pocolifo.restclientframework.http.strategy.BaseRequestStrategies;

import java.net.Proxy;

public class MinecraftAPI extends RestClientFramework {
    public MinecraftAPI(Proxy proxy) {
        super(proxy, new BaseRequestStrategies());
    }
}
