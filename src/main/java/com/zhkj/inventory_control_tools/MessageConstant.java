package com.zhkj.inventory_control_tools;

public class MessageConstant {
    /**
     *  错误信息
     */
    public static final String PASSWORD_ACCOUNT_ERROR = "用户名或密码错误";

    public static final String PASSWORD_DISCREPANCY = "输入密码与原密码不相符";
    public static final String COMMODITY_NAME_REITERATION = "有重复的商品名称,请重新输入";
    /**
     * 信息提示
     */
    public static final String PASSWORD_UPDATE_SUCCEED = "修改密码成功,您需要重新登录";
        /*
            商品信息
         */
        public static final String INSERT_COMMODITY_SUCCEED = "商品添加成功";
        public static final String DELETE_COMMODITY_SUCCEED = "商品删除成功";
        /*
            供应商信息
         */
        public static final String INSERT_SUPPLIER_SUCCEED = "供应商添加成功";
        public static final String UPDATE_SUPPLIER_SUCCEED = "供应商修改成功";
        public static final String DELETE_SUPPLIER_SUCCEED = "供应商删除成功";
    /**
     *  操作日志
     */
        /*
            提示消息
         */
        public static final String DELETE_OPERATION_LOG_SUCCEED = "操作日志删除成功";
        /*
            操作模块
         */
        public static final String OPERATION_MODEL_SHOP = "商品";
        public static final String OPERATION_MODEL_MESSAGE = "消息";
        public static final String OPERATION_MODEL_SUPPLIER = "供应商";
        /*
            操作模块动作
         */
        public static final String OPERATION_MODEL_ACTION_MESSAGE_LODING = "进货";
        public static final String OPERATION_MODEL_ACTION_MESSAGE_UNLOAD = "出货";
        public static final String OPERATION_MODEL_ACTION_SHOP_INSERT = "商品添加";
        public static final String OPERATION_MODEL_ACTION_SHOP_UPDATE = "商品修改";
        public static final String OPERATION_MODEL_ACTION_SHOP_DELETE = "商品删除";
        public static final String OPERATION_MODEL_ACTION_SUPPLIER_INSERT = "供应商添加";
        public static final String OPERATION_MODEL_ACTION_SUPPLIER_UPDATE = "供应商修改";
        public static final String OPERATION_MODEL_ACTION_SUPPLIER_DELETE = "供应商删除";

    /**
     * 统计类型
     */
        /*
            财务类型
                1.收入
                2.支出
         */
        public static final Integer FINANCE_INCOME = Integer.valueOf(1);
        public static final Integer FINANCE_EXPEND = Integer.valueOf(2);
        /*
            统计类型
               1.进货
               2.退货
               3.出货
        */
        public static final Integer STATISTICS_SHIPMENT = Integer.valueOf(1);
        public static final Integer STATISTICS_SALES_RETURN = Integer.valueOf(2);
        public static final Integer STATISTICS_SALE = Integer.valueOf(3);

    public static final String DELETE_STATUSTICS_ERROR="删除统计表失败";
    public static final String DINSERT_STATUSTICS_ERROR="添加一条记录到统计表失败";
    /**
     * 分页参数
     */
    public static final Integer PAGE_LENGTH = Integer.valueOf(10);
}
