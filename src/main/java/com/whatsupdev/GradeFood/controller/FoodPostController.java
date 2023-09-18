package com.whatsupdev.GradeFood.controller;

import com.whatsupdev.GradeFood.model.AddPostRequest;
import com.whatsupdev.GradeFood.model.AddPostResponse;
import reactor.core.publisher.Mono;

public interface FoodPostController {
    Mono<AddPostResponse> savePost(AddPostRequest request);
}
