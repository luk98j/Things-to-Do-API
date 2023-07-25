package com.whatsupdev.GradeFood.dataaccess;

import com.whatsupdev.GradeFood.api.google.GooglePlaceApi;
import com.whatsupdev.GradeFood.dataaccess.mapper.PlaceResultMapper;
import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@RequiredArgsConstructor
public class PlaceDataAccessImpl implements PlaceDataAccess{

    private final GooglePlaceApi googlePlaceApi;
    private PlaceResultMapper mapper = Mappers.getMapper(PlaceResultMapper.class);

    @Override
    public Flux<PlaceResultDTO> getDataForLocation(int coordinationX, int coordinationY) {
        return googlePlaceApi.getGooglePlaceNearRestaurants(coordinationX, coordinationY)
                        .flatMapMany(
                                nearbySearchRequest ->
                                        nearbySearchRequest.successful() ?
                                                Flux.fromArray(nearbySearchRequest.getResult().results)
                                                        .map(mapper::placesSearchResultToPlaceResultDTO) :
                                                Flux.error(new Exception("Error while getting data from Google Place API"))
                        )
                        .onErrorResume(
                                throwable -> Flux.error(new Exception("Error while getting data from Google Place API"))
                        );
    }

}
