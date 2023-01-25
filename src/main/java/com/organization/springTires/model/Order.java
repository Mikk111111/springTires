package com.organization.springTires.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Id
    @Column(name="tiresale_id")
    private Integer tireSaleId;
    @Column(name="amount")
    private Integer amount;
    @Column(name="sellingprice")
    private Double sellingPrice;
    @Column(name="warehouse_id")
    private Integer warehouseId;
}
