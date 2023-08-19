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
    public Flux<PlaceResultDTO> getFoodPost(int coordinationX, int coordinationY) {
        //todo implement saving in database data and also check if we have such data in database
        // also implement getting data from database. Implement updating for data in database

        return placeDataAccess.getDataForLocationGoogleApi(coordinationX, coordinationY);
    }
}
