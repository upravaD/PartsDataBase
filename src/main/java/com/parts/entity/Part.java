package com.parts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "part", schema = "service_center")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String name;
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;
}
