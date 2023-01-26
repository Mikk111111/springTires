package com.organization.springTires.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {

//    @Id
//    @Column(name="tiresale_id")
//    private Integer tireSaleId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private Integer orderId;

    @Column(name="amount")
    private Integer amount;

    @Column(name="sellingprice")
    private Double sellingPrice;

    @Column(name="warehouse_id")
    private Integer warehouseId;

    public Order(Integer amount, Double sellingPrice, Integer warehouseId) {
        this.amount = amount;
        this.sellingPrice = sellingPrice;
        this.warehouseId = warehouseId;
    }
}
