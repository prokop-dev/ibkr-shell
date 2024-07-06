package dev.prokop.ibkr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tickle {

    /**
     * the session identifier of your connection.
     */
    private String session;
    /**
     * the time until session expiry in milliseconds.
     */
    @JsonProperty("ssoExpires")
    private int expiry;

    /**
     * Internal use only.
     */
    private boolean collission;

    /**
     * Internal use only.
     */
    private int userId;

    private IServer iserver;

    /**
     * Returns the time until session expiry in milliseconds.
     *
     * @return time until session expiry
     */
    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    /**
     * Returns the session identifier of your connection.
     * Can be used for the cookie parameter of your request.
     *
     * @return the session identifier
     */
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public boolean isCollission() {
        return collission;
    }

    public void setCollission(boolean collission) {
        this.collission = collission;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public IServer getIserver() {
        return iserver;
    }

    public void setIserver(IServer iserver) {
        this.iserver = iserver;
    }

    public static class IServer{
        private AuthStatus authStatus;

        public AuthStatus getAuthStatus() {
            return authStatus;
        }

        public void setAuthStatus(AuthStatus authStatus) {
            this.authStatus = authStatus;
        }
    }

    @Override
    public String toString() {
        return "Tickle{" +
                "session='" + session + '\'' +
                ", expiry=" + expiry +
                ", authStatus=" + iserver.getAuthStatus() +
                '}';
    }
}
