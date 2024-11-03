package study.statisticquery.core.user.persistence.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import study.statisticquery.core.user.domain.Gender;
import study.statisticquery.core.user.domain.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User(
			rs.getLong("id"),
			rs.getString("name"),
			rs.getString("nickname"),
			Gender.valueOf(rs.getString("gender")),
			rs.getLong("country_id")
		);

		user.init(
			rs.getTimestamp("created_at").toLocalDateTime(),
			rs.getTimestamp("last_modified_at").toLocalDateTime(),
			rs.getBoolean("deleted")
		);

		return user;
	}
}
