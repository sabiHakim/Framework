/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu001991.framework.Url;

public class Emp {
    int id;
    String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
  @Url(name = "emp-all")
    public Emp[] findall()
    {
        return null;
    }
    
    @Url(name="emp-add")
    public void add()
    {
        
    }
    
}
