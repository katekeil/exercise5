package com.kate;
import java.util.*;

/**
 * Created by 016006 on 2/12/2019.
 */
public class Contact {
    String name;
    String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Information: " +
                "Name: " + name + '\'' +
                ", Email: " + email + '\'';
    }
}
