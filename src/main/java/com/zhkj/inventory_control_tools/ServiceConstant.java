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
//客户点击审核状态
    //同意
    public static final int IS_PASS=1;
    //拒绝
    public static final int NOT_PASS=-1;
//消息表返回审核状态 返回值状态
    public static final String MESSAGE_AUDIT_ISOK="审核成功";
    public static final String MESSAGE_AUDIT_NOTOK="拒绝审核";
    public static final String MESSAGE_AUDIT_ILLEGITMACY="非法参数";
//审核状态 用于审核修改数据库
    //同意
    public static final int MESSAGE_AUDIT_INTEGER_STOCK=1;
    //拒绝
    public static final int MESSAGE_AUDIT_INTEGER_SALERETURN=2;
    //未处理
    public static final int MESSAGE_AUDIT_INTEGER_DISPATCH=3;



}
