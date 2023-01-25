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
@Table(name = "warehouse")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Warehouse {
    @Id
    @Column(name="id")
    private Integer id;
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
}
