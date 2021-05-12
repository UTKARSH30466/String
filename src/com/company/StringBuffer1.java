package com.company;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Indian Girls:-");
        System.out.println(sb);
        //1)append method
        sb.append("Neha");
        System.out.println(sb);
       // insert method
        sb.insert(6,"Bharat");
        System.out.println(sb);
        //Delete Method
       sb.delete(0,6);
        System.out.println(sb);
        //Reverse method
        sb.reverse();
        System.out.println(sb);
        //toString
        sb.toString();
        System.out.println(sb);
        //Length methd
        int n = sb.length();

        System.out.println(n);
        int a = sb.indexOf("Girls");
        System.out.println(a);
        //LastIndexOf Method
        int x = sb.lastIndexOf("Girls");
        System.out.println(x);
        //Replace Method
        sb.replace(0,6,"Neha Gupta");
        System.out.println(sb);
        // SubString Method
        String s = sb.substring(3,5);
        System.out.println(s);


    }
}
