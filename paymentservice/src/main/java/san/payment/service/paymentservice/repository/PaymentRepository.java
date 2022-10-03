package san.payment.service.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import san.payment.service.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
