package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {




    public static void main(String[] args) {
        /*aduasdhsda*/

        String path = "/home/tuan/Desktop/Workspace/OOP/oop2018/src/week9/test.txt";
        String fileName = "test3.txt";
        String folderPath = "/home/tuan/Desktop/Workspace/OOP/oop2018/src/week9/";
//        writeContentToFile(path);
//        System.out.println(readContentFromFile(path));
        System.out.println(findFileByName(folderPath,fileName));
    }

    public static File findFileByName(String folderPath,String fileName) {
        try {
            File file = new File(folderPath);
            File[] list_file = file.listFiles();
            for (File item : list_file)
                if (item.getName().equals(fileName)) return item;


        }
        catch (Exception e){
            System.out.println("Error!");;
        }

        return null;
    }

    public static String readContentFromFile(String path){
        BufferedReader br=null;
        String result="";
        try{
            br = new BufferedReader(new FileReader(path));
            String temp =br.readLine();
            while(temp!=null){
                temp=temp+"\n";
                result = result.concat(temp);
                temp=br.readLine();
            }
            br.close();
        }
        catch(IOException e){
            System.out.println("Error : "+ e.toString());
        }
        return result;
    }


    public static void writeContentToFile(String path){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String content = "Write Content to File successful !!!!" + "\n";
        try{
            fw= new FileWriter(path);
            bw= new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            fw.close();

        }
        catch (IOException e) {
            System.out.println("Error : "+ e.toString());
        }

    }

    public static void writeContentToFile2(String path){
        BufferedWriter bw = null;
        FileWriter fw = null;
        String content = "Write Content to File successful !!!  " + "\n";
        try{
            fw= new FileWriter(path,true);
            bw= new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Error : "+ e.toString());
        }
    }

    public void chelsea(String a){
        int b = 10;
    }

}
