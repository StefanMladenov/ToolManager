package com.example.a7mengineering.Api;

import com.example.a7mengineering.data.model.Hospital;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ToolManagerService {

    //region GET
    @GET("/hospital}")
    Call<List<Hospital>> getAllHospitals();
    @GET("/hospital/{id}")
    Call<Hospital> getHospitalById();
    //endregion


}
