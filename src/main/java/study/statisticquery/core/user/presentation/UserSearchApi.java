package study.statisticquery.core.user.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import study.statisticquery.core.user.domain.User;
import study.statisticquery.core.user.domain.UserEntityReadRepository;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserSearchApi {

    private final UserEntityReadRepository userReadRepository;

    @GetMapping(path = "/{userId}")
    public User findById(@PathVariable(name = "userId") Long userId) {

        return userReadRepository.findById(userId).get();
    }
}
