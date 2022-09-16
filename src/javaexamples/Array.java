package javaexamples;

import java.util.Arrays;

public class Array
{
public static void main(String[] args)
{
    int[] arr ={ 9,8,7,6,5,4,3,2 };
    
   Arrays.sort(arr);
    
//    for (int i = 0; i < arr.length-1; i++) 
//    {      
//        for (int j = i + 1; j < arr.length; j++) 
//        {  
//            int tmp = 0;                           
//            if (arr[i] > arr[j]) 
//            {          
//                tmp = arr[i];              
//                arr[i] = arr[j];           
//                arr[j] = tmp;
//            }
//        }
//    }
//           for (int i = 0; i < arr.length; i++) 
//           {     
//              System.out.print(arr[i]+" ");  
//           }
           for (int i = arr.length-1; i >= 0; i--) 
           {     
              System.out.print(arr[i]+" ");  
           }
}
}
