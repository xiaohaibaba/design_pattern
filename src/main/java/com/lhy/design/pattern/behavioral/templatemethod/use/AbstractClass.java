package com.lhy.design.pattern.behavioral.templatemethod.use;

/**
 * 制作咖啡和奶茶的抽象
 * Created by lhy
 */
public abstract class AbstractClass {

    /**
     * 制作的模板方法
     * 申明为final，子类不能重写模板方法
     */
    protected final void make(){
        //烧水
        boilWater();
        //加原料
        addIngredient();
        //是否加糖
        if(this.addSugar()){
            System.out.println("加糖");
        }
        //把水倒进去
        pourInCup();
        //搅拌
        stir();
    }

    //下面三个方法都是共有的，不需要子类重写
    protected final void boilWater(){
        System.out.println("烧水");
    }

    protected final void pourInCup(){
        System.out.println("把水倒进去");
    }

    protected final void stir(){
        System.out.println("搅拌");
    }

    /**
     * 加入原材料的方法子类必须重写，因为不同的饮料需要不同的原材料
     */
    abstract void addIngredient();

    /**
     * 加入糖的子类可以重写也可以不重写
     * 子类可以控制加糖，默认是不加糖
     */
    protected boolean addSugar(){
        return false;
    }
}
