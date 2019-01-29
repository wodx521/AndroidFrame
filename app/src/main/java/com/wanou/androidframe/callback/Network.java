package com.wanou.androidframe.callback;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Author by wodx521
 * Date on 2018/11/15.
 */
public interface Network {
//    @GET("/path/to/api")
//    Call<List<String>> getAllPhotos();

    @GET("/path/to/api")
    Observable<List<String>> getAllPhotos();
}
