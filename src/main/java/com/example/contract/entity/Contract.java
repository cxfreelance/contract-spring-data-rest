package com.example.contract.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String status;

    @ManyToMany
    @JoinTable(
            name = "contract_driver",
            joinColumns = @JoinColumn(
                    name = "contract_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "driver_id", referencedColumnName = "id"))
    private List<Driver> drivers;

}
