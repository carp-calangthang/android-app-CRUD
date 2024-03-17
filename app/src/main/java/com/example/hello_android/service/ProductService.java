package com.example.hello_android.service;

import com.example.hello_android.entities.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ProductService {
    @GET("products")
    Call<List<Product>> getAllProducts();

    @POST("products")
    Call<Product> addProducts(@Body Product product);
}