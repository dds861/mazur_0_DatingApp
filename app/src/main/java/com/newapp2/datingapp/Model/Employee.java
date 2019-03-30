package com.newapp2.datingapp.Model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @PrimaryKey
    public long id;

    public String email;
    public String password;

    public String name;
    public String birthday;
    public int height;
    public int weight;
    public String race;


    public int maritalStatus;
    public String aboutYou;
    public String wantToMakeClear;



}
