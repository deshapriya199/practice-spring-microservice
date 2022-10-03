package san.order.service.oderservice.common;

public class Payment {
    private String paymentStatus;
    private String transactionId;
    private Double amount;
    private Integer orderId;

    public Payment() {
    }

    public Payment(String paymentStatus, String transactionId, Double amount) {
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
