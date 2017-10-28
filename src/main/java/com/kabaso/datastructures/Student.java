package com.kabaso.datastructures;

public class Student {

    private int studentNumber;
    private  String name;
    private int age;
    private Student next;
    private Student previous;

    public Student(Builder builder) {
        studentNumber=builder.studentNumber;
        name=builder.name;
        age=builder.age;
        next=builder.next;
        previous=builder.previous;
    }

    public static class Builder{
        private int studentNumber;
        private  String name;
        private int age;
        private Student next;
        private Student previous;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder age(int value){
            this.age=value;
            return this;
        }

        public Builder next(Student value){
            this.next=value;
            return this;
        }

        public Builder previous(Student value){
            this.previous=value;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
