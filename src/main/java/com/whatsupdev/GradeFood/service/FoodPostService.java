package com.whatsupdev.GradeFood.service;

import com.whatsupdev.GradeFood.model.AddPostRequest;
import com.whatsupdev.GradeFood.model.AddPostResponse;;
import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
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
