package com.medinventory.models;

import jakarta.persistence.*;

@Entity
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;
    private int quantity;
    private double price;

    // Getters and Setters
}
