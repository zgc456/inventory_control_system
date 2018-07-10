package com.zhkj.inventory_control_dao.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class OperationlogEntity {
    private int id;
    private String operationUserName;
    private String operationModel;
    private String operationModelAction;
    private String operationDescribe;
    private Timestamp operationCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName;
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

    public String getOperationDescribe() {
        return operationDescribe;
    }

    public void setOperationDescribe(String operationDescribe) {
        this.operationDescribe = operationDescribe;
    }

    public Timestamp getOperationCreateTime() {
        return operationCreateTime;
    }

    public void setOperationCreateTime(Timestamp operationCreateTime) {
        this.operationCreateTime = operationCreateTime;
    }

}
