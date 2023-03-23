package com.parts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category", schema = "service_center")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
