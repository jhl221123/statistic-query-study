package study.statisticquery.core.common;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public abstract class BaseEntity {
    protected LocalDateTime createdAt;
    protected LocalDateTime lastModifiedAt;
    protected boolean deleted;

    protected void init(
        final LocalDateTime createdAt,
        final LocalDateTime lastModifiedAt,
        final boolean deleted
    ) {
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.deleted = deleted;
    }
}
