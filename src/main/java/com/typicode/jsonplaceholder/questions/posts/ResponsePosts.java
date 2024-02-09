package com.typicode.jsonplaceholder.questions.posts;

import com.typicode.jsonplaceholder.models.posts.ResponseArrayPost;
import com.typicode.jsonplaceholder.models.posts.ResponsePostsModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class ResponsePosts implements Question <ResponseArrayPost> {
    @Override
    public ResponseArrayPost answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseArrayPost.class);
    }

    public static ResponsePosts was(){
        return new ResponsePosts();
    }
}
