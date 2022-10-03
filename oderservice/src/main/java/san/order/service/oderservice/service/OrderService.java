package san.order.service.oderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;
import san.order.service.oderservice.common.Payment;
import san.order.service.oderservice.common.TransactionRequest;
import san.order.service.oderservice.common.TransactionResponse;
import san.order.service.oderservice.entity.Order;
import san.order.service.oderservice.repository.OrderRepository;

@Service
public class OrderService {
    
    private OrderRepository orderRepository;
    private RestTemplate restTemplate;

    @Autowired
    public OrderService(OrderRepository orderRepository, RestTemplate restTemplate) {
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    public TransactionResponse createOrder(TransactionRequest transactionRequest) {
        Order order = transactionRequest.getOrder();
        order = orderRepository.save(order);

        Payment payment = transactionRequest.getPayment();
        payment.setAmount(order.getPrice() * order.getQty());
        payment.setOrderId(order.getId());

        ResponseEntity<Payment> paymentResponseEntity = restTemplate.postForEntity("http://payment-service/payment", payment, Payment.class);

        return new TransactionResponse(order, paymentResponseEntity.getBody());
    }
}
