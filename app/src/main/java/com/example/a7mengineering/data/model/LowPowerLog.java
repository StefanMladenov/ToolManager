package com.example.a7mengineering.data.model;

import java.time.LocalDateTime;

public class LowPowerLog {
    private String ObjectId;
    public final String getObjectId()
    {
        return ObjectId;
    }
    public final void setObjectId(String value)
    {
        ObjectId = value;
    }

    private LocalDateTime LowPowerLogStamp;
    public final LocalDateTime getLowPowerLogStamp()
    {
        return LowPowerLogStamp;
    }
    public final void setLowPowerLogStamp(LocalDateTime value)
    {
        LowPowerLogStamp = value;
    }
}
