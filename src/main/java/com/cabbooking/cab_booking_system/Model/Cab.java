package com.cabbooking.cab_booking_system.Model;


import org.bson.Document;

public class Cab {

    private String cabId;
    private String plateNumber;
    private String carModel;
    private boolean isAvailable;

    public Cab(String cabId, String plateNumber, String carModel, boolean isAvailable) {
        this.cabId = cabId;
        this.plateNumber = plateNumber;
        this.carModel = carModel;
        this.isAvailable = isAvailable;
    }

    public String getCabId() {
        return cabId;
    }

    public void setCabId(String cabId) {
        this.cabId = cabId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Document toDocument() {
        return new Document("cabId", cabId)
                .append("plateNumber", plateNumber)
                .append("carModel", carModel)
                .append("isAvailable", isAvailable);
    }




}
