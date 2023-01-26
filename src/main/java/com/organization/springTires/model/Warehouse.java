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

    @Column(name="tirename")
    private String tireName;

    @Column(name="manufacturer")
    private String manufacturer;

    @Column(name="model")
    private String model;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "model",referencedColumnName = "model")
//    private String model;
//    @OneToOne(mappedBy = "warehouse",cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//    private Tire tire;
    @Column(name="price")
    private double price;
    @Column(name="amount")
    private Integer amount;

    public Warehouse(String tireName, String manufacturer, String model, double price, Integer amount) {
        this.tireName = tireName;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.amount = amount;
    }
}
