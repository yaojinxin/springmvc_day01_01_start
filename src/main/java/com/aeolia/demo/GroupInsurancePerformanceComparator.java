package com.aeolia.demo;

import java.util.Comparator;

/**
 * 团体险业绩比较器类
 * 实现Comparator接口重写compare方法
 */
public class GroupInsurancePerformanceComparator implements Comparator<Employee> {
    /**
     * 比较o1与o2的总业绩
     * 总业绩=团体险业绩+个体险业绩
     *
     * @param o1
     * @param o2
     * @return 如果o1总业绩>o2总业绩:1  ==:0    <:-1
     */
    @Override
    public int compare(Employee o1, Employee o2) {
        double v = o1.getGroupInsurancePerformance() - o2.getGroupInsurancePerformance();
        return v > 0 ? v == 0 ? 0 : 1 : -1;
    }


}
