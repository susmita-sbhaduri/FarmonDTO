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
    private LabourCropDTO labcroprecord;
    private List<ResourceCropDTO> rescroplist;
    private List<LabourCropDTO> labcroplist;    
    private List<FarmresourceDTO> farmresourcelist;
    private FarmresourceDTO farmresourcerec;
    private List<ShopDTO> shoplist;
    private List<ShopResDTO> shopreslist;
    private ShopResDTO shopresrec;
    private ResAcquireDTO resacqrec;
    private List<ResAcquireDTO> resacqreclist;
    private List<ExpenseDTO> expenselist;
    private ExpenseDTO expenserec;
    private FarmonResponse responses;
    private List<TaskPlanDTO> taskplanlist;
    private TaskPlanDTO taskplanrec;
//    private List<BatchExpenseDTO> expenselistrpt;
    private String reportstartdt;
    private String reportenddt;
    private List<ResAcqReportDTO> resacqreport;
    private ResCropAllSummaryDTO rescropsummary;
    private List<EmpExpDTO> empexplist;
    private EmpExpDTO empexprec;
    private EmployeeDTO emprec;
    private EmpLeaveDTO empleaverec;
    private List<EmployeeDTO> emplist;
    private List<AllExpenseReportDTO> allexplist;
    private List<EmpLeaveDTO> empleavelist;
    
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

    public List<TaskPlanDTO> getTaskplanlist() {
        return taskplanlist;
    }

    public void setTaskplanlist(List<TaskPlanDTO> taskplanlist) {
        this.taskplanlist = taskplanlist;
    }

    public TaskPlanDTO getTaskplanrec() {
        return taskplanrec;
    }

    public void setTaskplanrec(TaskPlanDTO taskplanrec) {
        this.taskplanrec = taskplanrec;
    }

    public String getReportstartdt() {
        return reportstartdt;
    }

    public void setReportstartdt(String reportstartdt) {
        this.reportstartdt = reportstartdt;
    }

    public String getReportenddt() {
        return reportenddt;
    }

    public void setReportenddt(String reportenddt) {
        this.reportenddt = reportenddt;
    }

    public List<ExpenseDTO> getExpenselist() {
        return expenselist;
    }

    public void setExpenselist(List<ExpenseDTO> expenselist) {
        this.expenselist = expenselist;
    }        

    public LabourCropDTO getLabcroprecord() {
        return labcroprecord;
    }

    public void setLabcroprecord(LabourCropDTO labcroprecord) {
        this.labcroprecord = labcroprecord;
    }

    public List<ResAcqReportDTO> getResacqreport() {
        return resacqreport;
    }

    public void setResacqreport(List<ResAcqReportDTO> resacqreport) {
        this.resacqreport = resacqreport;
    }

    public ResCropAllSummaryDTO getRescropsummary() {
        return rescropsummary;
    }

    public void setRescropsummary(ResCropAllSummaryDTO rescropsummary) {
        this.rescropsummary = rescropsummary;
    }

    public List<EmpExpDTO> getEmpexplist() {
        return empexplist;
    }

    public void setEmpexplist(List<EmpExpDTO> empexplist) {
        this.empexplist = empexplist;
    }

    public EmployeeDTO getEmprec() {
        return emprec;
    }

    public void setEmprec(EmployeeDTO emprec) {
        this.emprec = emprec;
    }

    public EmpExpDTO getEmpexprec() {
        return empexprec;
    }

    public void setEmpexprec(EmpExpDTO empexprec) {
        this.empexprec = empexprec;
    }

    public List<AllExpenseReportDTO> getAllexplist() {
        return allexplist;
    }

    public void setAllexplist(List<AllExpenseReportDTO> allexplist) {
        this.allexplist = allexplist;
    }

    public List<EmployeeDTO> getEmplist() {
        return emplist;
    }

    public void setEmplist(List<EmployeeDTO> emplist) {
        this.emplist = emplist;
    }

    public EmpLeaveDTO getEmpleaverec() {
        return empleaverec;
    }

    public void setEmpleaverec(EmpLeaveDTO empleaverec) {
        this.empleaverec = empleaverec;
    }

    public List<ResAcquireDTO> getResacqreclist() {
        return resacqreclist;
    }

    public void setResacqreclist(List<ResAcquireDTO> resacqreclist) {
        this.resacqreclist = resacqreclist;
    }

    public List<EmpLeaveDTO> getEmpleavelist() {
        return empleavelist;
    }

    public void setEmpleavelist(List<EmpLeaveDTO> empleavelist) {
        this.empleavelist = empleavelist;
    }
    
    
}
