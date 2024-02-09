package com.typicode.jsonplaceholder.tasks.posts;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetPostsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //definir el tipo de servicio con la url
                Get.resource("/posts")
                        //como debe ser el cuerpo del request
                        .with(requestSpecification -> requestSpecification
                                //que sea en formato json
                                .contentType(ContentType.JSON)
                                //cabecera por default o para token
                                .header("Accept", "*/*")
                                //mostrar en consola
                                .log().all()
                        )
        );
    }

    public static GetPostsTask getPosts (){
        return instrumented(GetPostsTask.class);
    }
}
