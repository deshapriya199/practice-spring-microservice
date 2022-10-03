package san.order.service.oderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import san.order.service.oderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{
    
}
