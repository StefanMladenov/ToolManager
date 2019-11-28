package com.example.a7mengineering.data.model;

import java.time.LocalDateTime;

public class LocationEvent {

    private String ObjectId;
    public final String getObjectId()
    {
        return ObjectId;
    }
    public final void setObjectId(String value)
    {
        ObjectId = value;
    }

    private LocalDateTime TimeStamp;
    public final LocalDateTime getTimeStamp()
    {
        return TimeStamp;
    }
    public final void setTimeStamp(LocalDateTime value)
    {
        TimeStamp = value;
    }

    private int OldLocationTag;
    public final int getOldLocationTag()
    {
        return OldLocationTag;
    }
    public final void setOldLocationTag(int value)
    {
        OldLocationTag = value;
    }
    private int CurrentLocationTag;
    public final int getCurrentLocationTag()
    {
        return CurrentLocationTag;
    }
    public final void setCurrentLocationTag(int value)
    {
        CurrentLocationTag = value;
    }
}

