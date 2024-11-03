package study.statisticquery.core.order.domain;

import java.util.Objects;

import lombok.Getter;
import study.statisticquery.core.common.BaseEntity;

@Getter
public class OrderItem extends BaseEntity {
    private Long id;
    private Long orderId;
    private Long productId;
    private int qty;

    private OrderItem() {
    }

    public OrderItem(
        final Long id,
        final Long orderId,
        final Long productId,
        final int qty
    ) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}