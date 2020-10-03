package com.zzkzzkjsw;
import java.util.Arrays;
import java.util.Random;


public class Main{
    public static void main(String args[]){
        Random rand= new Random( System.currentTimeMillis() );
        System.out.println(rand.nextInt(100));
        byte buffer[]=new byte[20];
        rand.nextBytes(buffer);
        System.out.println(Arrays.toString(buffer));
    }
}
