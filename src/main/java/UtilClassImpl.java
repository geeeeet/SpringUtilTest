import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author lirufeng
 * @date 2020/04/04 下午 9:42
 */
public class UtilClassImpl implements IUtilClassService{

    private String constant;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties properties;
    private Object property_path;

    public void setConstant(String constant){
        this.constant = constant;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String,String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getConstant() {
        return constant;
    }

    public List<String> getList() {
        return list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Set<String> getSet() {
        return set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Object getProperty_path() {
        return property_path;
    }

    public void setProperty_path(Object property_path) {
        this.property_path = property_path;
    }
}
