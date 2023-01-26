package com.organization.springTires.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "warehouse")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="warehouse_id")
    private Integer warehouseId;

    @ManyToOne
    @JoinColumn(name="tires_id", nullable=false)
    private Tire tire;

    @Column(name="tirename")
    private String tireName;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="model")
    private String model;

    @Column(name="price")
    private double price;

    @Column(name="amount")
    private Integer amount;

    public Warehouse(Tire tire, String tireName, String manufacturer, String model, double price, Integer amount) {
        this.tire = tire;
        this.tireName = tireName;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }
}
