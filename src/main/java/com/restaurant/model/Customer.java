
package com.restaurant.model;

import com.restaurant.exception.InvalidCustomerException;

public class Customer {

    private final String id;
    private final String name;

    public Customer(String id, String name) {

        if (id == null || id.isBlank()) {
            throw new InvalidCustomerException("Customer ID cannot be empty.");
        }

        if (name == null || name.isBlank()) {
            throw new InvalidCustomerException("Customer name cannot be empty.");
        }

        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
