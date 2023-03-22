package com.parts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "part", schema = "service_center")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Part {
    @Id
    @GeneratedValue
    private Long id;
    private String number;
    private String name;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
