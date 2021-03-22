package com.knoldus;

public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook=new PhoneBook();

        //Exercise1
        System.out.println("Exercise1");
        System.out.println(phoneBook.findPhoneByName("John"));

        PhoneBookCrawler phoneBookCrawler=new PhoneBookCrawler();

        //Exercise2
        System.out.println("--------------");
        System.out.println("Exercise2");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameAndPrintIfNothingFound("Riya"));


        //Exercise3
        System.out.println("--------------");
        System.out.println("Exercise3");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("Mike"));

        //Exercise4
        System.out.println("--------------");
        System.out.println("Exercise4");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod("John"));

        //Exercise5
        System.out.println("--------------");
        System.out.println("Exercise5");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameUsingStream("John"));

        //Exercise6
        System.out.println("--------------");
        System.out.println("Exercise6");
        System.out.println(phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Vyom"));

        //Exercise7
        System.out.println("--------------");
        System.out.println("Exercise7");
        System.out.println(phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Vyom","7898789800"));
    }
}