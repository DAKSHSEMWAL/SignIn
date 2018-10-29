package com.daksh.kuro.signin;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterUser {

    @SerializedName("email")
    public String email;
    @SerializedName("password")
    public String password;
    @SerializedName("phone")
    public String phone;
    @SerializedName("location")
    public String location;
    @SerializedName("city")
    public String city;
    @SerializedName("name")
    public String name;
    @SerializedName("business_name")
    public String business_name;

    @SerializedName("status")
    @Expose
    private Boolean status;

    @SerializedName("message")
    @Expose
    private String message;

    public RegisterUser(String email, String password, String name, String phone, String location, String city,  String business_name) {
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.location = location;
        this.city = city;
        this.name = name;
        this.business_name = business_name;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}