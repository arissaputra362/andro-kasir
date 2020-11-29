package com.example.androkasir.rest;

import com.example.androkasir.Response.Data_Response;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface InterfaceConnection {
    @GET("barang")
    Call<Data_Response> daftar_barang();

    @FormUrlEncoded
    @POST("barang/tambah_barang")
    Call<Data_Response> tambah_barang(
            @Field("namaBarang") String namaBarang,
            @Field("jmlBarang") String jmlBarang
    );

    @DELETE("barang/delete/{kode_barang}")
    Call<Data_Response> hapus_barang(@Path("kode_barang") String id
    );

    @FormUrlEncoded
    @PUT("barang/update/{kode_barang}")
    Call<Data_Response> update_barang(@Path("kode_barang") String id,
                                      @Field("nama_barang") String nama_barang,
                                      @Field("jumlah_barang") String jumlah_barang
    );
}
