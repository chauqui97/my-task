package com.example.demo.controller;

import com.example.demo.domain.entity.ShippingFee;
import com.example.demo.repository.ShippingFeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ShippingFeeController {

    private final ShippingFeeRepository shippingFeeRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ShippingFee> findAll() {
        return shippingFeeRepository.findAll();
    }
}
