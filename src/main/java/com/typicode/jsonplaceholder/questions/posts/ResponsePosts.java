package com.typicode.jsonplaceholder.questions.posts;

import com.typicode.jsonplaceholder.models.posts.ResponsePostsModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

public class ResponsePosts implements Question<List<ResponsePostsModel>> {
    @Override
    public List<ResponsePostsModel> answeredBy(Actor actor) {
        return Arrays.asList(SerenityRest.lastResponse().as(ResponsePostsModel[].class));
    }

    public static ResponsePosts all() {
        return new ResponsePosts();
    }
}
