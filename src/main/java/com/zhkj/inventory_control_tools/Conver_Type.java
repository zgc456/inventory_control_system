package com.zhkj.inventory_control_tools;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;

import java.util.List;


/**
 * Created by lenovo on 2018/4/1.
 */
public class Conver_Type {
    /**
     * 对象的转换
     *      需要属性的一致
     * @param t 要转换的类
     * @param r 想要转换的类
     * @param <T>
     * @param <R>
     * @return 转换后的类型
     */
    public static <T,R> T convert(T t,R r){
        BeanUtils.copyProperties(r,t);
        return t;
    }

    /**
     * List集合对象的转换
     * @param entity1 要转换的集合
     * @param entity2 想要转换的集合
     * @param myClass 要转换的集合类   例如  MyClass.class
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<T> convertToList(List<T> entity1, List<R> entity2,Class<T> myClass){
        String name = myClass.getName();
        entity1 = Lists.transform(entity2, new Function<R, T>() {
            @Override
            public T apply(R input) {
                T t = null;
                try {
                    t = (T) Class.forName(name).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                BeanUtils.copyProperties(input,t);
                return (T) t;
            }
        });
        return entity1;
    }
}