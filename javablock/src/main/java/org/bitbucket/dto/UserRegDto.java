package org.bitbucket.dto;

public class UserRegDto {

    private String login;

    private String password;

    public UserRegDto(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
