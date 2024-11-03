package study.statisticquery.core.user.persistence;


import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import study.statisticquery.core.user.domain.User;
import study.statisticquery.core.user.domain.UserEntityReadRepository;
import study.statisticquery.core.user.persistence.mapper.UserRowMapper;

@Repository
public class UserReadDao implements UserEntityReadRepository {

    private final JdbcTemplate template;

    public UserReadDao(JdbcTemplate template) {
        this.template = template;
    }

    public Optional<User> findById(final Long userId) {
        String sql = "select * from users where id = ?";
        return template.query(sql, new Object[] {userId}, new UserRowMapper()).stream().findAny();
    }
}
