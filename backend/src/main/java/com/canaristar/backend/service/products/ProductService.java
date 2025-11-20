package com.canaristar.backend.service.products;

import com.canaristar.backend.entity.Products;
import com.canaristar.backend.enums.ProductCategory;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Optional<Products> findById(String id);
    List<Products> findAll();
    Optional<Products> findByProductName(String name);
    List<Products> findByProductCategory(ProductCategory category);
    List<Products> findByActive(boolean active);
    List<Products> findByFeatured(boolean featured);
    List<Products> findByActiveAndFeatured(boolean active, boolean featured);
    List<Products> findByProductCategoryAndActive(ProductCategory category, boolean active);
}