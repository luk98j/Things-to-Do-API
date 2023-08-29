package com.whatsupdev.GradeFood.service.impl;

import com.whatsupdev.GradeFood.dataaccess.PlaceDataAccess;
import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import com.whatsupdev.GradeFood.service.FoodPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class FoodPostServiceImpl implements FoodPostService {
    private final PlaceDataAccess placeDataAccess;

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
    public Flux<?> savePost() {
        // TODO
        // 1. Check photo of user - if this is a food picture or some different
        // 2. Check user opinion. If don't have links or different opinion then about restauran and food
        // 3. Save user opinion in database
        // 4. Lock posiblity for user to add another post in near time
        return null;
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
