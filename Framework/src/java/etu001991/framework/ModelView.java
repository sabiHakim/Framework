/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etu001991.framework;

import java.util.HashMap;

public class ModelView {
    String Viewname;
    HashMap<String, Object> data = new HashMap<>();

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
      public void addItem(String key,Object value){
        data.put(key,value);
    }
    public String getViewname(){
        return Viewname;
    }

    public void setViewname(String Viewname){
        this.Viewname = Viewname;
    }
    
    
    
}
