package com.example.a7mengineering.data.model;
import java.util.*;

public class Room {

    private String ObjectId;
    public final String getObjectId()
    {
        return ObjectId;
    }
    public final void setObjectId(String value)
    {
        ObjectId = value;
    }

    private int Id;
    public final int getId()
    {
        return Id;
    }
    public final void setId(int value)
    {
        Id = value;
    }

    private String Hospital;
    public final String getHospital()
    {
        return Hospital;
    }
    public final void setHospital(String value)
    {
        Hospital = value;
    }

    private String RoomName;
    public final String getRoomName()
    {
        return RoomName;
    }
    public final void setRoomName(String value)
    {
        RoomName = value;
    }

    private List<Integer> LocationTags;
    public final List<Integer> getLocationTags()
    {
        return LocationTags;
    }
    public final void setLocationTags(List<Integer> value)
    {
        LocationTags = value;
    }

    public Room()
    {
        setLocationTags(new ArrayList<Integer>());
    }

}
