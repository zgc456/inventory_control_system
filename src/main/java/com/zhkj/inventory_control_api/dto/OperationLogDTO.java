package com.zhkj.inventory_control_api.dto;

public class OperationLogDTO {
    private Integer id;
    private Integer sortId;
    private String operationModel;
    private String operationModelAction;
    private String operationName;
    private String operationDescribe;
    private String operationCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getOperationModel() {
        return operationModel;
    }

    public void setOperationModel(String operationModel) {
        this.operationModel = operationModel;
    }

    public String getOperationModelAction() {
        return operationModelAction;
    }

    public void setOperationModelAction(String operationModelAction) {
        this.operationModelAction = operationModelAction;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationDescribe() {
        return operationDescribe;
    }

    public void setOperationDescribe(String operationDescribe) {
        this.operationDescribe = operationDescribe;
    }

    public String getOperationCreateTime() {
        return operationCreateTime;
    }

    public void setOperationCreateTime(String operationCreateTime) {
        this.operationCreateTime = operationCreateTime;
    }
}
