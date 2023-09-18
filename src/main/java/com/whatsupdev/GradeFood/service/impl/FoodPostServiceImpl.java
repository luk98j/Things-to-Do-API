package com.whatsupdev.GradeFood.service.impl;

import com.whatsupdev.GradeFood.dataaccess.PlaceDataAccess;
import com.whatsupdev.GradeFood.document.PostDocument;
import com.whatsupdev.GradeFood.exception.GeneralError;
import com.whatsupdev.GradeFood.model.AddPostRequest;
import com.whatsupdev.GradeFood.model.AddPostResponse;
import com.whatsupdev.GradeFood.repository.FoodPostRepository;
import com.whatsupdev.GradeFood.service.FoodPostService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class FoodPostServiceImpl implements FoodPostService {
    private final PlaceDataAccess placeDataAccess;
    private final FoodPostRepository foodPostRepository;

    @Override
    public Flux<?> getPosts(int coordinationX, int coordinationY) {
        //todo implement saving in database data and also check if we have such data in database
        // also implement getting data from database. Implement updating for data in database
        // 1. Check database for location
        // 1.1 Load post from database
        // 1.2 If not any post will be from database or small amount then load from google near restaurants opinios


        return null;
    }

    @Override
    public Flux<?> getPostDetail() {
        return null;
    }

    @Override
    public Mono<AddPostResponse> savePost(Mono<AddPostRequest> request) {
        // TODO
        // 1. Check photo of user - if this is a food picture or some different
        // 2. Check user opinion. If don't have links or different opinion then about restauran and food
        // 3. Save user opinion in database
        // 4. Lock posiblity for user to add another post in near time
        Mono<PostDocument> postDocumentMono = request
                .map(r -> new PostDocument(null ,r.getUserid(), r.getRestaurantId(), r.getDescription(), r.getFoodGrade(), r.getRestaurantGrade()))
                .flatMap(foodPostRepository::save)
                .onErrorReturn(e -> e instanceof GeneralError, new PostDocument());
        return postDocumentMono
                .map(postDocument -> new AddPostResponse(true))
                .onErrorReturn(new AddPostResponse(false));
    }

    @Override
    public Flux<?> editPost() {
        return null;
    }

    @Override
    public Flux<?> deletePost() {
        return null;
    }

    @Override
    public Flux<?> reportPost() {
        return null;
    }
}
