package com.example.Design.Pattern.creational.Singleton.Filebasedconfigurationmanager;

public class ConfigurationManager extends FileBasedConfigurationManager{

    private static ConfigurationManager instance = null;
    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }


    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value = properties.getProperty(key);

        if (value == null) {
            return null;
        }

        Object convertedValue = null;

        if (type == Integer.class) {
            convertedValue = Integer.parseInt(value);
        } else if (type == Boolean.class) {
            convertedValue = Boolean.parseBoolean(value);
        } else if(type == Double.class) {
            convertedValue = Double.parseDouble(value);
        } else if (type == String.class) {
            convertedValue = String.valueOf(value);
        } else {
            throw new IllegalArgumentException();
        }
        return type.cast(convertedValue);
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }

        properties.setProperty(key, value.toString());

    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);

    }

    @Override
    public void clear() {
        properties.clear();
    }
}
