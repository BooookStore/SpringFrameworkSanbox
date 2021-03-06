package com.example.persistence;

import com.example.domain.coffeebean.CoffeeBean;
import com.example.domain.coffeebean.CoffeeBeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
public class PostgreSQLCoffeeBeanRepository implements CoffeeBeanRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public PostgreSQLCoffeeBeanRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CoffeeBean> getAllCoffeeBean() {
        final String GET_ALL_COFFEEBEAN = "SELECT * FROM coffeebean";
        return jdbcTemplate.query(GET_ALL_COFFEEBEAN, Collections.emptyMap(), new CoffeeBeanMapper());
    }

    @Override
    public int nextId() {
        final String NEXTVAL_COFFEEBEAN_ID = "SELECT nextval('coffeebean_id')";
        return jdbcTemplate.queryForObject(NEXTVAL_COFFEEBEAN_ID, Collections.emptyMap(), Integer.class);
    }

    private static final class CoffeeBeanMapper implements RowMapper<CoffeeBean> {

        @Override
        public CoffeeBean mapRow(ResultSet rs, int index) throws SQLException {
            return new CoffeeBean(rs.getInt("ID"), rs.getString("NAME"));
        }
    }

}
