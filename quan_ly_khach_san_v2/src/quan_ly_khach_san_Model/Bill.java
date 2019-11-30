/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan_ly_khach_san_Model;

import java.time.LocalDateTime;

/**
 *
 * @author HaiDo
 */
public class Bill {
    String day;
    //employer employ;
    //String customerName;
    String id;
    
    public Bill(){
        this.id = getIDBill();
        this.day = getDay();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    private String getDay(){
        String s = "";
        LocalDateTime d = java.time.LocalDateTime.now();
        if(d != null){
            s = d.toString();
        }
        return s;
    }
    
    private String getIDBill(){
        String s = "";
        String idStr = "";
        LocalDateTime d = java.time.LocalDateTime.now();
        if(d != null){
            s = d.toString();
        }
        for(int i = 2; i < s.length()-2; i++){
            if(s.charAt(i)>='0'&& s.charAt(i) <= '9'){
                idStr += s.charAt(i);
            }
        }
        return idStr;
    }   
    
}

