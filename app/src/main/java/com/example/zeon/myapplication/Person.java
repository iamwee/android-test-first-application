package com.example.zeon.myapplication;

/**
 * Created by Zeon on 7/8/2559.
 */

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String eMail;
    private String numberPhone;
    private int age;

    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        address = builder.address;
        eMail = builder.eMail;
        numberPhone = builder.numberPhone;
        age = builder.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", eMail='" + eMail + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private String address;
        private String eMail;
        private String numberPhone;
        private int age;

        public Builder() {
            age = 0;
            numberPhone = "12345";
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder eMail(String eMail){
            this.eMail = eMail;
            return this;
        }

        public Builder numberPhone(String numberPhone){
            this.numberPhone = numberPhone;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}

