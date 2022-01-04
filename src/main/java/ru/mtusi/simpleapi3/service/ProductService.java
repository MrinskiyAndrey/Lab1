package ru.mtusi.simpleapi3.service;

import ru.mtusi.simpleapi3.model.Product;

import java.util.List;

public interface ProductService {

    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
