
package com.hotel;

public class SuiteRoom extends Room {
    public SuiteRoom() {
        this.type = "Suite";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}
