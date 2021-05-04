package com.aeolia.domain;

public class Student {
    private Integer sId;
    private String sName;
    private Integer sAge;
    private String sAddress;
    private String sPhoneNumber;

    public Student(Integer sId, String sName, Integer sAge, String sAddress, String sPhoneNumber) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
        this.sAddress = sAddress;
        this.sPhoneNumber = sPhoneNumber;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sAddress='" + sAddress + '\'' +
                ", sPhoneNumber='" + sPhoneNumber + '\'' +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPhoneNumber() {
        return sPhoneNumber;
    }

    public void setsPhoneNumber(String sPhoneNumber) {
        this.sPhoneNumber = sPhoneNumber;
    }
}
