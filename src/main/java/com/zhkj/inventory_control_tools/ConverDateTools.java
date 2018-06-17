package com.zhkj.inventory_control_tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverDateTools {
    /* 年-月-日 时:分:秒 */
    public static final String YEAR_MONTH_DATE_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss";
    /* 年-月-日 */
    public static final String YEAR_MONTH_DATE = "yyyy-MM-dd";

    /**
     * 根据指定格式转换时间
     * @param date 要转换的时间
     * @param format 转换时间的格式
     * @return 转换后的格式化时间
     */
    public static String convertDateByCondition(Date date,String format){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}
