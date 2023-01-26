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
    @Column(name = "tires_id")
    private Integer tireId;

    @Column(name="modelspecs")
    private String modelSpecs;

    @ToString.Exclude
    @OneToMany(mappedBy="tire", fetch = FetchType.EAGER)
    private List<Warehouse> warehouses;

    public Tire(String modelSpecs) {
        this.modelSpecs = modelSpecs;
    }
}
