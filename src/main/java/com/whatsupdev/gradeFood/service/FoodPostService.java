package com.whatsupdev.gradeFood.service;

import com.whatsupdev.gradeFood.model.AddPostRequest;
import com.whatsupdev.gradeFood.model.AddPostResponse;;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FoodPostService {
    Flux<?> getPosts(int coordinationX, int coordinationY);

    Flux<?> getPostDetail();

    Mono<AddPostResponse> savePost(Mono<AddPostRequest> request);

    Flux<?> editPost();

    Flux<?> deletePost();

    Flux<?> reportPost();
}
