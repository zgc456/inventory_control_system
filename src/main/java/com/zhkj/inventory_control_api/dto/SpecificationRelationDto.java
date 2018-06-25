package com.zhkj.inventory_control_api.dto;

public class SpecificationRelationDto {
    private String topicName;
    private String[] detailed;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String[] getDetailed() {
        return detailed;
    }

    public void setDetailed(String[] detailed) {
        this.detailed = detailed;
    }
}
