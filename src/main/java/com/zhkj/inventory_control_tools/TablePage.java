package com.zhkj.inventory_control_tools;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/22 14:36
 */
public class TablePage {
    //每页显示条数
    private static Integer pageCount=4;
    //当前页
    private static Integer thisIndex=1;
    //总页数
    private static Integer count;

    public static Integer getPageCount() {
        return pageCount;
    }

    public static void setPageCount(Integer pageCount) {
        TablePage.pageCount = pageCount;
    }

    public static Integer getThisIndex() {

        return thisIndex;
    }

    public static void setThisIndex(Integer thisIndex) {
        if ( TablePage.thisIndex>=count|| TablePage.thisIndex<0){
            thisIndex=1;
        }
        TablePage.thisIndex = thisIndex;
    }

    public static Integer getCount() {
        return count;
    }

    public static void setCount(Integer count) {
        TablePage.count = count;
    }
}
