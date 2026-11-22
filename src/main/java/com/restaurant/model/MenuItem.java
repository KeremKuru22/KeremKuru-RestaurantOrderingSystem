
package com.restaurant.model;

import java.math.BigDecimal;
import com.restaurant.exception.InvalidMenuItemException;

public abstract class MenuItem {

    private final String id;
    private final String name;
    private final BigDecimal price;

    protected MenuItem(String id, String name, BigDecimal price) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Item ID cannot be empty.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }

        if (price == null || price.signum() <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
