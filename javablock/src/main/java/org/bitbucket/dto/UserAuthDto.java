package org.bitbucket.dto;

public class UserAuthDto {

    private String login;

    private String password;

    private String confirmPassword;

    private String email;

    private String phone;

    public UserAuthDto(String login, String password, String confirmPassword, String email, String phone) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        this.phone = phone;
    }
}
