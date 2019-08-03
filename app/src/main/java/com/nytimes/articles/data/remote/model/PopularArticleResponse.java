package com.nytimes.articles.data.remote.model;

import com.google.gson.annotations.SerializedName;
import com.nytimes.articles.data.local.entity.ArticleEntity;

import java.util.List;

/**
 * The model class which holds the top popular articles data
 * Author: Jawad Bin Zafar
 *
 * Created: 2/8/2019
 * Modified: 2/8/2019
 */
public class  PopularArticleResponse {

    @SerializedName("results")
    private List<ArticleEntity> popularArticles;


    /**
     * This method return the list of article entities
     * @return List of entities
     */
    public List<ArticleEntity> getPopularArticles() {
        return popularArticles;
    }

    /**
     * This method sets the article entities
     * @param popularArticles - articleslist
     */
    @SuppressWarnings("unused")
    public void setPopularArticles(List<ArticleEntity> popularArticles) {
        this.popularArticles = popularArticles;
    }
}
