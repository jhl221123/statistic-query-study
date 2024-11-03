package study.statisticquery.core.product.domain;

import java.util.Objects;

import lombok.Getter;
import study.statisticquery.core.common.BaseEntity;

@Getter
public class ProductCategory extends BaseEntity {
    private Long id;
    private Long productId;
    private Long categoryId;

    private ProductCategory() {
    }

    public ProductCategory(
        final Long id,
        final Long productId,
        final Long categoryId
    ) {
        this.id = id;
        this.productId = productId;
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final ProductCategory that = (ProductCategory) object;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

