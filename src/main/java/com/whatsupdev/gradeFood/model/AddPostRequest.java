package com.whatsupdev.gradeFood.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddPostRequest {
    private String userid;
    private String restaurantId;
    private String description;
    private String foodGrade;
    private String restaurantGrade;

}
