package org.leeframe.model;

public class Fare {
    private Integer id;

    private String routename;

    private String isfixedfare;

    private Double fullfare;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    public String getIsfixedfare() {
        return isfixedfare;
    }

    public void setIsfixedfare(String isfixedfare) {
        this.isfixedfare = isfixedfare == null ? null : isfixedfare.trim();
    }

    public Double getFullfare() {
        return fullfare;
    }

    public void setFullfare(Double fullfare) {
        this.fullfare = fullfare;
    }
}