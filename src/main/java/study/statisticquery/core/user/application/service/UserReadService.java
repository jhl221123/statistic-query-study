package study.statisticquery.core.user.application.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import study.statisticquery.core.user.application.UserReadUseCase;
import study.statisticquery.core.user.domain.User;
import study.statisticquery.core.user.domain.UserEntityReadRepository;

@Service
@RequiredArgsConstructor
public class UserReadService implements UserReadUseCase {

    private final UserEntityReadRepository userReadRepository;

    @Override
    public User findById(Long userId) {
        return userReadRepository.findById(userId)
            .orElseThrow();
    }
}
