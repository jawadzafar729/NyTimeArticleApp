package com.nytimes.articles.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.nytimes.articles.data.local.entity.ArticleEntity;
import com.nytimes.articles.data.remote.repository.ArticleRepository;
import com.nytimes.articles.utils.SingleLiveEvent;
import com.nytimes.articles.view.callbacks.ResponseListener;

import javax.inject.Inject;

/**
 * ArticleDetails view model
 * <p>
 * Author: Jawad Bin Zafar
 *
 * Created: 2/8/2019
 * Modified: 2/8/2019
 */

public class ArticleDetailsViewModel extends ViewModel {

    private String url;

    private ArticleRepository articleRepository;

    private MutableLiveData<ArticleEntity> articleEntityMutableLiveData = new MutableLiveData<>();

    private SingleLiveEvent<Void> errorMessageRecieved = new SingleLiveEvent<>();

    public MutableLiveData<ArticleEntity> getArticleEntityMutableLiveData() {
        return articleEntityMutableLiveData;
    }

    public void setArticleEntityMutableLiveData(MutableLiveData<ArticleEntity> articleEntityMutableLiveData) {
        this.articleEntityMutableLiveData = articleEntityMutableLiveData;
    }

    public SingleLiveEvent<Void> getErrorMessageRecieved() {
        return errorMessageRecieved;
    }

    public void setErrorMessageRecieved(SingleLiveEvent<Void> errorMessageRecieved) {
        this.errorMessageRecieved = errorMessageRecieved;
    }

    @Inject
    ArticleDetailsViewModel(ArticleRepository artRepository) {
        this.articleRepository = artRepository;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void loadArticleDetails(){

        if(null != articleRepository) {
            articleRepository.loadArticleDetails(url, new ResponseListener() {
                @Override
                public void onSuccess(ArticleEntity data) {
                    articleEntityMutableLiveData.setValue(data);
                }

                @Override
                public void onFailure(String message) {
                    // Send event to UI to show thw error
                    errorMessageRecieved.call();
                }
            });
        }
    }
}
