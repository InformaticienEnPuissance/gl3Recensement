/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author USER
 * @param <T>
 */
public abstract class Dao<T>{
    public Connection connect = ConnectDB.getInstance();
    //recherche
    public abstract T recherche (int id);
    public abstract void ajouter (T obj);
    //modification
    public abstract void modifier (T obj, int id);
    //suppresion
    public abstract void supprime(int id);
    // List
    public abstract List<T> list();
}
