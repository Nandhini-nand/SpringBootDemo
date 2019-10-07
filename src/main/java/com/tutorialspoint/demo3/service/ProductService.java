package com.tutorialspoint.demo3.service;

import java.util.Collection;
import com.tutorialspoint.demo3.model.Product;

public interface ProductService {
   public abstract void createProduct(Product product);
   public abstract void updateProduct(String id, Product product);
   public abstract void deleteProduct(String id);
   public abstract Collection<Product> getProducts();
}
