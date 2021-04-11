package org.bitbucket.micro.orm;

import java.sql.ResultSet;

public interface CustomRowMapper<T> {

    T rowMap(ResultSet rs);
}
