package org.micro.order;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ProductClient productClient;

    public OrderService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public String testProductServiceCommunication(Long id) {
        return productClient.getProductById(id);
    }
}