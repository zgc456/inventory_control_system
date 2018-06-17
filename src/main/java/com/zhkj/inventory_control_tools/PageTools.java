package com.zhkj.inventory_control_tools;

import com.zhkj.inventory_control_dao.entity.Page;
public class PageTools {
    /**
     * 帮助页面跳转
     * @param page 页面信息
     * @param skipPage 跳转标识
     *                  -1 首页   -2 末页
     *                   1 上一页  2 下一页
     * @param defined 自定义跳转页面
     * @return 处理后的信息
     */
    public static Page helpPageSkip(Page page, Integer skipPage, Integer defined){
        if(null != skipPage || null != defined){
            if(null != skipPage){
                if(skipPage > 0){
                    if(skipPage == 1){
                        page.setCurrentPage(page.getCurrentPage() - 1);
                    }else if(skipPage == 2){
                        page.setCurrentPage(page.getCurrentPage() + 1);
                    }
                }else if(skipPage < 0){
                    if(skipPage == -1){
                        page.setCurrentPage(1);
                    }else if(skipPage == -2){
                        page.setCurrentPage(page.getPageCount());
                    }
                }
            }
            if(defined != null){
                if(defined > 0){
                    page.setCurrentPage(defined);
                }
            }
            /*
                SQL语句 分页查询 LIMIT 偏移量,显示数量
                偏移量 = (当前页 - 1) * 显示数量
             */
            page.setiDisplayStart((page.getCurrentPage() - 1) * page.getPageDisplayLength());
        }
        return page;
    }
}
