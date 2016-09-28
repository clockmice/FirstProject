package com.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class SqlServerGameRepository implements GameRepository {

    @Autowired
    private DataSource dataSource;



}
