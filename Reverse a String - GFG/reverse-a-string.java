// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    static String rec(String str,int i){
        if(i==str.length()-1){
            return Character.toString(str.charAt(i));
        }
        String s="";
        return rec(str,i+1)+Character.toString(str.charAt(i));
    }
    public static String reverseWord(String str)
    {
        // Reverse the string str
        return rec(str,0);
    }
}