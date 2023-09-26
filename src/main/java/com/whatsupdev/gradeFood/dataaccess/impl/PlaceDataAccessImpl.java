package com.whatsupdev.gradeFood.dataaccess.impl;

import com.whatsupdev.gradeFood.api.google.GooglePlaceApi;
import com.whatsupdev.gradeFood.dataaccess.PlaceDataAccess;
import com.whatsupdev.gradeFood.dataaccess.mapper.PlaceResultMapper;
import com.whatsupdev.gradeFood.model.dto.PlaceResultDTO;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class PlaceDataAccessImpl implements PlaceDataAccess {

    private final GooglePlaceApi googlePlaceApi;
    private PlaceResultMapper mapper = Mappers.getMapper(PlaceResultMapper.class);

    @Override
    public Flux<PlaceResultDTO> getDataForLocationGoogleApi(int coordinationX, int coordinationY) {
        return googlePlaceApi.getGooglePlaceNearRestaurants(coordinationX, coordinationY)
                .onErrorComplete()
                .flatMapMany(
                        nearbySearchRequest ->
                                        Flux.fromArray(nearbySearchRequest.getResult().results)
                                                .map(mapper::placesSearchResultToPlaceResultDTO));

    }

    @Override
    public Flux<PlaceResultDTO> getDataForLocationDatabase(int coordinationX, int coordinationY) {
        return null;
    }

}
