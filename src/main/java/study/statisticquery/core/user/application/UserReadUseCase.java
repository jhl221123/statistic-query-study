package study.statisticquery.core.user.application;

import study.statisticquery.core.user.domain.User;

public interface UserReadUseCase {
    User findById(Long userId);
}
