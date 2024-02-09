package com.typicode.jsonplaceholder.models.comments;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseArrayComments {

    @JsonProperty("comments")
    public List<ResponseCommentsModel> comments;
}
