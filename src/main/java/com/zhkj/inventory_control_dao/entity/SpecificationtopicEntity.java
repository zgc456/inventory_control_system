package com.zhkj.inventory_control_dao.entity;

import java.io.Serializable;
import java.util.Objects;

public class SpecificationtopicEntity implements Serializable {
    private int id;
    private String topicName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }


}
