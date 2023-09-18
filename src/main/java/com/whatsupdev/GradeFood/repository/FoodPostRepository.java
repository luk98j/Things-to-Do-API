package com.whatsupdev.GradeFood.repository;

import com.whatsupdev.GradeFood.document.PostDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface FoodPostRepository extends ReactiveMongoRepository<PostDocument, String> {
}
