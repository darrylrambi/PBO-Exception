/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

/**
 *
 * @author ASUS
 */
public class UserData {

    private int userid;
    private int password;
    private boolean isLoggedIn;

    public UserData(int userid, int password) {
        this.userid = userid;
        this.password = password;
    }

    public void login() throws LoginFailedException {
        assert String.valueOf(this.userid).length() == 4 : "UserID harus pas 4 digit";
        assert String.valueOf(this.password).length() == 4 : "Password harus pas 4 digit";

        if (this.userid + this.password != 10000) {
            this.isLoggedIn = false;
            throw new LoginFailedException("Login user " + userid + " gagal, telah gagal login " + LoginFailedException.getFailedcount(userid) + " kali", userid);
        } else {
            this.isLoggedIn = true;
            System.out.println("Login successful for user " + userid);
        }
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
