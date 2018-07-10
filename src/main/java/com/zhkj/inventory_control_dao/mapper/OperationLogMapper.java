package com.zhkj.inventory_control_dao.mapper;

import com.zhkj.inventory_control_dao.entity.OperationlogEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationLogMapper {
    /**
     * 根据条件查询并分页
     * @param condition 查询条件
     * @param startNumber 起始页数
     * @param lengthNumber 每页显示条数
     * @return
     */
    List<OperationlogEntity> listOperationLogLimit(@Param("condition") String condition, @Param("startNumber") Integer startNumber
            , @Param("lengthNumber") Integer lengthNumber);

    /**
     * 根据 id 查询操作日志
     * @param operationId id
     * @return
     */
    List<OperationlogEntity> selectOperationLogByOperationId(@Param("operationId")Integer operationId);
    /**
     * 根据条件查询条数
     * @param condition 查询条数
     * @return
     */
    Integer countOperationLog(@Param("condition") String condition);

    /**
     * 添加操作日志
     * @param operationlogEntity 操作日志信息
     * @return
     */
    Integer insertOperationLog(@Param("operation")OperationlogEntity operationlogEntity);

    /**
     * 删除操作日志
     * @param operationLogId 操作日志 id
     * @return
     */
    Integer deleteOperationLog(@Param("operationLogId")Integer operationLogId);
}
