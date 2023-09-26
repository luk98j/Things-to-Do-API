package com.whatsupdev.gradeFood.controller.impl;

import com.whatsupdev.gradeFood.controller.FoodPostController;
import com.whatsupdev.gradeFood.model.AddPostRequest;
import com.whatsupdev.gradeFood.model.AddPostResponse;
import com.whatsupdev.gradeFood.service.FoodPostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/food-post")
@AllArgsConstructor
public class FoodPostControllerImpl implements FoodPostController {

    private final FoodPostService foodPostService;

    @Override
    @PostMapping("/save")
    public Mono<AddPostResponse> savePost(@RequestBody AddPostRequest request) {
        return foodPostService.savePost(Mono.just(request));
    }
}
