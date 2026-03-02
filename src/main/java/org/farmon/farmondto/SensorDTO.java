/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.farmon.farmondto;


public class SensorDTO {

    // These exact names must match the JSON keys from your C++ code
    private int boardId;
    private double data;
    
    // 1. Mandatory empty constructor for Jackson ObjectMapper
    public SensorDTO() {
    }

    // 2. Getters and Setters
    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }
}
