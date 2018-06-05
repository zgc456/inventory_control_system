package com.zhkj.inventory_control_api.dto;

import java.io.Serializable;
/**
 * 商品规格标题dto
 * @author
 * @Version 1.0
 * @Data 2018/5/17
 */
public class SpecificationtopicDto{
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
