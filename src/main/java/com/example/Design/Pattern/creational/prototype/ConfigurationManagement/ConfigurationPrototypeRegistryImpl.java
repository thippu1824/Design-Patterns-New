package com.example.Design.Pattern.creational.prototype.ConfigurationManagement;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry{

    private final Map<String, Configuration> registry = new HashMap<>();

    private static ConfigurationPrototypeRegistryImpl instance = null;

    private ConfigurationPrototypeRegistryImpl() {

    }

    public static ConfigurationPrototypeRegistryImpl getInstance() {

        if (instance == null) {
            synchronized (ConfigurationPrototypeRegistryImpl.class) {
                if (instance == null) {
                    instance = new ConfigurationPrototypeRegistryImpl();
                }
            }
        }

        return instance;
    }

    @Override
    public void addPrototype(String type, Configuration configuration) {
        registry.put(type, configuration);
    }

    @Override
    public Configuration getPrototype(String type) {
        return registry.get(type);
    }

    @Override
    public Configuration cloneConfigurationObject(String type) {
        Configuration prototype = registry.get(type);
        if (type == null) {
            throw new RuntimeException("No prototype found for type :" + type);
        }

        return prototype.clone();
    }
}
