package com.epam.second_stage.i_o_fundamentals;

import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        String arg = null;
//        for (String element : args) {
//            System.out.println(element);
//            arg = element;
//        }
//        displayIt(new File(arg));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory path:");
        String directoryPath = scanner.nextLine();



        displayIt(new File(directoryPath));
//        try (FileWriter fileWriter = new FileWriter("data/file.txt");
//             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
//            while (directoryPath != null) { // НЕ РАБОТАЕТ, ПЕРЕПИСАТЬ ЛОГИКУ
//                bufferedWriter.write(directoryPath, 0, directoryPath.length());
//                bufferedWriter.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File (directoryPath);
//        if (file.exists() && file.isFile()) {
//            System.out.println(file.length());
//        }
    }


    public static void displayIt(File node) {

        System.out.println(node.getAbsoluteFile());

        if(node.isDirectory()) {
            String[] subNote = node.list();
            for(String filename : subNote){
                displayIt(new File(node, filename));
            }
        }
    }
}
//    Scanner scan = new Scanner(new FileReader("f:/persons.txt"));
//
//		while(scan.hasNext())
//                {
//                if(scan.hasNextInt())
//                {
//                System.out.println("INT: "+scan.nextInt());
//                }
//                else
//                {
//                System.out.println("STRING: "+scan.next());
//                }
//                }

//    String Str = new String("Добро пожаловать на ProgLang.su");
//    boolean retVal;
//        retVal = Str.endsWith("ProgLang.su");
//                System.out.println("Возвращаемое значение: " + retVal);
//                retVal = Str.endsWith("su");
//                System.out.println("Возвращаемое занчение 2 " + retVal);
