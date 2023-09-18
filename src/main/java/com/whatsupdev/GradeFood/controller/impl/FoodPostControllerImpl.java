package com.whatsupdev.GradeFood.controller.impl;

import com.whatsupdev.GradeFood.controller.FoodPostController;
import com.whatsupdev.GradeFood.model.AddPostRequest;
import com.whatsupdev.GradeFood.model.AddPostResponse;
import com.whatsupdev.GradeFood.service.FoodPostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class FoodPostControllerImpl implements FoodPostController {

    private final FoodPostService foodPostService;

    @Override
    @PostMapping("/save")
    public Mono<AddPostResponse> savePost(@RequestBody AddPostRequest request) {
        return foodPostService.savePost(Mono.just(request));
    }
}
