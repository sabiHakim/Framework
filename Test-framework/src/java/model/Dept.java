/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu001991.framework.ModelView;
import etu001991.framework.Url;

public class Dept {
     int id;
    String nom;

    public Dept(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public Dept (){
        
    }
    
    

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
    
  @Url(name = "dept-all")
    public ModelView findall()
    {
        
        
        ModelView mv= new ModelView();
        mv.setViewname("ListDept.jsp");
       return mv;
    }
    
    @Url(name="dept-add")
    public void add()
    {
        
    }
    
}
    

