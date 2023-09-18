package com.whatsupdev.GradeFood.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Document("Post")
@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class PostDocument implements Serializable {
    @Serial
    private static final long serialVersionUID = -3021091985208868008L;
    @Id
    private final String id;

    private final String userid;

    private final String restaurantId;

    private final String description;

    private final String foodGrade;

    private final String restaurantGrade;
}
