package org.leeframe.model;

import java.util.Date;

public class Departuretime {
    private Integer id;

    private String routename;

    private Date firstdeparturetime;

    private Date lastdeparturetime;

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

    public Date getFirstdeparturetime() {
        return firstdeparturetime;
    }

    public void setFirstdeparturetime(Date firstdeparturetime) {
        this.firstdeparturetime = firstdeparturetime;
    }

    public Date getLastdeparturetime() {
        return lastdeparturetime;
    }

    public void setLastdeparturetime(Date lastdeparturetime) {
        this.lastdeparturetime = lastdeparturetime;
    }
}