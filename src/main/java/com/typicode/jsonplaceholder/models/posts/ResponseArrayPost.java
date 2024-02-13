package com.typicode.jsonplaceholder.models.posts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
public class ResponseArrayPost {

    @JsonProperty("posts")
    public List<ResponsePostsModel> posts;
}
