package com.example.a7mengineering.data.model;

import java.util.ArrayList;
import java.util.List;

public class ItemType {

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
    public final int getId() { return Id; }
    public final void setId(int value)
    {
        Id = value;
    }

    private String ItemDescription;
    public final String getItemDescription()
    {
        return ItemDescription;
    }
    public final void setItemDescription(String value)
    {
        ItemDescription = value;
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

    private List<TagPreferences> DefaultPreferences;
    public final List<TagPreferences> getDefaultPreferences()
    {
        return DefaultPreferences;
    }
    public final void setDefaultPreferences(List<TagPreferences> value) { DefaultPreferences = value; }

    public ItemType()
    {
        setDefaultPreferences(new ArrayList<TagPreferences>());
    }
}

