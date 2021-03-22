package com.knoldus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

   private final Map<String, String> map = new HashMap<>() {
      {
      put("John","9178982343");
      put("Mike","9876543210");
      put("Vyom","7898789800");
   }
};

   public Map<String,String> getMap(){
      return map;
   }

   //EXERCISE1
   Optional<String> findPhoneByName(final String name){
      try {
         if (map.containsKey(name)){
            return Optional.of(map.get(name));
         }
      }catch (Exception e){
         System.out.println("exception " +e);
      }
      return Optional.empty();
   }

   Optional<String> findNameByPhoneNumber(final String phoneNumber){
      try {
         for (Map.Entry<String,String> phoneBook : map.entrySet()){
            if (phoneBook.getValue().equals(phoneNumber)){
               return Optional.of(phoneBook.getKey());
            }
         }
      }catch (Exception e){
         System.out.println("exception " +e);
      }
      return Optional.empty();
   }



   @Override
   public String toString() {
      System.out.println("Hello from PHONEBOOK's toString");
      return "PhoneBook ="+ map;
   }
}
