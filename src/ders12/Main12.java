package ders12;

import java.util.Arrays;


public class Main12 {
    public static void main(String[] args) {
        int[] massiv = {3,7,11};
        System.out.println(Arrays.toString(massiv));
       massiv =  insertToArray(massiv,9,2);
        System.out.println(Arrays.toString(massiv));
    }
   static int[] insertToArray(int[] array,int element,int index){
        int[] newArray = new int[array.length + 1];
        for (int i = 0;i < index;i++){
            newArray[i] = array[i];
        }
        newArray[index] = element;
       for (int i = index + 1; i < newArray.length ; i++) {
           newArray[i] = array[i -1];
       }
       return newArray;

    }

}
