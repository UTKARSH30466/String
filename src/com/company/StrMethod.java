package com.company;

public class StrMethod {
    public static void main(String args[])
    {
        //Creat String
        String s1 = "Rohit";
        String s2 = new String("He is Opener Batman");
        char arr[] = { 'I','N','D','I','A'};
        String s3 = new String(arr);
        //Display All String
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //Length Method
        System.out.println("Length of s1="+s1.length());
        //Concatenate two Strings
        System.out.println("s1 and s2 Joined="+s1.concat(s2));
        //Concatenate three Strings with 3
        System.out.println(s1+"From"+s3);
        // boolean method
        boolean x= s1.startsWith("M");
        if(x) System.out.println("s1 starts with \'M\'");
        else System.out.println("s1 does not start with \'M\'");
        // Convert uppercase and Lowwer case
        System.out.println("Upper s1= "+s1.toUpperCase());
        System.out.println("Lowwer s1= "+s1.toLowerCase());
        //Remove the white space
        //System.out.println(s1);//  Sachin
        System.out.println(s1.trim());
        //charAt() method
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(4));
        //replace() method
        String replaceString=s1.replace("Rohit","Mohit");//replaces all occurrences of "Java" to "Kava"
        System.out.println(replaceString);



    }
}
