package com.lhy.design.pattern.behavioral.iterator.use;

/**
 * 抽象聚合类
 * 用于存储和管理元素对象，声明一个getIterator方法用于创建一个迭代器对象，充当抽象迭代器工厂角色
 */
public interface Aggregate {
    /**
     * 新增
     */
    void add(Course course);

    /**
     * 移除
     */
    void remove(Course course);

    /**
     * 获取一个迭代器对象
     * @return
     */
    ConcreteIterator getIterator();
}
