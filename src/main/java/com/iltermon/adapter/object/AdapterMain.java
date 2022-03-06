package com.iltermon.adapter.object;

public class AdapterMain {
    /*****************************************************************************
     * Name: Adapter
     * 
     * Intent: Convert the interface of a class into another interface clients
     * expect. Adapter lets classes work together that couldn’t otherwise because of
     * incompatible interfaces
     * 
     * Real-world example: -----
     *****************************************************************************/

    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
