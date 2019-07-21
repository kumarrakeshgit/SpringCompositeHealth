package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MydbHealthCheck implements HealthIndicator {
    @Autowired
    JdbcTemplate template;
    @Override
    public Health health() {
        int errorCode = check(); // perform some specific health check
        System.out.println("errorcode::"+errorCode);
        if (errorCode != 1) {
            return Health.down().withDetail("Error Code", 500).build();
        }
        return Health.unknown().withDetail("Error Code", 500).build();
    }

    public int check(){
    	
        try {
			List<Object> results = template.query("select 1 from dual",
			        new SingleColumnRowMapper<>());
			return results.size();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
    }
}