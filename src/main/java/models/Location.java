package models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="locations")
@Access(AccessType.FIELD)
public class Location {

    @Id
    private long location_id;

    public void setLocation_id(long id) {
        this.location_id = id;
    }

    public long getLocation_id() {
        return location_id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getLocation_date() {
        return location_date;
    }

    public void setLocation_date(String location_date) {
        this.location_date = location_date;
    }

    private double latitude,longitude;
    private String location_date;
}
