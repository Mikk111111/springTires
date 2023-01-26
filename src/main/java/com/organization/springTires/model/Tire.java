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
    @Id
    @Column(name = "model")
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "model")
    private Warehouse warehouse;
    @Column(name="modelspecs")
    private String modelSpecs;
}
