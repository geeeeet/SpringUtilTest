import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * spring <util>元素的测试
 *
 * @author lirufeng
 * @date 2020/04/04 下午 10:33
 */
public interface IUtilClassService {

    String getConstant();
    List<String> getList();
    Map<String, String> getMap();
    Set<String> getSet();
    Properties getProperties();
    Object getProperty_path();
}
