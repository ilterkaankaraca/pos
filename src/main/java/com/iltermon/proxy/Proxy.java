package com.iltermon.proxy;

public class Proxy implements ServiceInterface {
    ServiceInterface service;
    String stringCache;
    Proxy(ServiceInterface service){
        this.service = service;
    }
    public String getString() {
        if (stringCache == null) {
            stringCache = service.getString();
        }
        return stringCache;
    }
    @Override
    public void operation() {
        System.out.println("ProxySubject.publicMethod()");
    }

}
