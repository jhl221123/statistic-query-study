package study.statisticquery.core.product.domain;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.Getter;
import study.statisticquery.core.common.BaseEntity;

@Getter
public class Product extends BaseEntity {
    private Long id;
    private String name;
    private BigDecimal price;
    private int qty;
    private Long shopId;

    private Product() {
    }

    public Product(
        final Long id,
        final String name,
        final int qty,
        final BigDecimal price,
        final Long shopId
    ) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.shopId = shopId;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Product product = (Product) object;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
