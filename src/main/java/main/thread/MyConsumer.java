/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author HP
 */
public class MyConsumer extends Thread{
    @Override
    public void run(){
        while(true){
        int lastIndex=Base.list.size()-1;
            System.out.println("last index"+lastIndex);
        if(lastIndex>-1){
        String s=Base.list.remove(lastIndex);
            System.out.println("s="+s);
            
                } 
        }
    }
}
