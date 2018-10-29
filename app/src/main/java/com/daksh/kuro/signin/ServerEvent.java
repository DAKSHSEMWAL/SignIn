package com.daksh.kuro.signin;

public class ServerEvent {
    private RegisterUser serverResponse;

    public ServerEvent(RegisterUser serverResponse) {
        this.serverResponse = serverResponse;
    }

    public RegisterUser getServerResponse() {
        return serverResponse;
    }

    public void setServerResponse(RegisterUser serverResponse) {
        this.serverResponse = serverResponse;
    }
}
