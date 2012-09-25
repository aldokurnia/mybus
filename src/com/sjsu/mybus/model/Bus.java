/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.mybus.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aldok
 */
@Entity
@Table(name = "bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bus.findAll", query = "SELECT b FROM Bus b"),
    @NamedQuery(name = "Bus.findByBusId", query = "SELECT b FROM Bus b WHERE b.busId = :busId"),
    @NamedQuery(name = "Bus.findByLocation", query = "SELECT b FROM Bus b WHERE b.location = :location"),
    @NamedQuery(name = "Bus.findByDriverId", query = "SELECT b FROM Bus b WHERE b.driverId = :driverId"),
    @NamedQuery(name = "Bus.findByOperationCode", query = "SELECT b FROM Bus b WHERE b.operationCode = :operationCode"),
    @NamedQuery(name = "Bus.findByMessage", query = "SELECT b FROM Bus b WHERE b.message = :message"),
    @NamedQuery(name = "Bus.findByRouteStatus", query = "SELECT b FROM Bus b WHERE b.routeStatus = :routeStatus"),
    @NamedQuery(name = "Bus.findByPassengerCount", query = "SELECT b FROM Bus b WHERE b.passengerCount = :passengerCount"),
    @NamedQuery(name = "Bus.findByTimestamp", query = "SELECT b FROM Bus b WHERE b.timestamp = :timestamp")})
public class Bus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "busId")
    private Integer busId;
    @Column(name = "location")
    private String location;
    @Column(name = "driverId")
    private Integer driverId;
    @Column(name = "operationCode")
    private String operationCode;
    @Column(name = "message")
    private String message;
    @Column(name = "routeStatus")
    private String routeStatus;
    @Column(name = "passengerCount")
    private Integer passengerCount;
    @Column(name = "timestamp")
    private String timestamp;

    public Bus() {
    }

    public Bus(Integer busId) {
        this.busId = busId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRouteStatus() {
        return routeStatus;
    }

    public void setRouteStatus(String routeStatus) {
        this.routeStatus = routeStatus;
    }

    public Integer getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(Integer passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (busId != null ? busId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bus)) {
            return false;
        }
        Bus other = (Bus) object;
        if ((this.busId == null && other.busId != null) || (this.busId != null && !this.busId.equals(other.busId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sjsu.mybus.model.Bus[ busId=" + busId + " ]";
    }
    
}
