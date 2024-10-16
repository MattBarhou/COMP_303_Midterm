package com.example.comp303_midterm;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SensorID")
    private Integer sensorId;

    @NotBlank(message = "Sensor Name cannot be empty")
    @Size(max = 100, message = "Sensor Name cannot be more than 100 characters")
    @Column(name = "SensorName")
    private String sensorName;

    @NotBlank(message = "Sensor Type cannot be empty")
    @Size(max = 50, message = "Sensor Type cannot be more than 50 characters")
    @Column(name = "SensorType")
    private String sensorType;

    @NotNull(message = "Sensor Pin cannot be empty")
    @Min(value = 0, message = "Sensor Pin must be 0 or greater!")
    @Max(value = 1000, message = "Sensor Pin must be 1000 or less!")
    @Column(name = "SensorPin")
    private Integer sensorPin;

    @Column(name = "SensorLocation")
    private String sensorLocation;

    @NotBlank(message = "Sensor Status must be either ON or OFF")
    @Column(name = "SensorStatus")
    private String sensorStatus;

    // Default constructor
    public Sensor() {
    }

    // Parameterized constructor with sensorLocation
    public Sensor(Integer sensorId, String sensorName, String sensorType, Integer sensorPin, String sensorLocation, String sensorStatus) {
        this.sensorId = sensorId;
        this.sensorName = sensorName;
        this.sensorType = sensorType;
        this.sensorPin = sensorPin;
        this.sensorStatus = sensorStatus;
        this.sensorLocation = sensorLocation;
    }

    // Parameterized constructor without sensorLocation
    public Sensor(Integer sensorId, String sensorName, String sensorType, Integer sensorPin, String sensorStatus) {
        this.sensorId = sensorId;
        this.sensorName = sensorName;
        this.sensorType = sensorType;
        this.sensorPin = sensorPin;
        this.sensorStatus = sensorStatus;
    }

    // Getters and Setters
    public Integer getSensorId() {
        return sensorId;
    }

    public void setSensorId(Integer sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public Integer getSensorPin() {
        return sensorPin;
    }

    public void setSensorPin(Integer sensorPin) {
        this.sensorPin = sensorPin;
    }

    public String getSensorLocation() {
        return sensorLocation;
    }

    public void setSensorLocation(String sensorLocation) {
        this.sensorLocation = sensorLocation;
    }

    public String getSensorStatus() {
        return sensorStatus;
    }

    public void setSensorStatus(String sensorStatus) {
        this.sensorStatus = sensorStatus;
    }
}
