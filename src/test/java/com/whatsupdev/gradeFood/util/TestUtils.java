package com.whatsupdev.gradeFood.util;

import com.whatsupdev.gradeFood.model.AddPostRequest;

public class TestUtils {
    public static AddPostRequest prepareAddPostRequest(){
        return AddPostRequest.builder()
                .userid("userId")
                .restaurantId("restaurantId")
                .description("description")
                .foodGrade("foodGrade")
                .restaurantGrade("restaurantGrade")
                .build();
    }
}
