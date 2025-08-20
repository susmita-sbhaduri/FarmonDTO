/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.farmon.farmondto;

import java.io.Serializable;

/**
 *
 * @author sb
 */
public class FarmresourceDTO implements Serializable {
    private String resourceId;
    private String resourceName;
    private String availableAmt;
    private String unit;
    private String cropweight;
    private String cropwtunit;

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getAvailableAmt() {
        return availableAmt;
    }

    public void setAvailableAmt(String availableAmt) {
        this.availableAmt = availableAmt;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCropweight() {
        return cropweight;
    }

    public void setCropweight(String cropweight) {
        this.cropweight = cropweight;
    }

    public String getCropwtunit() {
        return cropwtunit;
    }

    public void setCropwtunit(String cropwtunit) {
        this.cropwtunit = cropwtunit;
    }
    
}
