package com.canaristar.backend.entity;

import com.canaristar.backend.enums.ProductCategory;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "products")
@Data
public class Products {

    @Id
    private String id;

    private String productName;
    private String productDescription;
    private ProductCategory productCategory;

    private double sellingPrice;
    private double mrpPrice;

    private List<String> imageUrls;

    private boolean active;
    private boolean featured;
}
