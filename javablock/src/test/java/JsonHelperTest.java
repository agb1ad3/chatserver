import org.bitbucket.entity.User;
import org.bitbucket.utils.JsonHelper;
import org.junit.Assert;
import org.junit.Test;

public class JsonHelperTest {

    private String str1 = "Test-1, maybe";

    private Integer int1 = 9888;

    private User user = new User(1222,"Denys","Fedorovych","sssss","login","password","+234234234");

    @Test
    public void toFormatOutFormatEqualityString() {
        String str = JsonHelper.toFormat(str1).get();
        Assert.assertEquals(str1,JsonHelper.fromFormat(str,String.class).get());
    }

    @Test
    public void toFormatOutFormatEqualityInteger() {
        String str = JsonHelper.toFormat(int1).get();
        Assert.assertEquals(int1,JsonHelper.fromFormat(str,Integer.class).get());
    }

    @Test
    public void toFormatOutFormatEqualityUser() {
        String str = JsonHelper.toFormat(user).get();
        Assert.assertEquals(user,JsonHelper.fromFormat(str,User.class).get());
    }

}