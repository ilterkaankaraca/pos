import java.util.HashMap;

public class Environment {
    private HashMap hashMap = new HashMap<String, Const>();

    public void put(String name, Const value) {
        hashMap.put(name, value);
    }

    public Const lookup(String name) {
        return (Const) hashMap.get(name);
    }
}
