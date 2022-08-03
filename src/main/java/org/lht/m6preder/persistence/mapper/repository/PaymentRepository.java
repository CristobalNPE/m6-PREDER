package org.lht.m6preder.persistence.mapper.repository;

import org.lht.m6preder.domain.dto.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {

  List<Payment> findAll();

  Optional<Payment> findById(Long paymentId);

  Payment save(Payment payment);

  void delete(Long paymentId);

}
