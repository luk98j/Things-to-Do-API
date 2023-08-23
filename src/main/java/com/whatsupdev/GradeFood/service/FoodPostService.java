package com.whatsupdev.GradeFood.service;

import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import reactor.core.publisher.Flux;

public interface FoodPostService {
    Flux<?> getPosts(int coordinationX, int coordinationY);

    Flux<?> getPostDetail();

    Flux<?> savePost();

    Flux<?> editPost();

    Flux<?> deletePost();

    Flux<?> reportPost();
}
