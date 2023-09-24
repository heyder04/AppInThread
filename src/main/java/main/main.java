/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.thread.MyConsumer;
import main.thread.MyProducer;
import main.thread.MyWorker;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
//        MyWorker m1=new MyWorker("HH");
//        MyWorker m2=new MyWorker("qq");
//        MyWorker m3=new MyWorker("ee");
//        MyWorker m4=new MyWorker("rr");
//        MyWorker m5=new MyWorker("tt");
//        MyWorker m6=new MyWorker("yy");
//        
//        m1.start();
//        m2.start();
//        m3.start();
//        m4.start();
//        m5.start();
//        m6.start();
        MyProducer mp1=new MyProducer();
        MyProducer mp2=new MyProducer();
        MyProducer mp3=new MyProducer();
        MyProducer mp4=new MyProducer();
        mp1.start();
        mp2.start();
        mp3.start();
        mp4.start();
        MyConsumer mc1=new MyConsumer();
        MyConsumer mc2=new MyConsumer();
        MyConsumer mc3=new MyConsumer();
        MyConsumer mc4=new MyConsumer();
        mc1.start();
        mc2.start();
        mc3.start();
        mc4.start();
    }
}
