import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lirufeng
 * @date 2020/04/04 下午 11:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class PropertyPlaceholderTest {

    @Autowired
    private PropertyPlaceholder property_placeholder;

    @Test
    public void propertyPlaceholderTest() {
        System.out.println(property_placeholder.getName());
        System.out.println(property_placeholder.getGender());
    }
}
