package san.payment.service.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import san.payment.service.paymentservice.entity.Payment;
import san.payment.service.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> doPayment(@RequestBody Payment payment){
        Payment  payment1 = paymentService.doPayment(payment);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(payment1);
    }
}
