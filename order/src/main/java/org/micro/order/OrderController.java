package org.micro.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/test/product/{id}")
    public ResponseEntity<String> testProductCommunication(@PathVariable("id") Long id) {
        String response = orderService.testProductServiceCommunication(id);
        return ResponseEntity.ok(response);
    }
}