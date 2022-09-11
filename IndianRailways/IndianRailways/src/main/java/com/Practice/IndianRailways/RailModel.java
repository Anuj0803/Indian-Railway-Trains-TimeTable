package com.Practice.IndianRailways;

import javax.xml.soap.SAAJResult;

public class RailModel {
    String TrainNo;
    String trainName;

    String islno;

    String stationCode ;

    String StationName ;

    String Arrivaltime;
    String Departuretime;
    String Distance;
    String SourceStationCode;

    String sourceStationName;
    String DestinationstationCode;

    String DestinationStationName;

    public String getTrainNo() {
        return TrainNo;
    }

    public void setTrainNo(String trainNo) {
        TrainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSourceStationName() {
        return sourceStationName;
    }

    public void setSourceStationName(String sourceStationName) {
        this.sourceStationName = sourceStationName;
    }

    public String getDestinationStationName() {
        return DestinationStationName;
    }

    public void setDestinationStationName(String destinationStationName) {
        DestinationStationName = destinationStationName;
    }

    public String getIslno() {
        return islno;
    }

    public void setIslno(String islno) {
        this.islno = islno;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public String getArrivaltime() {
        return Arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        Arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return Departuretime;
    }

    public void setDeparturetime(String departuretime) {
        Departuretime = departuretime;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String distance) {
        Distance = distance;
    }

    public String getSourceStationCode() {
        return SourceStationCode;
    }

    public void setSourceStationCode(String sourceStationCode) {
        SourceStationCode = sourceStationCode;
    }

    public String getDestinationstationCode() {
        return DestinationstationCode;
    }

    public void setDestinationstationCode(String destinationstationCode) {
        DestinationstationCode = destinationstationCode;
    }

    @Override
    public String toString() {
        return "RailModel{" +
                "TrainNo='" + TrainNo + '\'' +
                ", trainName='" + trainName + '\'' +
                ", islno='" + islno + '\'' +
                ", stationCode='" + stationCode + '\'' +
                ", StationName='" + StationName + '\'' +
                ", Arrivaltime='" + Arrivaltime + '\'' +
                ", Departuretime='" + Departuretime + '\'' +
                ", Distance='" + Distance + '\'' +
                ", SourceStationCode='" + SourceStationCode + '\'' +
                ", sourceStationName='" + sourceStationName + '\'' +
                ", DestinationstationCode='" + DestinationstationCode + '\'' +
                ", DestinationStationName='" + DestinationStationName + '\'' +
                '}';
    }
}
