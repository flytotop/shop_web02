import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shop.dto.User;
import com.shop.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    @Test
    public void testhelper() {

        //2.初始化spring 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        //3.获取mapper的代理对象
        UserMapper userMapper=context.getBean(UserMapper.class);
        User user=new User();
        System.out.println(userMapper.login("0","1"));
    }
}
