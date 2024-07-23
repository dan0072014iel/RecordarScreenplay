package com.typicode.jsonplaceholder.questions.comments;

import com.typicode.jsonplaceholder.models.comments.ResponseCommentsModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

public class ResponseComments implements Question<List<ResponseCommentsModel>> {
    @Override
    public List<ResponseCommentsModel> answeredBy(Actor actor) {
        return Arrays.asList(SerenityRest.lastResponse().as(ResponseCommentsModel[].class));
    }

    public static ResponseComments all() {
        return new ResponseComments();
    }
}
