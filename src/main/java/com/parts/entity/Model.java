package com.parts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "model", schema = "service_center")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
