package org.bitbucket.dto;

import org.bitbucket.micro.orm.CustomJdbcTemplate;
import org.bitbucket.micro.orm.CustomRowMapper;

public class UserAuthorizationDto {

    private String login;

    private String password;

    public UserAuthorizationDto(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static CustomRowMapper<UserAuthorizationDto> customRowMapper(){
        return rs -> new UserAuthorizationDto(
                rs.getString("login"),
                rs.getString("password")
        );
    }
}
