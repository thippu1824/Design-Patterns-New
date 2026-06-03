package com.example.Design.Pattern.creational.prototype.ConfigurationManagement;

public interface ConfigurationPrototypeRegistry {

    void addPrototype(String type, Configuration configuration);
    Configuration getPrototype(String type);
    Configuration cloneConfigurationObject(String type);
}
