package com.example.a7mengineering.data.model;
import java.time.*;

public class SignalEvent {

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

    private boolean Direction;
    public final boolean getDirection()
    {
        return Direction;
    }
    public final void setDirection(boolean value)
    {
        Direction = value;
    }

    private float Value;
    public final float getValue()
    {
        return Value;
    }
    public final void setValue(float value)
    {
        Value = value;
    }

    private SensorType SensorType;
    public final SensorType getSensorType()
    {
        return SensorType;
    }
    public final void setSensorType(SensorType value)
    {
        SensorType = value;
    }

    private TriggerType TriggerType;
    public final TriggerType getTriggerType()
    {
        return TriggerType;
    }
    public final void setTriggerType(TriggerType value)
    {
        TriggerType = value;
    }

}
