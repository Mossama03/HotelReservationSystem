
package com.hotel;

public abstract class Room {
    protected String type;

    public String getType() {
        return type;
    }

    public abstract double getCost();
}
