package com.example.a7mengineering.data.model;

enum SensorType {
    UV,
    LIGHT,
    TEMPERATURE,
    HUMIDITY,
    ACCELERATION,
    ANGLE,
    ENERGY,
    ANGULARVELOCITY,
    MAGNETICFIELD;
}

/*public final class SensorTypeExtensions
{
    public final static ArrayList<SensorType> AvailableSensors = new ArrayList<SensorType>();(SensorType.values());
    AvailableSensors = SensorType.values();
}*/

enum TriggerType {
    CONTINUOSTIMEINTERVAL,
    CONTINUOSVALUEINTERVAL,
    FALLINGEDGE,
    RISINGEDGE;
}

/*
public final class TriggerTypeExtensions
{
    public final static ArrayList<TriggerType> AvailableTriggers = TriggerType.values().;
}
*/

