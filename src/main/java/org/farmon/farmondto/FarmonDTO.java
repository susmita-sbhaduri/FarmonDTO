/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.farmon.farmondto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author sb
 */
public class FarmonDTO implements Serializable {
    private UserDTO userDto;
    private List<HarvestDTO> harvestlist;
    private ResourceCropDTO resourceCropDTO;
    private HarvestDTO harvestrecord;
    private List<ResourceCropDTO> rescroplist;
    private List<LabourCropDTO> labcroplist;
    private List<FarmresourceDTO> farmresourcelist;
    private FarmresourceDTO farmresourcerec;
    private List<ShopDTO> shoplist;
    private List<ShopResDTO> shopreslist;
    private ShopResDTO shopresrec;
    private ResAcquireDTO resacqrec;
    private ExpenseDTO expenserec;
    private FarmonResponse responses;
    
    public UserDTO getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDTO userDto) {
        this.userDto = userDto;
    }

    public List<HarvestDTO> getHarvestlist() {
        return harvestlist;
    }

    public void setHarvestlist(List<HarvestDTO> harvestlist) {
        this.harvestlist = harvestlist;
    }

    public ResourceCropDTO getResourceCropDTO() {
        return resourceCropDTO;
    }

    public void setResourceCropDTO(ResourceCropDTO resourceCropDTO) {
        this.resourceCropDTO = resourceCropDTO;
    }

    public HarvestDTO getHarvestrecord() {
        return harvestrecord;
    }

    public void setHarvestrecord(HarvestDTO harvestrecord) {
        this.harvestrecord = harvestrecord;
    }

    public List<ResourceCropDTO> getRescroplist() {
        return rescroplist;
    }

    public void setRescroplist(List<ResourceCropDTO> rescroplist) {
        this.rescroplist = rescroplist;
    }

    public List<LabourCropDTO> getLabcroplist() {
        return labcroplist;
    }

    public void setLabcroplist(List<LabourCropDTO> labcroplist) {
        this.labcroplist = labcroplist;
    }

    public List<FarmresourceDTO> getFarmresourcelist() {
        return farmresourcelist;
    }

    public void setFarmresourcelist(List<FarmresourceDTO> farmresourcelist) {
        this.farmresourcelist = farmresourcelist;
    }

    public FarmresourceDTO getFarmresourcerec() {
        return farmresourcerec;
    }

    public void setFarmresourcerec(FarmresourceDTO farmresourcerec) {
        this.farmresourcerec = farmresourcerec;
    }

    public List<ShopDTO> getShoplist() {
        return shoplist;
    }

    public void setShoplist(List<ShopDTO> shoplist) {
        this.shoplist = shoplist;
    }

    public List<ShopResDTO> getShopreslist() {
        return shopreslist;
    }

    public void setShopreslist(List<ShopResDTO> shopreslist) {
        this.shopreslist = shopreslist;
    }

    public ShopResDTO getShopresrec() {
        return shopresrec;
    }

    public void setShopresrec(ShopResDTO shopresrec) {
        this.shopresrec = shopresrec;
    }

    public FarmonResponse getResponses() {
        return responses;
    }

    public void setResponses(FarmonResponse responses) {
        this.responses = responses;
    }

    public ResAcquireDTO getResacqrec() {
        return resacqrec;
    }

    public void setResacqrec(ResAcquireDTO resacqrec) {
        this.resacqrec = resacqrec;
    }

    public ExpenseDTO getExpenserec() {
        return expenserec;
    }

    public void setExpenserec(ExpenseDTO expenserec) {
        this.expenserec = expenserec;
    }
    
    
}
