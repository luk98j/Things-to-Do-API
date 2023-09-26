package com.whatsupdev.gradeFood.repository;

import com.whatsupdev.gradeFood.document.PostDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodPostRepository extends ReactiveMongoRepository<PostDocument, String> {
}
