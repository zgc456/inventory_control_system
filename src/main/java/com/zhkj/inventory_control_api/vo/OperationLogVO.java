package com.zhkj.inventory_control_api.vo;

public class OperationLogVO {
    private String operationModel;
    private String operationModelAction;
    private String operationUserName;
    private String operationCreateTime;

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

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName;
    }

    public String getOperationCreateTime() {
        return operationCreateTime;
    }

    public void setOperationCreateTime(String operationCreateTime) {
        this.operationCreateTime = operationCreateTime;
    }
}
