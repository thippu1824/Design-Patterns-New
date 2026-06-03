package com.example.Design.Pattern.creational.Singleton.Filebasedconfigurationmanager;

public class Main {

    public static void main(String[] args) {
        try {

            ConfigurationManager configurationManager = ConfigurationManager.getInstance();

            configurationManager.load("C:\\Workspace-Personal\\Design-Pattern\\src\\main\\resources\\application.properties");

            String appName = configurationManager.getConfiguration("spring.application.name");
            String version = configurationManager.getConfiguration("app.version");
            Integer users = configurationManager.getConfiguration("max.users", Integer.class);
            Boolean debug = configurationManager.getConfiguration("debug", Boolean.class);
            Double price = configurationManager.getConfiguration("price", Double.class);

            configurationManager.setConfiguration("environment", "Dev");
            configurationManager.setConfiguration("test", 100.22);

            System.out.println(appName);
            System.out.println(version);
            System.out.println(users);
            System.out.println(debug);
            System.out.println(price);
            System.out.println(configurationManager.getConfiguration("environment"));
            System.out.println(configurationManager.getConfiguration("test"));
            configurationManager.removeConfiguration("app.version");
            System.out.println(configurationManager.getConfiguration("version"));

            ConfigurationManager another = ConfigurationManager.getInstance();

            System.out.println(configurationManager == another);


        } catch (Exception e) {

        }

    }
}
