package com.zhkj;



import java.lang.reflect.Field;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/19 21:31
 */
public class Main {
    public static void main(String[] args) {
            Integer a=1;
            Integer b=2;
            copy(a,b);
        System.out.println(a+""+b);
    }
    public static void copy(Integer number1,Integer number2){
        try {
            //拿到Integer的value属性
            Field field= Integer.class.getDeclaredField("value");
            //让他放弃扫描权限
            field.setAccessible(true);
            int number3=number1.intValue();
            //赋值
            field.set(number1,number2);
            //赋值
            field.set(number2,new Integer(number3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
