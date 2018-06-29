package com.zhkj.test;

/**
 * @author
 * @Version 1.0
 * @Data 2018/6/28 10:16
 */
public  class Main implements test {
         int a;

    public static void main(String[] args) {
        try {
            System.out.println(1);
            System.out.println(1/0);
        }catch (Exception e){
            System.exit(0);
            System.out.println(1);
        }finally {

            System.out.println(3);
        }
    }
}
