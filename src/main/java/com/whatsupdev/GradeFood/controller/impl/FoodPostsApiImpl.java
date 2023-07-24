package com.whatsupdev.GradeFood.controller.impl;

import com.whatsupdev.GradeFood.controller.FoodPostsApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FoodPostsApiImpl implements FoodPostsApi {
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
    public ResponseEntity<List<Object>> foodPostsGetAllPostsCordinationXCordinationYGet(Integer cordinationX, Integer cordinationY) {
        return null;
    }

    @Override
    public ResponseEntity<Object> foodPostsUpdatePostPostIdPut(String postId, Object body) {
        return null;
    }
}
