package com.parts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "brand", schema = "service_center")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
}
