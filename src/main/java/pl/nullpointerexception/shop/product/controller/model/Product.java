package pl.nullpointerexception.shop.product.controller.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.annotation.EnableMBeanExport;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Product {
    public String name;
    public String category;
    public String description;
    public BigDecimal price;
    public String currency;
}
