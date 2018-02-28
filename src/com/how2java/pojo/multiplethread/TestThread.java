package com.how2java.pojo.multiplethread;

import com.how2java.pojo.charactor.Hero;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.StreamSupport;

public class TestThread {

    public static String now(){
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public static void main(String [] args){

        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 10000;

        int n = 10000;

        Thread [] addThreads = new Thread[n];
        Thread [] reduceThreads = new Thread[n];

//        final Object someObject = new Object();
//
//        Thread thread1 = new Thread(){
//            public void run(){
//                System.out.println(now()+"t1线程已经运行");
//                System.out.println(now()+this.getName()+"试图占有对象:someObject");
//                synchronized (someObject){
//                    System.out.println(now()+this.getName()+"占有对象:someOnject");
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(now()+"t1线程结束");
//                }
//            }
//        };
//        thread1.setName("thread-1");
//        thread1.start();
//
//        Thread thread2 = new Thread(){
//          public void run(){
//              System.out.println(now()+"t2线程已经运行");
//              System.out.println(now()+this.getName()+"试图占有对象:someObject");
//              synchronized (someObject){
//                  System.out.println(now()+this.getName()+"占有对象：someObeject");
//                  try {
//                      Thread.sleep(5000);
//                  } catch (InterruptedException e) {
//                      e.printStackTrace();
//                  }
//                  System.out.println(now()+"t2线程结束");
//              }
//          }
//        };
//        thread2.setName("thread-2");
//        thread2.start();


//        final Hero gareen = new Hero();
//        gareen.name = "盖伦";
//        gareen.hp = 10000;
//
//        System.out.printf("盖伦的初始血量是 %.0f%n",gareen.hp);
//
//        int n = 10000;
//
//        Thread [] addThreads = new Thread[n];
//        Thread [] reduceThreads = new Thread[n];
//
//        for (int i = 0; i < n; ++i){
//            Thread thread = new Thread(){
//              public void run(){
//                  gareen.recover();
//                  try {
//                      Thread.sleep(100);
//                  } catch (InterruptedException e) {
//                      e.printStackTrace();
//                  }
//              }
//            };
//            thread.start();
//            addThreads[i]=thread;
//        }
//
//        for (int  i = 0; i < n ;++i){
//            Thread thread = new Thread(){
//                public void run(){
//                    gareen.hurt();
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            };
//            thread.start();
//            reduceThreads[i]=thread;
//        }
//
//        for (Thread thread: addThreads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        for (Thread thread :reduceThreads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了%.0f%n",n,n,gareen.hp);



//        Hero gareen = new Hero();
//        gareen.name = "盖伦";
//        gareen.hp = 616;
//        gareen.damage = 50;
//
//        Hero teemo = new Hero();
//        teemo.name = "提莫";
//        teemo.hp = 300;
//        teemo.damage = 30;
//
//        Hero bh = new Hero();
//        bh.name = "赏金猎人";
//        bh.hp = 500;
//        bh.damage = 65;
//
//        Hero leesin = new Hero();
//        leesin.name = "盲僧";
//        leesin.hp = 455;
//        leesin.damage = 80;
//
//
//        Thread thread1 = new Thread(){
//            public void run() {
//                while (!teemo.isDead()) {
//                    gareen.attackHero(teemo);
//                }
//            }
//        };
//        thread1.start();
//
//        Thread thread2 = new Thread(){
//            public void run() {
//                while (!leesin.isDead()) {
//                    bh.attackHero(leesin);
//                }
//            }
//        };
//        thread2.start();

//        Battle battle1 = new Battle(gareen,teemo);
//        new Thread(battle1).start();
//        Battle battle2 = new Battle(bh,leesin);
//        new Thread(battle2).start();

//        KillThread killThread1 =new KillThread(gareen,teemo);
//        killThread1.start();
//        KillThread killThread2 =new KillThread(bh,leesin);
//        killThread2.start();

//        while (!teemo.isDead()){
//            gareen.attackHero(teemo);
//        }
//
//        while (!leesin.isDead()){
//            bh.attackHero(leesin);
//        }
    }

}
