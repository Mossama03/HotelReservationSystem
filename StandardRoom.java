
package com.hotel;

public class StandardRoom extends Room {
    public StandardRoom() {
        this.type = "Standard";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
