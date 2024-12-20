
package com.hotel;

public class CustomerFactory {
    public static Customer createCustomer(String profile) {
        switch (profile.toLowerCase()) {
            case "regular":
                return new RegularCustomer();
            case "vip":
                return new VIPCustomer();
            case "corporate":
                return new CorporateCustomer();
            default:
                throw new IllegalArgumentException("Unknown customer profile: " + profile);
        }
    }
}
