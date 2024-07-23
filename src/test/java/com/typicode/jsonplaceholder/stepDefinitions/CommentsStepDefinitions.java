package com.typicode.jsonplaceholder.stepDefinitions;

import com.typicode.jsonplaceholder.questions.comments.ResponseComments;
import com.typicode.jsonplaceholder.tasks.comments.GetCommentsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class CommentsStepDefinitions {

    Actor admin = Actor.named("admin")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("the administrator consumes the GET endpoint for comments")
    public void theAdministratorConsumesTheGETEndpointForComments() {
        admin.attemptsTo(GetCommentsTask.getComments());
    }

    @Then("the comments should appear successfully")
    public void theCommentsShouldAppearSuccessfully() {

        admin.should(
                seeThat(
                        "The first email ",
                        res -> new ResponseComments().answeredBy(admin).get(0).getEmail(),
                        equalTo("Eliseo@gardner.biz")
                )
        );
        admin.should(
                seeThatResponse(
                        "The first email is "+ SerenityRest.lastResponse().jsonPath().getString("email[0]"),
                        res -> res
                                .statusCode(200)
                                .body("email", hasItem("Eliseo@gardner.biz"))
                )
        );
    }

}
