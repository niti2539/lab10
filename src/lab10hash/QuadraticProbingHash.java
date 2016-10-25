/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10hash;

import java.util.Arrays;

/**
 *
 * @author Bank
 */
public class QuadraticProbingHash {
   private Object[] hash;
   private int max_size;
   private int current_size;
   private int key;
   public QuadraticProbingHash(int max_size){
       this.max_size=max_size;
       hash=new Object[max_size];
       current_size=0;
       
   }
   public boolean isEmpty(){
       return current_size==0;
   }
    public  void add(Object value){
       
        if(contains(value))
            return;
        if(current_size+1>=max_size*70/100){
            rehash();           
        }       
        hash[key(value)]=value;
        current_size++;      
    }
    public void remove(Object value){
        if(contains(value)){
            hash[key(value)]="deleted";
            current_size--;
        }
    }
    public boolean contains(Object value){
        return hash[key(value)]!=null&&hash[key(value)]!="deleted";
    }
    private int key(Object value){
        key=(int)value%max_size;
        for (int j=0; j<hash.length; j++) {
                if (hash[key] == null||hash[key]=="deleted") return key;
                if (hash[key].equals(value)) return key;
                    key = (key +2*j+ 1) % hash.length;
}        
       return key;
    }
    private  void rehash(){
      
        Object[] re=new Object[max_size];
        for(int i=0;i<hash.length;i++){
            re[i]=hash[i];
            
        }
        max_size*=2;
        hash=new Object[max_size];
        current_size=0;
        for(int j=0;j<re.length;j++){
            if(re[j]!=null&&re[j]!="deleted"){
                add(re[j]);
            }
        }
    }
    public void printHashTable(){
        System.out.println(Arrays.toString(hash));
        
    }
}
