package san.payment.service.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import san.payment.service.paymentservice.entity.Payment;
import san.payment.service.paymentservice.repository.PaymentRepository;

import java.util.UUID;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    public Payment doPayment(Payment payment) {
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus("Success");
        return paymentRepository.save(payment);
    }
}
