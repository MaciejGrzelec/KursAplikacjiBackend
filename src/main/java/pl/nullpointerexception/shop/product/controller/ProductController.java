package pl.nullpointerexception.shop.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.shop.product.model.Product;
import pl.nullpointerexception.shop.product.service.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

/*    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK)
                .lastModified(ZonedDateTime.of(LocalDateTime.now(ZoneId.of("Europe/Warsaw")), ZoneId.of("Europe/Warsaw")))
                .body(productService.getProducts());
    }*/

/*    @GetMapping("/products")
    public Page<Product> getProducts(@RequestParam(required = false) int page,
                                     @RequestParam(required = false, defaultValue = "25") int size) {
        if (size > 100) {
            throw new IllegalArgumentException("Wielkość strony jest zbyt duża");
        }
        return productService.getProducts(page, size);
    }*/

    // pageable ma defaultowo zaszyte checki
    @GetMapping("/products")
    public Page<Product> getProducts(@PageableDefault(size = 10) Pageable pageable) {
        return productService.getProducts(pageable);
    }

/*    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.status(HttpStatus.OK)
                .lastModified(ZonedDateTime.of(LocalDateTime.now(ZoneId.of("Europe/Warsaw")), ZoneId.of("Europe/Warsaw")))
                .header()
                .body(productService.getProducts());
    }*/
}
