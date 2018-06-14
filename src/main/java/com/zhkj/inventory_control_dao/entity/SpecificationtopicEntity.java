package com.zhkj.inventory_control_dao.entity;

import java.util.Objects;

/**
 * @author
 * @Version 1.0
 * @Data 2018/5/22 17:23
 * 商品规格标题表
 */
public class SpecificationtopicEntity {
    private int id;
    //规格标题
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecificationtopicEntity that = (SpecificationtopicEntity) o;
        return id == that.id &&
                Objects.equals(topicName, that.topicName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, topicName);
    }
}
