package com.example.a7mengineering.data.model;
import java.util .*;

public class LocationTag {

    private String ObjectId;

    public final String getObjectId() {
        return ObjectId;
    }

    public final void setObjectId(String value) {
        ObjectId = value;
    }

    private int Id;

    public final int getId() {
        return Id;
    }

    public final void setId(int value) {
        Id = value;
    }

    private String Hospital;

    public final String getHospital() {
        return Hospital;
    }

    public final void setHospital(String value) {
        Hospital = value;
    }

    private List<LowPowerLog> LowPowerLogs;

    public final List<LowPowerLog> getLowPowerLogs() {
        return LowPowerLogs;
    }

    public final void setLowPowerLogs(List<LowPowerLog> value) {
        LowPowerLogs = value;
    }

    private float SeekRange;

    public final float getSeekRange() {
        return SeekRange;
    }

    public final void setSeekRange(float value) {
        SeekRange = value;
    }

    private int RoomId;

    public final int getRoomId() {
        return RoomId;
    }

    public final void setRoomId(int value) {
        RoomId = value;
    }

    public LocationTag() {
        setLowPowerLogs(new ArrayList<LowPowerLog>());
    }
}