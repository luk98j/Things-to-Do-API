package com.whatsupdev.gradeFood.dataaccess;

import com.whatsupdev.gradeFood.model.dto.PlaceResultDTO;
import reactor.core.publisher.Flux;

public interface PlaceDataAccess {

    Flux<PlaceResultDTO> getDataForLocationGoogleApi(int coordinationX, int coordinationY);

    Flux<PlaceResultDTO> getDataForLocationDatabase(int coordinationX, int coordinationY);
}
