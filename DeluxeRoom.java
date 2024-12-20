
package com.hotel;

public class DeluxeRoom extends Room {
    public DeluxeRoom() {
        this.type = "Deluxe";
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
