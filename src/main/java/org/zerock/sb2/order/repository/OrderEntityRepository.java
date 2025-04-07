package org.zerock.sb2.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.sb2.order.entities.OrderEntity;

public interface OrderEntityRepository extends JpaRepository<OrderEntity, Long> {
}
