package test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @Author: huangbin
 * @Description:
 * @Date: Created in
 * @Modified By:
 */
public class test {
    public static void main(String[] args) {
        getFile(new Son());
    }

    public static void getFile(Object o){
        Class clazz = o.getClass();
        Field[] files = clazz.getDeclaredFields();

        System.out.println(Arrays.toString(files));

        Field[] files2 = clazz.getFields();
        System.out.println(Arrays.toString(files2));

    }

}
