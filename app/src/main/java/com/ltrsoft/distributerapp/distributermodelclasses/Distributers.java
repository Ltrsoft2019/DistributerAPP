package com.ltrsoft.distributerapp.distributermodelclasses;

import com.ltrsoft.distributerapp.pojoclasses.Distributer_pojo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Distributers {

        @FormUrlEncoded
        @POST("create_distributer.php")
        Call<Distributer_pojo> create_Distributers(
                @Field("distributer_id") int distributer_id,
                @Field("owner_full_name") String  owner_full_name,
                @Field("shop_name") String shop_name,
                @Field("mobile") int mobile,
                @Field("coutry_id") String coutry_id,
                @Field(" state_id") String  state_id,
                @Field("district_id") String district_id,
                @Field("city_id") String city_id,
                @Field("email_id") String email_id,
                @Field("password") String password,
                @Field("address") String address,
                @Field("pan_no") String pan_no,
                @Field("gst_no") int gst_no,
                @Field("is_service_provider") String is_service_provider
        );
        @FormUrlEncoded
        @POST("update_distributer.php")
        Call<Distributer_pojo> update_Distributers(
                @Field("distributer_id") int distributer_id,
                @Field("owner_full_name") String  owner_full_name,
                @Field("shop_name") String shop_name,
                @Field("mobile") int mobile,
                @Field("coutry_id") String coutry_id,
                @Field(" state_id") String  state_id,
                @Field("district_id") String district_id,
                @Field("city_id") String city_id,
                @Field("email_id") String email_id,
                @Field("password") String password,
                @Field("address") String address,
                @Field("pan_no") String pan_no,
                @Field("gst_no") int gst_no,
                @Field("is_service_provider") String is_service_provider
        );
        @GET("read_distributer.php")
        Call<Distributer_pojo> read_by_id_Distributers(
                @Field("distributer_id") int distributer_id
        );
        @GET("readall_distributer.php")
        Call<List<Distributer_pojo>> readall_Distributers();

        @POST("delete_distributer.php")
        Call<Distributer_pojo> delete_Distributers(
                @Field("distributer_id") int distributer_id
        );
    }


