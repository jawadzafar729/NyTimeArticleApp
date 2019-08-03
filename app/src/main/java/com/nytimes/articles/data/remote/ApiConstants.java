package com.nytimes.articles.data.remote;


/**
 * Keep all the service related constants here.
 * Author: Jawad Bin Zafar
 *
 * Created: 2/8/2019
 * Modified: 2/8/2019
 */
public class ApiConstants {
    public static final String BASE_URL = "https://api.nytimes.com/";
    public static final long CONNECT_TIMEOUT = 30000;
    public static final long READ_TIMEOUT = 30000;
    public static final long WRITE_TIMEOUT = 30000;
    public static final String API_KEY = "9G59YbJ4CoA4HXhF58L8GjC3LyAGjn3L";



    private ApiConstants(){
        // Private constructor to hide the implicit one
    }

}
