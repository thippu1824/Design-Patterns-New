package com.example.Design.Pattern.creational.builder.DBConfigClass;

public class DatabaseConfiguration {

    private String url;
    private String username;
    private String password;
    private String databaseName;
    private int port;
    private boolean sslEnabled;

    private DatabaseConfiguration(DatabaseConfigurationBuilder builder) {
        this.url = builder.url;
        this.username = builder.username;
        this.password = builder.password;
        this.databaseName = builder.databaseName;
        this.port = builder.port;
        this.sslEnabled = builder.sslEnabled;
    }

    public static DatabaseConfigurationBuilder getBuilder() {
        return new DatabaseConfigurationBuilder();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public static class DatabaseConfigurationBuilder {

        String url;
        String username;
        String password;
        String databaseName;
        int port;
        boolean sslEnabled;

        public DatabaseConfigurationBuilder url(String url) {
            this.url = url;
            return this;
        }

        public DatabaseConfigurationBuilder username(String username) {
            this.username = username;
            return this;
        }

        public DatabaseConfigurationBuilder password(String password) {
            this.password = password;
            return this;
        }

        public DatabaseConfigurationBuilder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public DatabaseConfigurationBuilder port(int port) {
            this.port = port;
            return this;
        }

        public DatabaseConfigurationBuilder sslEnabled(boolean sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public DatabaseConfiguration build() {
            return new DatabaseConfiguration(this);
        }
    }
}
