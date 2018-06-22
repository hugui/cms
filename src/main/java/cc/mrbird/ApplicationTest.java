package cc.mrbird;

import cc.mrbird.system.domain.User;
import cc.mrbird.system.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {


    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = this.userService.findByName("mrbird");
        System.out.println(user.getUsername());
    }
}
