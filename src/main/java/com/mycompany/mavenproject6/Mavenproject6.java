/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author ASUS
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        UserData u1 = new UserData(1112, 8888);//Deklarasi objek pertama (ketentuan id dan password benar)
        UserData u2 = new UserData(123434, 8888);//Deklarasi objek kedua (ketentuan id dan password salah)

        try {
            u1.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage() + LoginFailedException.getFailedcount(u1.getUserid()) + " kali");
        }

        try {
            u2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage() + LoginFailedException.getFailedcount(u2.getUserid()) + " kali");

        }

        try {
            u2.login();
        } catch (LoginFailedException e) {
            System.out.println(e.getMessage() + LoginFailedException.getFailedcount(u2.getUserid()) + " kali");
        }
    }
}
