package com.typicode.jsonplaceholder.questions.comments;

import com.typicode.jsonplaceholder.models.comments.ResponseArrayComments;
import com.typicode.jsonplaceholder.models.comments.ResponseCommentsModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;

public class ResponseComments implements Question<ResponseArrayComments> {
    @Override
    public ResponseArrayComments answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(ResponseArrayComments.class);
    }

    public static ResponseComments was(){
        return new ResponseComments();
    }
}
