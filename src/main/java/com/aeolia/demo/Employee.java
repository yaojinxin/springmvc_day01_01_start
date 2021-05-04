package com.aeolia.demo;

/**
 * 职工类
 */
public class Employee implements Comparable<Employee> {

    private Integer eid;//职工编号
    private String name;//姓名
    private String sex;//性别
    private Double groupInsurancePerformance;//团体险业绩
    private Double individualInsurancePerformance;//个体险业绩

    //有参构造
    public Employee(Integer eid, String name, String sex, Double groupInsurancePerformance, Double individualInsurancePerformance) {
        this.eid = eid;
        this.name = name;
        this.sex = sex;
        this.groupInsurancePerformance = groupInsurancePerformance;
        this.individualInsurancePerformance = individualInsurancePerformance;
    }

    //无参构造
    public Employee() {
    }

    /**
     * 重写toString,只输出值，值与值之间用逗号分隔
     *
     * @return
     */
    @Override
    public String toString() {
        return eid + ",\t" + name + ",\t" + sex + ",\t" + groupInsurancePerformance + ",\t" + individualInsurancePerformance;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getGroupInsurancePerformance() {
        return groupInsurancePerformance;
    }

    public void setGroupInsurancePerformance(Double groupInsurancePerformance) {
        this.groupInsurancePerformance = groupInsurancePerformance;
    }

    public Double getIndividualInsurancePerformance() {
        return individualInsurancePerformance;
    }

    public void setIndividualInsurancePerformance(Double individualInsurancePerformance) {
        this.individualInsurancePerformance = individualInsurancePerformance;
    }

    /**
     * 实现Comparable接口重写compareTo()方法
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        double v = (this.getGroupInsurancePerformance() + this.getIndividualInsurancePerformance()) - (o.getGroupInsurancePerformance() + o.getIndividualInsurancePerformance());
        return v > 0.0 ? v == 0.0 ? 0 : 1 : -1;
    }
}
