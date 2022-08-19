/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_ptit;

/**
 *
 * @author Admin
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class hello_file {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
