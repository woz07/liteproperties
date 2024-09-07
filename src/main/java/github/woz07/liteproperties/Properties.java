package github.woz07.liteproperties;

import github.woz07.liteproperties.exceptions.PropertiesInvalidKey;

import java.util.HashMap;

/**
 * Properties.java
 * The main library class that the developer interacts with
 * for their stored data
 */

public class Properties {
    private final HashMap<String, Object> data = new HashMap<>();
    public Properties() {}

    // Methods related to data updating
    //
    /**
     * This method allows you to add data to your properties object
     * @param key The key to associate the value to
     * @param value The value to associate the key to
     * @return True if it managed to associate it else false
     */
    public boolean set(String key, Object value) throws PropertiesInvalidKey {
        // If key is null
        if (key == null) {
            throw new PropertiesInvalidKey(key);
        }

        // If key exists already then return false
        if (exists(key)) {
            return false;
        }

        // Otherwise set value into data
        data.put(key, value);
        return true;
    }

    /**
     * This method allows you to get data from your properties object
     * @param key The key to get the value from
     * @return The value associated to the key
     */
    public Object get(String key) throws PropertiesInvalidKey {
        // If key is null
        if (key == null) {
            throw new PropertiesInvalidKey(key);
        }

        // If key doesn't exist then return null
        if (!exists(key)) {
            return null;
        }

        // Otherwise return value associated to key
        return data.get(key);
    }

    /**
     * This method allows you to remove data from your properties object
     * @param key The key to remove
     * @return True if it managed to remove the associated keey and value else false
     */
    public boolean remove(String key) throws PropertiesInvalidKey {
        // If key is null
        if (key == null) {
            throw new PropertiesInvalidKey(key);
        }

        // If key doesn't exist then return false
        if (!exists(key)) {
            return false;
        }

        // Otherwise remove the associated key and return true
        data.remove(key);
        return true;
    }

    // Methods related to data validation
    //

    /**
     * This methods checks to see if a key exists
     * @param key The key you want to check to see if it exists
     * @return True if a key exists, else false
     */
    public boolean exists(String key) {
        if (data.get(key) != null)
            return true;
        return false;
    }
}