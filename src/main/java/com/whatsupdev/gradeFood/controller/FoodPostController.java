package com.whatsupdev.gradeFood.controller;

import com.whatsupdev.gradeFood.model.AddPostRequest;
import com.whatsupdev.gradeFood.model.AddPostResponse;
import reactor.core.publisher.Mono;

public interface FoodPostController {
    Mono<AddPostResponse> savePost(AddPostRequest request);
}
