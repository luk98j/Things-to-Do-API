package com.whatsupdev.GradeFood.dataaccess;

import com.whatsupdev.GradeFood.model.dto.PlaceResultDTO;
import reactor.core.publisher.Flux;

public interface PlaceDataAccess {

    Flux<PlaceResultDTO> getDataForLocationGoogleApi(int coordinationX, int coordinationY);

    Flux<PlaceResultDTO> getDataForLocationDatabase(int coordinationX, int coordinationY);
}
