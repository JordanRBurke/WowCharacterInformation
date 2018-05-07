package com.jordanburke.wowcharacterinformation.Reputation;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WowReputationInterface {

    @GET("{realm}/{name}")
    Call<ReputationList> getReputationList(@Path("realm") String realmName, @Path("name") String userName, @Query("fields") String field, @Query("locale") String locale, @Query("apiKey") String apiKey);
}
