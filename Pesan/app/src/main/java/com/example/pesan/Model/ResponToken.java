
package com.example.pesan.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponToken {

    @SerializedName("accessToken")
    @Expose
    private String accessToken;
    @SerializedName("tokenType")
    @Expose
    private String tokenType;

    /**
     * No args constr  uctor for use in serialization
     * 
     */
    public ResponToken() {
    }

    /**
     * 
     * @param accessToken
     * @param tokenType
     */
    public ResponToken(String accessToken, String tokenType) {
        super();
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

}
