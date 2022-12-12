package org.kfh;


import java.io.*;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
//       Text-blocks
//        String data = "Hello How are you \n wjhats up\n hey there";
        System.out.println("Enter a number");
        int value = new Scanner(System.in).nextInt();

        //switch expression : Java 14

        System.out.println(
        switch(value){
            case 12, 1, 2 -> "WINTER";
            case 3, 4, 5 -> "SPRING";
            case 6, 7, 8 -> "SUMMER";
            case 9, 10, 11 -> "AUTUMN";
            default -> "No such season exists...";
        });

        String data = """
        Hello there how are you
        WHat's going on ?
        This works starting with Java 15
        """;


        String newData = data;
        System.out.println(data);

//       Local Variable Type inference: Java 10
        var reader = new BufferedReader(new InputStreamReader(new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        }));

        var url = new URL("https://www.google.com");

        var listOfNames = new ArrayList<String>();


        var theConnection = url.openConnection();

        for(var name : listOfNames){

        }


        for(var index = 0;index < 10; index++){

        }


//        String _ = "Noora";//Can't be used as an identifier starting with Java 9

    }

    interface Remote{
        default void afterJava8(){
            func();
        }

        private void func(){}//Starting with Java 9, yes we can have private methods in an interface
    }
}
