package com.lhy.design.pattern.behavioral.iterator.use;

public class MainTest {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add(new Course("西游记"));
        concreteAggregate.add(new Course("三国演义"));
        concreteAggregate.add(new Course("红楼梦"));
        concreteAggregate.add(new Course("水浒传"));

        ConcreteIterator iterator = concreteAggregate.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        concreteAggregate.remove(new Course("三国演义"));

        ConcreteIterator iterator2 = concreteAggregate.getIterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next().getName());
        }
    }
}
