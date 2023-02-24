package pl.nullpointerexception.shop.admin.product.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Entity
@Table(name = "product") //tutaj musi byc adnotacja @Table, bo jest inna nazwa niż w db
@Getter
public class AdminProduct {
    @Id
    //dla MYSQL IDENTITY / POSTGRES SEQUENCE
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    private String currency;
}
