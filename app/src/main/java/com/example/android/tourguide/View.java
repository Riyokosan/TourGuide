package com.example.android.tourguide;

/**
 * Created by Ryoko on 08/07/2017.
 */

public class View {

    /** Name of the place */
    private String mLocationName;

    /** Address of the place */
    private String mLocationAddress;

    /** Opening time of the place */
    private String mLocationOpeningTime;

    /** Description of the place */
    private String mLocationWebsite;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED ;

    /** Constant value that represents no image was provided for this place */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new View object.
     *
     * @param locationName is the name of the location
     * @param locationWebsite is the description of the specified location
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public View(String locationName, String locationAddress, String locationOpeningTime, String locationWebsite, int imageResourceId) {
        mLocationName = locationName;
        mLocationAddress = locationAddress;
        mLocationOpeningTime = locationOpeningTime;
        mLocationWebsite = locationWebsite;
        mImageResourceId = imageResourceId;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getLocationAddress() {
        return mLocationAddress;
    }

    public String getLocationOpeningTime() {
        return mLocationOpeningTime;
    }

    public String getLocationWebsite() {
        return mLocationWebsite;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}