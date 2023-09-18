package com.whatsupdev.GradeFood.model;

import lombok.Data;

@Data
public class AddPostRequest {
    private String userid;
    private String restaurantId;
    private String description;
    private String foodGrade;
    private String restaurantGrade;

}
