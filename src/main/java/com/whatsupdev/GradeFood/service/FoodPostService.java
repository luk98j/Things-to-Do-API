package com.whatsupdev.GradeFood.service;

import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import reactor.core.publisher.Flux;

public interface FoodPostService {
    Flux<PlaceResultDTO> getFoodPost(int coordinationX, int coordinationY);
}
