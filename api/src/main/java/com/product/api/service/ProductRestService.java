package com.product.api.service;

import com.product.api.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductRestService {
        @GetMapping(
                value    = "/product/{productId}",
                produces = "application/json")
        Product getProduct(@PathVariable int productId);
}
