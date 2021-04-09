package org.bitbucket.micro.orm;

import java.sql.ResultSet;

public interface CustomRowExtractor<T> {
    T extract(ResultSet rs);
}
