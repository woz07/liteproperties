package github.woz07.liteproperties.exceptions;

public class PropertiesInvalidKey extends Exception {
    public PropertiesInvalidKey(String key) {
        super("The key provided, '" + key + "' is an invalid key");
    }
}
