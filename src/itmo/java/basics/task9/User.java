package itmo.java.basics.task9;

import java.util.Collection;
import java.util.HashSet;

public class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
