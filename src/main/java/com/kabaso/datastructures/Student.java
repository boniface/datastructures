package com.kabaso.datastructures;

public class Student {

    private int studentNumber;
    private  String name;
    private int age;


    public Student(Builder builder) {
        studentNumber=builder.studentNumber;
        name=builder.name;
        age=builder.age;

    }

    public static class Builder{
        private int studentNumber;
        private  String name;
        private int age;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder age(int value){
            this.age=value;
            return this;
        }


        public Builder studentNumber(int value){
            this.studentNumber=value;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return studentNumber == student.studentNumber;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }
}
