package com.knoldus;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    PhoneBook phoneBook =new PhoneBook();
    PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler();

   //Exercise1
    @Test
    void findPhoneByName(){
        Optional<String> test1 = phoneBook.findPhoneByName("John");
        assertEquals(Optional.of("9178982343"),test1);
    }
    @Test
    void findPhoneByNameEmpty(){
        Optional<String> test2 = phoneBook.findPhoneByName("ria");
        assertEquals(Optional.empty(),test2);
    }

   //Exercise2
    @Test
    void findPhoneByNameAndPrintIfNothingFound(){
        String test3 = phoneBookCrawler.findPhoneNumberByNameAndPrintIfNothingFound("Mike");
        assertEquals("9876543210",test3);
    }
    @Test
    void findPhoneByNameAndPrintIfNothingFoundMismatch(){
        String test4 = phoneBookCrawler.findPhoneNumberByNameAndPrintIfNothingFound("riya");
        assertNotEquals("9876543210",test4);
    }

    //Exercise3
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFound(){
        String test5 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("John");
        assertEquals("9178982343",test5);
    }
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundMismatch(){
        String test6 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFound("riya");
        assertNotEquals("9178982343",test6);
    }

    //Exercise4
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(){
        String test7= phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod("John");
        assertEquals("9178982343",test7);
    }
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod1(){
        String test8= phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod("riya");
        assertEquals("PhoneBook DataPhoneBook ={Mike=9876543210, John=9178982343, Vyom=7898789800}",test8);
    }

    //Exercise5
    @Test
    void findPhoneNumberByNameUsingStream(){
        String test9 = phoneBookCrawler.findPhoneNumberByNameUsingStream("John");
        assertEquals("9178982343",test9);
    }
    @Test
    void findPhoneNumberByNameUsingStreamMismatch(){
        String test10 = phoneBookCrawler.findPhoneNumberByNameUsingStream("Samarthya");
        assertNotEquals("9178982343",test10);
    }

    //Exercise6
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams(){
        String test11 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("John");
        assertEquals("9178982343",test11);
    }
    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreamsMismatch(){
        String test12 = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams("Leena");
        assertNotEquals("9178982343",test12);
    }

    //Exercise7
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber(){
        String test13 = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("John","");
        assertEquals("9178982343",test13);
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumberMismatch(){
        String test14 = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("","9178982343");
        assertEquals("John",test14);
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumberMismatched(){
        String test15 = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("ria","91789857");
        assertEquals("no match available",test15);
    }
}