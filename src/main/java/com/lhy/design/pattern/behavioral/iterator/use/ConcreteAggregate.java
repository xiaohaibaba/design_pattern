package com.lhy.design.pattern.behavioral.iterator.use;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 * 实现了在抽象聚合类中声明的getIterator方法，返回一个对应的具体迭代器ConcreteIterator实例
 */
public class ConcreteAggregate implements Aggregate {

    private List<Course> courseList;

    public ConcreteAggregate() {
        this.courseList = new ArrayList<Course>();
    }

    public void add(Course course) {
        this.courseList.add(course);
    }

    public void remove(Course course) {
        this.courseList.remove(course);
    }

    public ConcreteIterator getIterator() {
        return new ConcreteIterator(courseList);
    }
}
