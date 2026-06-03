package com.example.Design.Pattern.creational.prototype.ConfigurationManagement;

public class Configuration implements Configurable<Configuration>{

    private String configId;
    private String configName;
    private String configValue;
    private boolean isEnabled;
    private String type;

    public Configuration() {
    }

    public Configuration(String configId, String configName, String configValue, boolean isEnabled, String type) {
        this.configId = configId;
        this.configName = configName;
        this.configValue = configValue;
        this.isEnabled = isEnabled;
        this.type = type;
    }

    @Override
    public Configuration clone() {
        Configuration configurationCopy = new Configuration();

        configurationCopy.configId = this.configId;
        configurationCopy.configName = this.configName;
        configurationCopy.configValue = this.configValue;
        configurationCopy.isEnabled = this.isEnabled;
        configurationCopy.type = this.type;

        return configurationCopy;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Configuration{" +
            "configId='" + configId + '\'' +
            ", configName='" + configName + '\'' +
            ", configValue='" + configValue + '\'' +
            ", isEnabled=" + isEnabled +
            ", type='" + type + '\'' +
            '}';
    }
}
