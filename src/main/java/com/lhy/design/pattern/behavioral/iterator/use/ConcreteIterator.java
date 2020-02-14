package com.lhy.design.pattern.behavioral.iterator.use;

import java.util.List;

/**
 * 具体的迭代器
 */
public class ConcreteIterator implements Iterator {

    //需要遍历的对象
    private List<Course> courseList;
    //当前位置
    private int position;
    //具体对象
    private Course course;

    public ConcreteIterator(List<Course> courseList) {
        this.courseList = courseList;
    }

    /**
     * 判断是否还有下一个元素
     * @return
     */
    public boolean hasNext() {
        if(position<courseList.size()){
            return true;
        }
        return false;
    }

    /**
     * 下一个元素
     * @return
     */
    public Course next() {
        System.out.println("返回课程的位置是："+position);
        course = courseList.get(position);
        //位置加1
        position++;
        return course;
    }



}
