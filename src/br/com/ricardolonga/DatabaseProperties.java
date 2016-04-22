package br.com.ricardolonga;

public enum DatabaseProperties {

    INSTANCE;

    private String host = "localhost";

    public static DatabaseProperties getInstance() {
        return INSTANCE;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHost() {
        return host;
    }
    
}
