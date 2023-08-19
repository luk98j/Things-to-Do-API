package com.whatsupdev.GradeFood.controller.impl;

import com.whatsupdev.GradeFood.controller.FoodPostsApi;
import com.whatsupdev.GradeFood.service.FoodPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.whatsupdev.GradeFood.utils.ExceptionHandler.handleExceptionForController;

@RestController
@RequiredArgsConstructor
public class FoodPostsApiImpl implements FoodPostsApi {

    private final FoodPostService foodPostService;

    @Override
    public ResponseEntity<Object> foodPostsActionOnPostPostIdDelete(String postId, Object body) {
        return null;
    }

    @Override
    public ResponseEntity<Object> foodPostsAddPostPost(Object body) {
        return null;
    }

    @Override
    public ResponseEntity<Object> foodPostsDeletePostPostIdDelete(String postId) {
        return null;
    }

    @Override
    public ResponseEntity<List<Object>> foodPostsGetAllPostsCordinationXCordinationYGet(@RequestParam Integer cordinationX,
                                                                                        @RequestParam Integer cordinationY) {
        //map response from service to response entity and return it
        foodPostService.getFoodPost(cordinationX, cordinationY)
                .onErrorReturn(error -> handleExceptionForController(error))
                .collectSortedList()
                .map(ResponseEntity::ok);


        return null;
    }

    @Override
    public ResponseEntity<Object> foodPostsUpdatePostPostIdPut(String postId, Object body) {
        return null;
    }
}
