package com.lhy.design.pattern.behavioral.templatemethod.use;
/**
 * 咖啡
 * Created by lhy
 */
public class Coffee extends AbstractClass {

    private boolean addSugar = false;

    public Coffee() {
    }

    public Coffee(boolean addSugar) {
        this.addSugar = addSugar;
    }

    void addIngredient() {
        System.out.println("加入猫屎咖啡");
    }

    @Override
    protected boolean addSugar() {
        return this.addSugar;
    }
}
