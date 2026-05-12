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
public class CropProdWithStock implements Serializable {
    
    
    private CropProductDTO product; 
    private String existingQuantity;
    public CropProdWithStock(CropProductDTO product, String existingQuantity) {
        this.product = product;
        this.existingQuantity = existingQuantity;
    }

    public CropProductDTO getProduct() {
        return product;
    }

    public void setProduct(CropProductDTO product) {
        this.product = product;
    }

    public String getExistingQuantity() {
        return existingQuantity;
    }

    public void setExistingQuantity(String existingQuantity) {
        this.existingQuantity = existingQuantity;
    }
    
}
