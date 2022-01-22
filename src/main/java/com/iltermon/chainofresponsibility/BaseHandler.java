package com.iltermon.chainofresponsibility;

public class BaseHandler implements Handler{
    Handler next;
    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(String request) {
        //TODO: implement
    }
}
