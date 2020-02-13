package com.lhy.design.pattern.behavioral.templatemethod.use;
/**
 * 当使用模板方法模式时
 * Created by lhy
 */
public class MainTest {

    public static void main(String[] args) {
        AbstractClass coffee = new Coffee(true);
        coffee.make();

        System.out.println("================================");

        AbstractClass milkTea = new MilkTea();
        milkTea.make();

    }

}
