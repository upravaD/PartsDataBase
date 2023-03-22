package com.parts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "client", schema = "service_center")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    private String surname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    @JoinColumn(name = "purchase_id")
    private List<Purchase> purchases;
}
