import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lirufeng
 * @date 2020/04/04 下午 9:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class SpringUtilTest {

    @Autowired
    private IUtilClassService utilClass;

    @Autowired
    private AnotherWayGetPropertiesValue anotherWay;

    @Test
    @Ignore
    public void utilConstant_Test(){
        System.out.println(utilClass.getConstant());
    }

    @Test
    @Ignore
    public void utilList_Test() {
        List<String> list = utilClass.getList();
        System.out.println(list.toString());
    }

    @Test
    @Ignore
    public void utilMap_Test() {
        Map<String,String> map = utilClass.getMap();
        System.out.println(map.toString());
    }

    @Test
    @Ignore
    public void utilSet_Test() {
        Set<String> set = utilClass.getSet();
        System.out.println(set.toString());
    }

    @Test
    @Ignore
    public void utilProperties_Test() {
        Properties properties = utilClass.getProperties();
        System.out.println(properties.getProperty("person.name"));
        System.out.println(properties.getProperty("person.gender"));
    }

    @Test
    @Ignore
    public void utilPropertyPath_Test() {
        Object property_path = utilClass.getProperty_path();
        System.out.println(property_path);
    }

    ///////////////////////////////分割线///////////////////////////////
    @Test
    @Ignore
    public void utilPropertiesAnotherWay_Test() {
        System.out.println(anotherWay.getGender());
    }
}
