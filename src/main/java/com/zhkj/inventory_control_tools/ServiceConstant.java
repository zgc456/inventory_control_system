package com.zhkj.inventory_control_tools;

/**
 * 业务常量
 *
 * @author
 * @Version 1.0
 * @Data 2018/6/4 15:53
 */
public class ServiceConstant {
//返回值是否成功
    //成功
    public static final Boolean SUCCERSS=true;
    //失败
    public static final Boolean DEFEATED=false;
    //统计表导出Excel表名
    public static final String STATISTICS_FILE_NAME="统计报表";
    //统计表Excel表头
    public static String[] statisticsTiele=new String[]
            {"记录时间","统计类型","商品名称-类型","财务金额","财务类型","数量"};
}
