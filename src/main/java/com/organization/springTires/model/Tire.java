package com.organization.springTires.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tires")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tire {
//    @Id
//    @Column(name = "model")
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "model")

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tires_id")
//    private Warehouse warehouse;
    private Integer tireId;

    @Column(name="modelspecs")
    private String modelSpecs;

    public Tire(String modelSpecs) {
        this.modelSpecs = modelSpecs;
    }
}
