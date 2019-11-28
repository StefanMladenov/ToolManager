package com.example.a7mengineering.data.model;

import java.time.LocalDateTime;

public class TagPreferences {

    private int Id;
    public final int getId()
    {
        return Id;
    }
    public final void setId(int value)
    {
        Id = value;
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

    private float Value;
    public final float getValue()
    {
        return Value;
    }
    public final void setValue(float value)
    {
        Value = value;
    }

    private float UpperHisteresis;
    public final float getUpperHisteresis()
    {
        return UpperHisteresis;
    }
    public final void setUpperHisteresis(float value)
    {
        UpperHisteresis = value;
    }

    private float LowerHisteresis;
    public final float getLowerHisteresis()
    {
        return LowerHisteresis;
    }
    public final void setLowerHisteresis(float value)
    {
        LowerHisteresis = value;
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

    private LocalDateTime Time;
    public final LocalDateTime getTime()
    {
        return Time;
    }
    public final void setTime(LocalDateTime value)
    {
        Time = value;
    }

    public TagPreferences()
    {
        setValue(0);
        setUpperHisteresis(0);
        setLowerHisteresis(0);
    }

    public final void Update(float threshold, float upper, float lower)
    {
        setValue(threshold);
        setUpperHisteresis(upper);
        setLowerHisteresis(lower);
    }

}
