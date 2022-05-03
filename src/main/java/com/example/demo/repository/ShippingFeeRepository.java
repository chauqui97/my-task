package com.example.demo.repository;

import com.example.demo.domain.entity.ShippingFee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingFeeRepository extends JpaRepository<ShippingFee, Long>, JpaSpecificationExecutor<ShippingFee> {

}
