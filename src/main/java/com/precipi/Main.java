package com.precipi;

/**
 * Main Function for test
 */
public class Main
{

    public static void main(String[] args) {
        System.out.println("Hello Gradle");
        helpFunc();
    }

    public static void helpFunc() {
//        TODO : write test function
        System.out.println("Help Function");
        msgHelper m;


        m = new msgHelper();
        m.printMsg("My Message");
    }


}
