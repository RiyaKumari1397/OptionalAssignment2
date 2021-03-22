package com.knoldus;

import java.util.Map;


public class PhoneBookCrawler {
     private final PhoneBook phoneBook = new PhoneBook();

   //EXERCISE2
     public String findPhoneNumberByNameAndPrintIfNothingFound(final String name)
     {
          return phoneBook.findPhoneByName(name).orElse("No phone number found");
     }

     //EXERCISE3
     public String findPhoneByNameAndPrintPhoneBookIfNothingFound(final String name){
          return phoneBook.findPhoneByName(name).orElse("PhoneBook Data" + phoneBook.getMap());
     }

     //EXERCISE4
     public String findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(final String name) {
          return phoneBook.findPhoneByName(name).orElse("PhoneBook Data" + phoneBook.toString());
     }

     //EXERCISE5
     public String findPhoneNumberByNameUsingStream(final String name) {
          if (phoneBook.getMap().containsKey(name)) {
               return phoneBook.getMap().entrySet().stream()
                       .filter(e -> name.equals(e.getKey()))
                       .map(Map.Entry::getValue)
                       .findFirst().get();
          } else {
               return "Number for the given name does not exist";
          }
     }
    //EXERCISE6
     public String findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams(final String name) {
          if (phoneBook.getMap().containsKey(name)) {
               return phoneBook.getMap().entrySet().stream()
                       .filter(e -> name.equals(e.getKey()))
                       .map(Map.Entry::getValue)
                       .findFirst().get();
          } else {
               return "Phonebook Data-" + phoneBook.getMap();
          }
     }

     //EXERCISE7
     public String findPhoneNumberByNameOrNameByPhoneNumber(final String name, final String phoneNumber) {
          if (phoneBook.findPhoneByName(name).isPresent())
          {
               return phoneBook.findPhoneByName(name).get();
          }
          else if(phoneBook.findNameByPhoneNumber(phoneNumber).isPresent()) {
               return phoneBook.findNameByPhoneNumber(phoneNumber).get();
          }
          else {
               return "no match available";
          }
     }
}


