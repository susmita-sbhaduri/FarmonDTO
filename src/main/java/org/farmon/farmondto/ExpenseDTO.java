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
public class ExpenseDTO implements Serializable {
    private String expenseId;    
    private String expenseType;
    private String expenseRefId;
    private String date;
    private String expenditure;
    private String commString;

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseRefId() {
        return expenseRefId;
    }

    public void setExpenseRefId(String expenseRefId) {
        this.expenseRefId = expenseRefId;
    }

    public String getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(String expenditure) {
        this.expenditure = expenditure;
    }

    public String getCommString() {
        return commString;
    }

    public void setCommString(String commString) {
        this.commString = commString;
    }
       
}
