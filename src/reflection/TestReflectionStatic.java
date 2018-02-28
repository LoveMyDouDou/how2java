package reflection;

public class TestReflectionStatic {

    public static void main(String [] args) throws InterruptedException {
        Thread thread1=new Thread(){
            public void run(){
                TestReflectionStatic.method1();
            }
        };
        thread1.setName("第一个线程");
        thread1.start();

        //保证第一个线程先调用
        Thread.sleep(1000);

        Thread thread2=new Thread(){
            public void run(){
                TestReflectionStatic.method2();
            }
        };
        thread2.setName("第二个线程");
        thread2.start();
    }

    public static void method1(){
        synchronized (TestReflectionStatic.class){
            System.out.println(Thread.currentThread().getName()+"进入了method1方法");
            try {
                System.out.println("运行5秒");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    对于method2而言，必然有个同步对象，通过观察发现，
    当某个线程在method1中，占用了TestReflectionStatic.class之后
    就无法进入method2，推断出,method2的同步对象，就是TestReflection.class
     */
    public static synchronized void method2(){
        try {
            System.out.println("运行5秒");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
