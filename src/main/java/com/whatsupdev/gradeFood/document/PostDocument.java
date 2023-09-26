package com.whatsupdev.gradeFood.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Document("food-post")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDocument implements Serializable {
    @Serial
    private static final long serialVersionUID = -3021091985208868008L;
    @Id
    private String id;

    private String userid;

    private String restaurantId;

    private String description;

    private String foodGrade;

    private String restaurantGrade;
}
