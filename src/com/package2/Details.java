package com.package2;

public class Details {
    public static void main(String[] args) {
        Student details=new Student("udhaya","physics","udhyaSri@",638268441);

        System.out.println(details.getName());
        System.out.println(details.getDepartment());
        System.out.println(details.getEmailId());
        System.out.println(details.getPhoneNumber());


        details.setName("selvi");
        System.out.println(details.getName());

        details.setDepartment("english");
        System.out.println(details.getDepartment());

        details.setEmailId("selvi@");
        System.out.println(details.getEmailId());

        details.setPhoneNumber(778771919);
        System.out.println(details.getPhoneNumber());


    }
}
