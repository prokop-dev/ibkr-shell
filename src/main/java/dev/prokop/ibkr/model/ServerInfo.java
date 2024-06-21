package dev.prokop.ibkr.model;

/**
 * <pre>
 * "serverInfo":{
 *   "serverName":"XxxX77777",
 *   "serverVersion":"Build 10.29.0d, May 30, 2024 6:36:39 PM"
 * }
 * </pre>
 */
public class ServerInfo {
    private String serverName;
    private String serverVersion;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    @Override
    public String toString() {
        return "{name='" + serverName + "', version='" + serverVersion + "'}";
    }
}
