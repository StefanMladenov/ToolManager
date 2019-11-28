package com.example.a7mengineering.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.*;

public class Hospital
{
    @SerializedName("objectId")
    private String ObjectId;
    public final String getObjectId()
    {
        return ObjectId;
    }
    public final void setObjectId(String value)
    {
        ObjectId = value;
    }


    @SerializedName("name")
    private String Name;
    public final String getName()
    {
        return Name;
    }
    public final void setName(String value)
    {
        Name = value;
    }

    @SerializedName("admin")
    private String Admin;
    public final String getAdmin()
    {
        return Admin;
    }
    public final void setAdmin(String value)
    {
        Admin = value;
    }

    @SerializedName("users")
    private List<String> Users;
    public final List<String> getUsers()
    {
        return Users;
    }
    public final void setUsers(List<String> value)
    {
        Users = value;
    }

    @SerializedName("items")
    private List<Integer> Items;
    public final List<Integer> getItems()
    {
        return Items;
    }
    public final void setItems(List<Integer> value)
    {
        Items = value;
    }

    @SerializedName("items")
    private int NextItemId;
    public final int getNextItemId()
    {
        return NextItemId;
    }
    public final void setNextItemId(int value)
    {
        NextItemId = value;
    }

    @SerializedName("items")
    private int NextRoomId;
    public final int getNextRoomId()
    {
        return NextRoomId;
    }
    public final void setNextRoomId(int value)
    {
        NextRoomId = value;
    }

    @SerializedName("items")
    private List<Integer> Tags;
    public final List<Integer> getTags()
    {
        return Tags;
    }
    public final void setTags(List<Integer> value)
    {
        Tags = value;
    }

    @SerializedName("items")
    private List<Integer> LocationTags;
    public final List<Integer> getLocationTags()
    {
        return LocationTags;
    }
    public final void setLocationTags(List<Integer> value)
    {
        LocationTags = value;
    }

    @SerializedName("items")
    private List<Integer> Rooms;
    public final List<Integer> getRooms()
    {
        return Rooms;
    }
    public final void setRooms(List<Integer> value)
    {
        Rooms = value;
    }

    public Hospital()
    {
        setUsers(new ArrayList<String>());
        setItems(new ArrayList<Integer>());
        setTags(new ArrayList<Integer>());
        setRooms(new ArrayList<Integer>());
        setLocationTags(new ArrayList<Integer>());
        setNextItemId(1);
        setNextRoomId(1);
    }

    public Hospital(ArrayList<String> users, ArrayList<Integer> items, ArrayList<Integer> tags, ArrayList<Integer> rooms, ArrayList<Integer> locationTags, int nextItemId, int nextRoomId)
    {
        setUsers(new ArrayList<String>(users));
        setItems(new ArrayList<Integer>(items));
        setTags(new ArrayList<Integer>(tags));
        setRooms(new ArrayList<Integer>(rooms));
        setLocationTags(new ArrayList<Integer>(locationTags));
        setNextItemId(nextItemId);
        setNextRoomId(nextRoomId);
    }
}
