package testpack;

import java.lang.reflect.Field;

/**
 * Created by doshuy on 07/18/2017.
 */
public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("zhangsan",1);
        Field[] fields = person.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
    }


}
