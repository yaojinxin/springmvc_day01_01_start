package com.aeolia.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Main类
 * <p>
 * 1.创建职工线性表
 * 2.初始化一些职工加入表中
 * 3.根据总业绩对表进行升序排序
 * 4.根据团体险业绩对表进行升序排序
 * <p>
 * 注意：不使用控制台输入职工信息
 * 输出要求不带属性名，属性的值，每个值之间用逗号分隔(重写toString()方法)
 */
public class Main {
    public static void main(String[] args) {
        //创建一个职工线性表
        List<Employee> employees = new ArrayList<>();
        //初始化一些职工对象并加入职工线性表中
        employees.add(new Employee(1, "张三", "男", 35643.5, 46545.54));
        employees.add(new Employee(2, "李四", "女", 45632.21, 5451.15));
        employees.add(new Employee(3, "王五", "男", 3512.65, 45456.12));
        employees.add(new Employee(4, "冯绍峰", "男", 45621.33, 45831.2));
        employees.add(new Employee(5, "赵丽颖", "女", 78965.79, 6897536.21));
        employees.add(new Employee(6, "冯小刚", "男", 45664.16, 79856.25));

        //按照总业绩升序排序(冒泡排序)
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                switch (employees.get(i).compareTo(employees.get(j))) {//比较当前对象与下一个对象的总业绩
                    case 1://大于
                        //互换位置
                        Employee temp = employees.get(i);
                        employees.set(i, employees.get(j));
                        employees.set(j, temp);
                        break;
                    default:
                        break;//等于或小于则不做交换
                }
            }
        }

        //输出结果
        System.out.println("按照总业绩升序排序:");
        System.out.println("编号\t" + "姓名\t" + "性别\t" + "团险\t" + "个险\t" + "总业绩\t");
        for (int i = 0; i < employees.size(); i++) {
            //输出对象后再输出一下总业绩，方便阅读
            System.out.println(employees.get(i) + "\t" + String.format("%.2f", (employees.get(i).getGroupInsurancePerformance() + employees.get(i).getIndividualInsurancePerformance())));
        }

        //分割线
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
            if (i == 49)
                System.out.println("=");
        }

        //创建GroupInsurancePerformanceComparator团体险业绩比较器对象
        GroupInsurancePerformanceComparator GIPComparator = new GroupInsurancePerformanceComparator();
        //按照团体险业绩升序排序(冒泡排序)
        //比较方式用GroupInsurancePerformanceComparator对象的compare(Employee o1, Employee o2)方法进行比较
        for (int i = 0; i < employees.size() - 1; i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (GIPComparator.compare(employees.get(i), employees.get(j)) > 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
        //输出结果
        System.out.println("按照团体险业绩升序排序:");
        System.out.println("编号\t" + "姓名\t" + "性别\t" + "团险\t" + "个险\t");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }


        String str="cc";
        String str1=new String("cc");
        Object str2=new String("cc");

    }
}
