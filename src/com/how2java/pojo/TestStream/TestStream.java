package com.how2java.pojo.TestStream;

import java.io.*;

public class TestStream {

    public static void main(String [] args){
        write();
        read();
    }


    private static void read(){
        File file = new File("C:/Users/mobiker/Documents/host.txt");
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ){
            boolean b = dataInputStream.readBoolean();
            int i = dataInputStream.readInt();
            String str = dataInputStream.readUTF();

            System.out.println("读取到的布尔值:"+b);
            System.out.println("读取到的整数:"+i);
            System.out.println("读取到的字符串:"+str);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void write(){
        File file = new File("C:/Users/mobiker/Documents/host.txt");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        ) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(300);
            dataOutputStream.writeUTF("123 this is gareen");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
