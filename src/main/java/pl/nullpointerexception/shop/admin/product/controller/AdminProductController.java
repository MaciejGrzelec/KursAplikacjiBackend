package pl.nullpointerexception.shop.admin.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.shop.admin.product.model.AdminProduct;
import pl.nullpointerexception.shop.admin.product.service.AdminProductService;

@RestController
@RequiredArgsConstructor
public class AdminProductController {
    private final AdminProductService productService;

    @GetMapping("/admin/products")
    public Page<AdminProduct> getProducts(Pageable pageable){
        return productService.getProducts(pageable);
    }
}