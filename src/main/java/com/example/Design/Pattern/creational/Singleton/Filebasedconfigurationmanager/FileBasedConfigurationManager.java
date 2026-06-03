package com.example.Design.Pattern.creational.Singleton.Filebasedconfigurationmanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class FileBasedConfigurationManager {

    Properties properties = new Properties();

    public void load(String filePath) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(filePath);

        properties.load(fileInputStream);

        fileInputStream.close();
    }


    public abstract String getConfiguration(String key);

    public abstract <T> T getConfiguration(String key, Class<T> type);

    public abstract void setConfiguration(String key, String value);

    public abstract <T> void setConfiguration(String key, T value);

    public abstract void removeConfiguration(String key);

    public abstract void clear();
}
