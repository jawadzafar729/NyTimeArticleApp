package com.nytimes.articles.data.remote;

import com.nytimes.articles.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The APIService interface which will contain the semantics of all the REST calls.
 * Author: Jawad Bin Zafar
 *
 * Created: 2/8/2019
 * Modified: 2/8/2019
 */
public interface ApiService {

    @GET("svc/mostpopular/v2/viewed/{index}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("index") int index);

    /*https://api.nytimes.com/svc/mostpopular/v2/viewed/1.json?api-key=9G59YbJ4CoA4HXhF58L8GjC3LyAGjn3L*/
}
