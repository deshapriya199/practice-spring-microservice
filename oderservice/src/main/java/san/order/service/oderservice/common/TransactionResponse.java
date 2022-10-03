package san.order.service.oderservice.common;

import san.order.service.oderservice.entity.Order;

public class TransactionResponse {

    private Order order;
    private Payment payment;

    public TransactionResponse() {
    }

    public TransactionResponse(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
