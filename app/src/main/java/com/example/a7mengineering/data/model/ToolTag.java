package com.example.a7mengineering.data.model;
import java.time.LocalDateTime;
import java.util.*;

public class ToolTag {

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

    private int ItemTypeId;
    public final int getItemTypeId()
    {
        return ItemTypeId;
    }
    public final void setItemTypeId(int value)
    {
        ItemTypeId = value;
    }

    private LocalDateTime Archived;
    public final LocalDateTime getArchived()
    {
        return Archived;
    }
    public final void setArchived(LocalDateTime value)
    {
        Archived = value;
    }

    private ItemType ItemType;
    public final ItemType getItemType()
    {
        return ItemType;
    }
    public final void setItemType(ItemType value)
    {
        ItemType = value;
    }

    private List<LowPowerLog> LowPowerLogs;
    public final List<LowPowerLog> getLowPowerLogs()
    {
        return LowPowerLogs;
    }
    public final void setLowPowerLogs(List<LowPowerLog> value)
    {
        LowPowerLogs = value;
    }

    private List<TagPreferences> TagPreferences;
    public final List<TagPreferences> getTagPreferences()
    {
        return TagPreferences;
    }
    public final void setTagPreferences(List<TagPreferences> value)
    {
        TagPreferences = value;
    }

    private List<SignalEvent> SignalLogs;
    public final List<SignalEvent> getSignalLogs()
    {
        return SignalLogs;
    }
    public final void setSignalLogs(List<SignalEvent> value)
    {
        SignalLogs = value;
    }

    private List<LocationEvent> LocationLogs;
    public final List<LocationEvent> getLocationLogs()
    {
        return LocationLogs;
    }
    public final void setLocationLogs(List<LocationEvent> value)
    {
        LocationLogs = value;
    }

    public ToolTag()
    {
        setLowPowerLogs(new ArrayList<LowPowerLog>());
        setSignalLogs(new ArrayList<SignalEvent>());
        setTagPreferences(new ArrayList<TagPreferences>());
        setLocationLogs(new ArrayList<LocationEvent>());
    }


}
