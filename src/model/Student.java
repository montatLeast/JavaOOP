package model;

public class Student {
    String name;
    int age;
    String sex;
    String sNumber;

    public Student(String name, int age, String sex, String sNumber) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.sNumber = sNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sNumber='" + sNumber + '\'' +
                '}';
    }
}
