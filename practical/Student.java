package Practical;

import java.io.Serializable;

public class Student implements Serializable {
    public String studentID;
    public String name;
    public String address;
    public String phone;

    public Student() {
    }

    public Student(String studentID, String name, String address, String phone) {
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void hienThi(){
        System.out.println("Ten Hotel"+name);
        System.out.println("Dia chi"+address);
        System.out.println("SDT"+phone);
    }

    public void addStudent(){
        int opt;
        Scanner s = new Scanner(System.in);
        System.out.println("1.add name");
        System.out.println("2.add adress");
        System.out.println("3.add phone");
        opt = s.nextInt();

        switch (opt){
            case 1:
                System.out.println("Nhap ten student");
                name = s.nextLine();
                break;
            case 2:
                System.out.println("Nhap adress");
                location = s.nextLine();
                break;
            case 3:
                System.out.println("Nhap phone");
                ownerName = s.nextLine();
                break;
            case 4:
                break;
        }
    }
}
