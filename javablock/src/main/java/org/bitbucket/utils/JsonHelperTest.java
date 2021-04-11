package org.bitbucket.utils;

import org.bitbucket.entity.User;
import org.junit.Test;

public class JsonHelperTest {

    private String str1 = "Test-1, maybe";

    private Integer int1 = 9888;

    private User user = new User(1222,"Denys","Fedorovych","sssss","login","password","+234234234");

    @Test
    public void toFormatOutFormatEqualityString() {
        String str = JsonHelper.toFormat(str1).get();
    }

    @Test
    public void fromFormat() {
    }
}