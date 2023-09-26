package com.whatsupdev.gradeFood.dataaccess.mapper;


import com.google.maps.model.PlacesSearchResult;
import com.whatsupdev.gradeFood.model.dto.PlaceResultDTO;
import org.mapstruct.Mapper;

@Mapper
public interface PlaceResultMapper {
    PlaceResultDTO placesSearchResultToPlaceResultDTO(PlacesSearchResult placesSearchResult);
}
