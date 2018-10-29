package com.daksh.kuro.signin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SignInAPi {

        @FormUrlEncoded
        @POST("register")
        Call<RegisterUser> post(
                @Field("email") String email,
                @Field("password") String password,
                @Field("name") String name,
                @Field("phone")String phone,
                @Field("location")String location,
                @Field("city")String city,
                @Field("business_name")String business_name);

}
