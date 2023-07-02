package com.feng.chapter03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author f
 * @date 2023/7/2 12:51
 */
public class Test06 {

    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        Order order1 = new Order(1, "1");
        Order order2 = new Order(2, "2");
        Order order3 = new Order(3, "3");
        list.add(order1);
        list.add(order2);
        list.add(order3);

        List<Integer> collect = list.stream().map(order -> order.getOrderId()).collect(Collectors.toList());
        System.out.println(collect);

        List<Order> collect1 = list.stream().filter(order -> order.getOrderId() > 1).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
