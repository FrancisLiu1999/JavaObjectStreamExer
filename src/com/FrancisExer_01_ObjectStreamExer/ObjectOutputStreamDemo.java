package com.FrancisExer_01_ObjectStreamExer;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象序列化流
        //一个对象要想被序列化，该对象所属的类必须实现Serializable接口
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\liume\\Desktop\\hrmup\\JavaObjectStreamExer\\oos.txt"));

        Student s = new Student("小明", 16);
        oos.writeObject(s);

        oos.close();

        //对象反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\liume\\Desktop\\hrmup\\JavaObjectStreamExer\\oos.txt"));
        Object readObject = ois.readObject();

        Student ss = (Student) readObject;
        System.out.println(ss.getName() + "," + ss.getAge());

        ois.close();

    }
}
