/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import etu001991.framework.ModelView;
import etu001991.framework.Url;
import java.util.Vector;
public class Dept {
     int id;
    String nom;
    String loc;
   public Dept(){}

    public Dept(int id, String nom,String loc) {
        this.id = id;
        this.nom = nom;
        this.loc = loc;
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
    
//  @Url(name = "dept-all")
//    public ModelView findall()
//    {
//        
//        
//        ModelView mv= new ModelView();
//        mv.setViewname("ListDept.jsp");
//       return mv;
//    }
//    
//    @Url(name="dept-add")
//    public void add()
//    {
//        
//    }
//    

    /**
     *
     * @return
     */
      @Url(name="dept-all")
    public ModelView findAll(){      
        Dept d1 = new Dept(1,"besarety","TANA");        
        Dept d2 = new Dept(2,"andravoangy","TANA");        
        Dept d3 = new Dept(2,"behoririka","TANA");        
        Dept d4 = new Dept(2,"andoram","TANA");        

        Vector<Dept> list = new Vector();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        list.add(d4);
        
        ModelView mv = new ModelView();
        mv.setViewname("ListDept.jsp");
        mv.addItem("list", list);
        
        return mv;
    }
}
    

