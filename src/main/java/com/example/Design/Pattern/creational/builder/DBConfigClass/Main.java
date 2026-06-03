package com.example.Design.Pattern.creational.builder.DBConfigClass;

public class Main {

    public static void main(String[] args) {

        DatabaseConfiguration config = DatabaseConfiguration.getBuilder()
            .url("https://www.scaler.com/")
            .username("swamy")
            .password("admin")
            .port(3306)
            .databaseName("accounts")
            .sslEnabled(true)
            .build();

        System.out.println(config.getDatabaseName());
        System.out.println(config.getPort());

    }
}
