package week10;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        double array[] = new double[1000];
        Random rd = new Random();

        //Creat array
        for(int i=0;i<1000;i++){
            double t = rd.nextDouble() *10;
            array[i]=t;
        }
        //Show array before sort
        for(int i=0;i<1000;i++){
            System.out.print(" "+ array[i]);
        }
        //Sort
        for(int i=0; i < 1000; i++){
            for(int j=1; j < (1000-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    double temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
        //Show array after sort
        System.out.println("\n");
        for(int i=0;i<1000;i++){
            System.out.print(" "+ array[i]);
        }



    }
}
