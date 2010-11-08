package net.sigmalab.jspart.domain;

import javax.persistence.Embeddable;

@Embeddable
public class GeoLocation {
    private Double latitude;
    private Double longitude;
    private Float altitude;
    private Float horizontalAccuracy;
    private Float verticalAccuracy;

    public GeoLocation() {
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public Float getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public void setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    public Float getVerticalAccuracy() {
        return verticalAccuracy;
    }

    public void setVerticalAccuracy(Float verticalAccuracy) {
        this.verticalAccuracy = verticalAccuracy;
    }
}