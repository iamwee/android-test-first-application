package com.example.zeon.myapplication.obj;

public class Person {

    private Builder builder;

    private Person() {

    }

    private Person(Builder builder) {
        this.builder = builder;
    }

    public static class Builder {
        private String firstname;
        private String midname;
        private String lastname;
        private int age;
        private String address;
        private String email;
        private String phone;

        public Builder() {
            age = 0;
            phone = "12345";
        }

        public Builder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public Builder midname(String midname){
            this.midname = midname;
            return this;
        }

        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

        public Person create(){
            return new Person();
        }
    }
}

