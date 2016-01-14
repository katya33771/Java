package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello, I am Katya Zhurko ");

        String[] name = new String[15];
        RandomNameGenerator rnd = new RandomNameGenerator();
        for (int i=0; i<15; i++){
            name[i]= rnd.next();
        }
        Arrays.sort(name);
        for (int i=0; i<15; i++){
            System.out.println("Hello, "+name[i]);
        }
    }
}