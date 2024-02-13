package com.typicode.jsonplaceholder.stepDefinitions;

import com.typicode.jsonplaceholder.models.comments.ResponseCommentsModel;
import com.typicode.jsonplaceholder.questions.comments.ResponseComments;
import com.typicode.jsonplaceholder.tasks.comments.GetCommentsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CommentsStepDefinitions {

    Actor admin = Actor.named("admin")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("the administrator consumes the GET endpoint for comments")
    public void theAdministratorConsumesTheGETEndpointForComments() {
        admin.attemptsTo(GetCommentsTask.getComments());
    }

    @Then("the comments should appear successfully")
    public void theCommentsShouldAppearSuccessfully() {

        /*admin.should(
                seeThat(
                        "The complete response is",
                        res -> new ResponseComments().answeredBy(admin).
                )
        );*/
    }

}
