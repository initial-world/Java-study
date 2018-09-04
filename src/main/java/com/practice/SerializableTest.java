package com.practice;

import com.practice.utils.User;

import java.io.*;

/**
 * CreatedBy cx
 * CreateTime 2018/7/12 19:55
 * Description
 */
public class SerializableTest {
    public static void main(String[] args) {
        User user = new User();
        user.setUserNo("cx");
        user.setPassword("123456");
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("D:/a.txt"));
            // 将User对象写进文件
            os.writeObject(user);
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            InputStream in = new FileInputStream("D:"+ File.separator+"a.txt");
            ObjectInputStream os = new ObjectInputStream(in);
            User p = (User) os.readObject();
            //Person [name=vae, age=1]
            System.out.println(p.getPassword());
            os.close();
            System.out.println("After");
            System.out.println("username: " + p.getUserNo());
            System.out.println("password: " + p.getPassword());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
