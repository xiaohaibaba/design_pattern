package com.lhy.design.pattern.behavioral.iterator.use;

/**
 * 抽象迭代器类
 * Create By lhy
 */
public interface Iterator {
    /**
     * 用于判断是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回遍历的下一个元素
     * @return
     */
    Object next();
}
