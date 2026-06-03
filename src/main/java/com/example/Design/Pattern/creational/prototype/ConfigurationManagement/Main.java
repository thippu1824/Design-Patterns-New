package com.example.Design.Pattern.creational.prototype.ConfigurationManagement;

public class Main {

    public static void main(String[] args) {

        ConfigurationPrototypeRegistryImpl registry = ConfigurationPrototypeRegistryImpl.getInstance();

        Configuration devConfig = new Configuration("101", "dbconfig", "Dev:3306", true, "dev");

        Configuration prodConfig = new Configuration("201", "dbconfig", "Prod:3306", true, "prod");

        registry.addPrototype("dev", devConfig);
        registry.addPrototype("prod", prodConfig);

        Configuration devConfigCloneObject = registry.cloneConfigurationObject("dev");

        devConfigCloneObject.setConfigId("102");
        devConfigCloneObject.setConfigValue("test-db-server:3306");

        System.out.println("Original dev config :" + devConfig);
        System.out.println("Cloned dev config " + devConfigCloneObject);

        System.out.println(devConfig == devConfigCloneObject);
    }
}
