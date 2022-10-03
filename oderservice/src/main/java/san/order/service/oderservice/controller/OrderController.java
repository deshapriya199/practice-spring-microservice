package san.order.service.oderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import san.order.service.oderservice.common.TransactionRequest;
import san.order.service.oderservice.common.TransactionResponse;
import san.order.service.oderservice.entity.Order;
import san.order.service.oderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping
    public ResponseEntity<TransactionResponse> createOrder(@RequestBody TransactionRequest transactionRequest){
        TransactionResponse response = orderService.createOrder(transactionRequest);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }

}
