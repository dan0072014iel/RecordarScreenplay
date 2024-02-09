package com.typicode.jsonplaceholder.models.comments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//se utiliza lombook para no usar getters, setters y constructores
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCommentsModel {

    @JsonProperty("postId")
    public Integer postId;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("email")
    public String email;
    @JsonProperty("body")
    public String body;
}
