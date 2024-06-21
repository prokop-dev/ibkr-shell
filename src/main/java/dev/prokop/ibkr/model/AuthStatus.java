package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * <pre>
 * "authStatus":{
 *   "authenticated":true,
 *   "competing":false,
 *   "connected":true,
 *   "message":"",
 *   "MAC":"5C:xx:xx:xx:xx:B0",
 *   "serverInfo":{...},
 *   "hardware_info":"1ff11f11|5C:xx:xx:xx:xx:B0"
 * }
 * </pre>
 */
public class AuthStatus {
    private boolean authenticated;
    private boolean competing;
    private boolean connected;
    private String message;
    @JsonProperty("MAC")
    private String mac;
    private ServerInfo serverInfo;
    @JsonProperty("hardware_info")
    private String hardwareInfo;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isCompeting() {
        return competing;
    }

    public void setCompeting(boolean competing) {
        this.competing = competing;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public ServerInfo getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    public String getHardwareInfo() {
        return hardwareInfo;
    }

    public void setHardwareInfo(String hardwareInfo) {
        this.hardwareInfo = hardwareInfo;
    }

    @Override
    public String toString() {
        return "AuthStatus{" +
                "authenticated=" + authenticated +
                ", competing=" + competing +
                ", connected=" + connected +
                ", message='" + message + '\'' +
                ", mac='" + mac + '\'' +
                ", serverInfo=" + serverInfo +
                ", hardwareInfo='" + hardwareInfo + '\'' +
                '}';
    }
}
