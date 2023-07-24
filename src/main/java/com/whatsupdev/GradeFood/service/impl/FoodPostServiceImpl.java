package com.whatsupdev.GradeFood.service.impl;

import com.whatsupdev.GradeFood.api.google.GooglePlaceApi;
import com.whatsupdev.GradeFood.dataaccess.PlaceDataAccess;
import com.whatsupdev.GradeFood.service.FoodPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FoodPostServiceImpl implements FoodPostService {
    private final PlaceDataAccess placeDataAccess;

}
