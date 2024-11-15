/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject6;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class LoginFailedException extends Exception {

    private static HashMap<Integer, Integer> failedcount = new HashMap<>();
    private int userid;

    public LoginFailedException(String msg, int user) {
        super(msg);
        this.userid = user;

        if (!failedcount.containsKey(user)) {
            failedcount.put(user, 1);
        } else {
            failedcount.put(user, failedcount.get(user) + 1);
        }
    }

    public static int getFailedcount(int user) {
        return failedcount.getOrDefault(user, 0);
    }

    public void setFailedcount(HashMap<Integer, Integer> failedcount) {
        this.failedcount = failedcount;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
