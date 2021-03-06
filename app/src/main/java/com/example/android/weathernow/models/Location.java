package com.example.android.weathernow.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Location {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("location_type")
    @Expose
    @ColumnInfo(name = "location_type")
    private String locationType;
    @SerializedName("woeid")
    @Expose
    @PrimaryKey
    private int woeid;
    @SerializedName("latt_long")
    @Expose
    @ColumnInfo(name = "latt_long")
    private String lattLong;
    @ColumnInfo(name = "search_time")
    private long searchTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public int getWoeid() {
        return woeid;
    }

    public void setWoeid(int woeid) {
        this.woeid = woeid;
    }

    public String getLattLong() {
        return lattLong;
    }

    public void setLattLong(String lattLong) {
        this.lattLong = lattLong;
    }

    public long getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(long searchTime) {
        this.searchTime = searchTime;
    }
}