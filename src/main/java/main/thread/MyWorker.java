/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.thread;

/**
 *
 * @author HP
 */
public class MyWorker extends Thread{
    private String name;
    public MyWorker(String name){
        this.name=name;
    }
   @Override
   public  void run(){
       for (int i = 0; i < 30; i++) {
                   System.out.println(name);

       }
    }
}
