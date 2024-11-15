package com.tpe.microservicio_travels.repository;

import com.tpe.microservicio_travels.entity.BillingMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingMethodRepository extends JpaRepository<BillingMethod, Long> {
}
