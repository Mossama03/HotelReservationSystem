
package com.hotel;

public class RoomFactory {
    public static Room createRoom(String type) {
        switch (type.toLowerCase()) {
            case "standard":
                return new StandardRoom();
            case "deluxe":
                return new DeluxeRoom();
            case "suite":
                return new SuiteRoom();
            default:
                throw new IllegalArgumentException("Unknown room type: " + type);
        }
    }
}
