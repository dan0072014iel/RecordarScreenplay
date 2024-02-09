package com.typicode.jsonplaceholder.models.posts;

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
public class ResponsePostsModel {

    @JsonProperty("userId")
    public Integer userId;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("body")
    public String body;
}
