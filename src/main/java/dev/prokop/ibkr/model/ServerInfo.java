package dev.prokop.ibkr.model;

/**
 * This object is part of response from /tickle and /iserver/auth/status.
 *
 * <pre>
 * "serverInfo":{
 *   "serverName":"XxxX77777",
 *   "serverVersion":"Build 10.29.0d, May 30, 2024 6:36:39 PM"
 * }
 * </pre>
 */
public class ServerInfo {

    /**
     * IBKR server information. Internal use only.
     */
    private String serverName;

    /**
     * IBKR version information. Internal use only.
     */
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
