package com.example.alexr.ideamanager.services;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by erdinc on 1/16/18.
 */

public interface MessageService {

    @GET("messages")
    Call<String> getMessages();
}
