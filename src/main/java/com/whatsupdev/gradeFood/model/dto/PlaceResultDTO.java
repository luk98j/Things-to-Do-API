package com.whatsupdev.gradeFood.model.dto;

import com.google.maps.model.Geometry;
import com.google.maps.model.OpeningHours;
import com.google.maps.model.Photo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceResultDTO {
    /** The human-readable address of this place. */
    public String formattedAddress;

    /**
     * Geometry information about the result, generally including the location (geocode) of the place
     * and (optionally) the viewport identifying its general area of coverage.
     */
    public Geometry geometry;

    /**
     * The human-readable name for the returned result. For establishment results, this is usually the
     * business name.
     */
    public String name;


    /** A textual identifier that uniquely identifies a place. */
    public String placeId;

    /** The place's rating, from 1.0 to 5.0, based on aggregated user reviews. */
    public float rating;

    /** Feature types describing the given result. */
    public String types[];

    /** Information on when the place is open. */
    public OpeningHours openingHours;

    /** Photo objects associated with this place, each containing a reference to an image. */
    public Photo photos[];

    /** A feature name of a nearby location. */
    public String vicinity;

    /** Indicates that the place has permanently shut down. */
    public boolean permanentlyClosed;

    /** The number of user reviews for this place */
    public int userRatingsTotal;

    /** The status of the business (i.e. operational, temporarily closed, etc.). */
    public String businessStatus;
}
