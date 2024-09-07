import github.woz07.liteproperties.Properties;
import github.woz07.liteproperties.exceptions.PropertiesInvalidKey;

public class Main {
    public static void main(String[] args) throws PropertiesInvalidKey {
        Properties properties = new Properties();
        properties.set("key", 10);

        System.out.println(properties.get(null));
    }
}
