package com.zhkj.inventory_control_tools;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/25 17:45
 */
public class DataTools {
    /**
     * 获取日期中的年
     * @param date 日期
     * @return 年份
     */
    public static String getYear(Date date){
        DateFormat f_year = new SimpleDateFormat("yyyy");
        return f_year.format(date);
    }

    /**
     * 获取日期中的月
     * @param date 日期
     * @return 月份
     */
    public static String getMonth(Date date){
        DateFormat f_month=new SimpleDateFormat("MM");
        return f_month.format(date);
    }

    /**
     * 获取日期中天
     * @param date 日期
     * @return 天
     */
    public static String getDay(Date date){
        DateFormat f_day=new SimpleDateFormat("dd");
        return f_day.format(date);
    }

    /**
     * 获取日期中的星期
     * @param date 日期
     * @return 星期
     */
    public static String getWeek(Date date){
        DateFormat f_week=new SimpleDateFormat("EEEEEEE");
        return f_week.format(date);
    }

    /**
     * 获取日期中的时间
     * @param date 日期
     * @return 时间
     */
    public static String getTime(Date date){
        DateFormat f_time=new SimpleDateFormat("HH时mm分 ss秒");
        return f_time.format(date);
    }



}
