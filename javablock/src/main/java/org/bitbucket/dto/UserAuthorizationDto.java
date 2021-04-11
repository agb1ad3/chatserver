package org.bitbucket.dto;

public class UserAuthorizationDto {

    private String login;

    private String password;

    public UserAuthorizationDto(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
