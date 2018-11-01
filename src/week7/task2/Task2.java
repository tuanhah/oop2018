package week7.task2;

import java.io.*;

class A{}
class B extends A{}

public class Task2 {


    //NullPointerException
    public static void null_pointer() throws NullPointerException {
        String str = null;
        int a = str.length();
    }

    //ArrayIndexOutOfBoundsException
    public static void index() throws ArrayIndexOutOfBoundsException {
        int array[] = new int[10];
        int value = array[11];
    }

    //ArithmeticException
    public static void divzero() throws ArithmeticException {
        int divzero = 1/0;
    }

    //ClassCastException
    public static void cast() throws ClassCastException {
        A a = new A();
        B b = (B) a;

    }

    //IOException
    public static void io() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/tuan/Desktop/Workspace/OOP/oop2018/src/week7/task2/items.json"));
        String line = br.readLine();
        br.close();
        line = br.readLine();

    }

    //FileNotFoundException
    public static void file() throws FileNotFoundException {

        File fl = new File("test.txt");
        FileReader file = new FileReader(fl);

    }


    public static void main(String args[]) {


        try{
            null_pointer();
        }
        catch(NullPointerException err){
            System.out.println("error: " + err);
        }


        try{
            index();
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("error: " + err);
        }


        try{
            cast();
        }
        catch(ClassCastException err){
            System.out.println("error: " + err);
        }


        try{
            divzero();
        }
        catch(ArithmeticException err){
            System.out.println("error: " + err);
        }


        try{
            file();
        }
        catch(FileNotFoundException err){
            System.out.println("error: " + err);
        }


        try{
            io();
        }
        catch(IOException err){
            System.out.println("error: " + err);
        }

    }
}