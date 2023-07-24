package com.whatsupdev.GradeFood.dataaccess;

import com.whatsupdev.GradeFood.api.google.GooglePlaceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class PlaceDataAccessImpl implements PlaceDataAccess{

    private final GooglePlaceApi googlePlaceApi;

    @Override
    public void getDataForLocation(int coordinationX, int coordinationY) {
        Mono<?> monoMap = googlePlaceApi.getGooglePlaceNearRestaurants(coordinationX, coordinationY)
                .map(placeDetailsRequest -> {
                            if(placeDetailsRequest.successful()){

                            } else {

                            }
                        });
    }

}
