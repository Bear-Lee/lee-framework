package org.leeframe.model;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private static final long serialVersionUID = -7881120452941755574L;
    private Integer id;

    private String usermobile;

    private Integer userage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile == null ? null : usermobile.trim();
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }
}