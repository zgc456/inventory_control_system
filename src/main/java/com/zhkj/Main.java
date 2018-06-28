package com.zhkj;

import com.alibaba.fastjson.JSONObject;
import com.zhkj.inventory_control_api.dto.week.WeekDTO;

import static javax.swing.UIManager.get;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/19 21:31
 */
public class Main {
    public static void main(String[] args) {
        String week="{\"date\":\"20180626\",\"message\":\"Success !\",\"status\":200,\"city\":\"洛阳\",\"count\":7,\"data\":{\"shidu\":\"96%\",\"pm25\":38.0,\"pm10\":49.0,\"quality\":\"良\",\"wendu\":\"22\",\"ganmao\":\"极少数敏感人群应减少户外活动\",\"yesterday\":{\"date\":\"25日星期一\",\"sunrise\":\"05:18\",\"high\":\"高温 31.0℃\",\"low\":\"低温 24.0℃\",\"sunset\":\"19:47\",\"aqi\":55.0,\"fx\":\"东风\",\"fl\":\"<3级\",\"type\":\"小雨\",\"notice\":\"雨虽小，注意保暖别感冒\"},\"forecast\":[{\"date\":\"26日星期二\",\"sunrise\":\"05:18\",\"high\":\"高温 28.0℃\",\"low\":\"低温 24.0℃\",\"sunset\":\"19:47\",\"aqi\":59.0,\"fx\":\"东北风\",\"fl\":\"<3级\",\"type\":\"小雨\",\"notice\":\"雨虽小，注意保暖别感冒\"},{\"date\":\"27日星期三\",\"sunrise\":\"05:19\",\"high\":\"高温 32.0℃\",\"low\":\"低温 25.0℃\",\"sunset\":\"19:47\",\"aqi\":51.0,\"fx\":\"西北风\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"},{\"date\":\"28日星期四\",\"sunrise\":\"05:19\",\"high\":\"高温 33.0℃\",\"low\":\"低温 22.0℃\",\"sunset\":\"19:47\",\"aqi\":54.0,\"fx\":\"东北风\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"},{\"date\":\"29日星期五\",\"sunrise\":\"05:19\",\"high\":\"高温 31.0℃\",\"low\":\"低温 21.0℃\",\"sunset\":\"19:47\",\"aqi\":77.0,\"fx\":\"东风\",\"fl\":\"<3级\",\"type\":\"多云\",\"notice\":\"阴晴之间，谨防紫外线侵扰\"},{\"date\":\"30日星期六\",\"sunrise\":\"05:20\",\"high\":\"高温 31.0℃\",\"low\":\"低温 21.0℃\",\"sunset\":\"19:47\",\"aqi\":85.0,\"fx\":\"北风\",\"fl\":\"<3级\",\"type\":\"晴\",\"notice\":\"愿你拥有比阳光明媚的心情\"}]}}";
      WeekDTO list=  JSONObject.parseObject(week,WeekDTO.class);
        System.out.println(list.getData());

    }
}
