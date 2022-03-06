package com.iltermon.composite;

import java.util.HashMap;

public class Environment {//dictionary
    private HashMap<String, Const> hashMap = new HashMap<>();

    public void put(String name, Const value) {
        hashMap.put(name, value);
    }

    public Const lookup(String name) {
        return hashMap.get(name);
    }
}
