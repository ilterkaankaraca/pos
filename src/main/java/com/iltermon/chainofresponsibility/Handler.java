package com.iltermon.chainofresponsibility;

public interface Handler {
    public void setNext(Handler h);
    public void handle(String request);
}
