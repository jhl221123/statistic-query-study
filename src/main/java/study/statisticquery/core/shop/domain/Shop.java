package study.statisticquery.core.shop.domain;

import java.util.Objects;

import lombok.Getter;
import study.statisticquery.core.common.BaseEntity;

@Getter
public class Shop extends BaseEntity {
    private Long id;
    private String name;
    private Long userId;
    private String uniqueNumber;

    private Shop() {
    }

    public Shop(
        final Long id,
        final String name,
        final Long userId,
        final String uniqueNumber
    ) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.uniqueNumber = uniqueNumber;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final Shop shop = (Shop) object;
        return Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
