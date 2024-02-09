package com.typicode.jsonplaceholder.stepDefinitions;

import com.typicode.jsonplaceholder.questions.ResponseServerCode;
import com.typicode.jsonplaceholder.tasks.posts.GetPostsTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PostsStepDefinitions {

    Actor admin = Actor.named("admin")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("the administrator consumes the GET endpoint for posts")
    public void theAdministratorConsumesTheGETEndpointForPosts() {
        admin.attemptsTo(GetPostsTask.getPosts());
    }

    @Then("the posts should appear successfully")
    public void thePostsShouldAppearSuccessfully() {
        admin.should(
                seeThat(ResponseServerCode.was(), equalTo(200))
        );
    }

}
