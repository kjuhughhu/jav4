package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> listHotel = new ArrayList<>();
        int dem = 0;

        System.out.println("Nhap 'add' de the thong tin student");

        String opt = "";
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("Lua chon: ");
            opt = s.nextLine();

            switch (opt.toLowerCase()){
                case "add":
                    dem++;
                    int id=dem;
                    System.out.println("Nhap ten student");
                    String name = s.nextLine();
                    System.out.println("Nhap dia chi student");
                    String location = s.nextLine();
                    System.out.println("Nhap phone student");
                    String ownerName = s.nextLine();
                case "search":

            }
        }while (true);
    }
}