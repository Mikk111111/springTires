package com.organization.springTires.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tires")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "model_id")
    private Integer model_id;

    @Column(name="modelspecs")
    private String modelSpecs;

    @ToString.Exclude
    @OneToMany(mappedBy="tire", fetch = FetchType.EAGER)
    private List<Warehouse> warehouses;

    public Tire(Integer model_id,String modelSpecs) {
        this.model_id = model_id;
        this.modelSpecs = modelSpecs;
    }
}
