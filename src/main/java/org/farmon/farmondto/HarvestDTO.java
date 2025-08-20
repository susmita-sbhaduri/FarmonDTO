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
public class HarvestDTO implements Serializable {
    private String harvestid;
    private String siteid;
    private String siteName;
    private String cropid;
    private String cropName;
    private String cropCategory;
    private String sowingDate;
    private String harvestDate;
    private String desc;

    public String getHarvestid() {
        return harvestid;
    }

    public void setHarvestid(String harvestid) {
        this.harvestid = harvestid;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSowingDate() {
        return sowingDate;
    }

    public void setSowingDate(String sowingDate) {
        this.sowingDate = sowingDate;
    }

    public String getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(String harvestDate) {
        this.harvestDate = harvestDate;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getCropid() {
        return cropid;
    }

    public void setCropid(String cropid) {
        this.cropid = cropid;
    }

    public String getCropCategory() {
        return cropCategory;
    }

    public void setCropCategory(String cropCategory) {
        this.cropCategory = cropCategory;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
    
}
