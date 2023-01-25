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
@Table(name = "tires")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tire {
    @Id
    @Column(name="model")
    private String model;
    @Column(name="modelspecs")
    private String modelSpecs;
}
