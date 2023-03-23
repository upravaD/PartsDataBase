package com.parts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "purchase", schema = "service_center")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
//    @ManyToMany
//    @JoinTable(name="purchase_part",
//            joinColumns=  @JoinColumn(name="purchase_id", referencedColumnName="id"),
//            inverseJoinColumns= @JoinColumn(name="part_id", referencedColumnName="id") )
//    private List<Part> parts;
    @ManyToOne
    @JoinColumn(name = "part_id")
    private Part part;
    private Integer count;
    private BigDecimal price;
    @CreationTimestamp
    @Column(name = "purchase_date")
    private LocalDateTime date;
}
