package study.statisticquery.core.user.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import lombok.Getter;
import study.statisticquery.core.common.BaseEntity;

@Getter
public class User extends BaseEntity {
    private Long id;
    private String name;
    private String nickname;
    private Gender gender;
    private Long countryId;

    private User() {
    }

    public User(
        final Long id,
        final String name,
        final String nickname,
        final Gender gender,
        final Long countryId
    ) {
        this(id, name, nickname, gender, countryId, null);
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.gender = gender;
        this.countryId = countryId;
    }

    private User(
        final Long id,
        final String name,
        final String nickname,
        final Gender gender,
        final Long countryId,
        final LocalDateTime now
    ) {
        init(now, now, false);
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.gender = gender;
        this.countryId = countryId;
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        final User user = (User) object;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public void init(
        final LocalDateTime createdAt,
        final LocalDateTime lastModifiedAt,
        final boolean deleted
    ) {
        super.createdAt = createdAt;
        super.lastModifiedAt = lastModifiedAt;
        super.deleted = deleted;
    }
}
