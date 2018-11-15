package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    private static String fileContent = "";

    public  static void readFile(String path){
        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream(path);
            reader = new BufferedReader(new InputStreamReader(fis));
            String temp="";
            while ((temp = reader.readLine()) != null) {
                fileContent += temp + "\n";
            }
//            fileContent2 = new String(fileContent);

        } catch (IOException e) {
            System.out.println("Error when read File");;
        }

    }
    public static void excute(String stringPattern){
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(fileContent);
        fileContent = matcher.replaceAll("");

    }
    public static void handleFileContent(){
        String stringPattern = "";
        stringPattern = "(//.*?\n)"; //delete content after //
        excute(stringPattern);
        stringPattern = "(/\\*(.*\n)*?.*\\*/)"; //delete conten in /**/
        excute(stringPattern);
        stringPattern =  "^\\s*\n$";
        excute(stringPattern);
    }

    public static List<String> getAllFunction(String path){

        List<String> result = new ArrayList<String>() ;
        readFile(path);
        handleFileContent();

        String methodPattern = "(\\s+|^|\\{)((?<modifier>public|private|protected)\\s+)static\\s+?(?<type>((\\w|\\.)+\\s*(<[^>]*?(<[^<]*>)?[^<]*?>)?(\\[\\])?))\\s+(?<methodName>\\w+)\\s*\\([^\\(]*\\)\\s*\\{";
        Pattern pattern = Pattern.compile(methodPattern);
        Matcher matcher = pattern.matcher(fileContent);
        while (matcher.find()) {
//            System.out.println(matcher.group("methodName"));
            String temp = "";
            temp = matcher.group("methodName") + "\n";
            int count = 1;
            for (int i = matcher.end(); ; i++) {
                if (fileContent.charAt(i) == '{') count++;
                if (fileContent.charAt(i) == '}') {
                    count--;
                    if (count == 0) {
                        temp +=fileContent.substring(matcher.end(), i - 1);
                        result.add(temp);
                        break;
                    }
                }
            }
        }
    return result;

    }



    public static String findFunctionByName(String name){


        String[] arr = name.split(" |\\(|\\)|,");
        String str1 ="";
        for (String item : arr) str1 += item;
        String namefunction="";

        int cout =fileContent.indexOf(" "+arr[0]);
        while (fileContent.charAt(cout) != ')') {
            namefunction += fileContent.charAt(cout);
            cout++;
        }
//        System.out.println(namefunction);
        String[] arr2 =namefunction.split(",|\\(| ");
        String str2 =new String(arr2[1]);
        for (int count = 2; count < arr2.length;count++) {
            if (count % 2 == 0) str2 += arr2[count];
//            System.out.println(arr2[count]);
        }
        if (str1.equals(str2)) {
            System.out.println(namefunction+")");
            while (fileContent.charAt(cout) != '{') cout ++;
            int count = 0;
            for (int i = cout; ; i++) {
                if (fileContent.charAt(i) == '{') count++;
                if (fileContent.charAt(i) == '}') {
                    count--;
                    if (count == 0) {
                        System.out.println(fileContent.substring(cout, i -1) +"}");
                        break;
                    }
                }
            }

        }
        else System.out.println("Khong tim thay");


        return null;
    }

    public static void main(String[] args) {
//        readFile("/home/tuan/Desktop/Workspace/OOP/oop2018/src/week9/Utils.java");
//        handleFileContent();

        List<String> rs = new ArrayList<>();
        rs = getAllFunction("/home/tuan/Desktop/Workspace/OOP/oop2018/src/week9/Utils.java");
        for (int cout = 0 ; cout < rs.size();cout ++) {
            System.out.println(rs.get(cout));

        }
        findFunctionByName("chelsea(String)");

    }

}
