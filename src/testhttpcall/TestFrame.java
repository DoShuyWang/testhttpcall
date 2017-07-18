package testhttpcall;

import com.huatech.framework.util.EncrypAES;
import com.huatech.framework.util.Logger;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.io.File;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * Created by doshuy on 06/22/2017.
 */
public class TestFrame {


    @Test
    public void go() throws BadPaddingException, InvalidKeyException, IllegalBlockSizeException, NoSuchAlgorithmException {
        String password = "123qwe";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] bs = md.digest();
        String base64MD5Password = com.sun.org.apache.xml.internal.security.utils.Base64.encode(bs);

        System.out.println("{MD5}" + base64MD5Password);
    }


    @Test
    public void testAES() throws BadPaddingException, InvalidKeyException, IllegalBlockSizeException {
        String pwd = EncrypAES.Decryptor("VHr9BpVs9IDPCkSbe1irOw==");
        System.out.println(pwd);
    }

    @Test
    public void getJar() throws Exception {
        URL url = Test.class.getResource("/com/huatech/idm");
        String path = String.valueOf(url);
        JarFile jarFile = new JarFile(path.substring(path.indexOf("/"), path.lastIndexOf("!")));
        Enumeration<JarEntry> entrys = jarFile.entries();
        ArrayList<String> className = new ArrayList<>();
        while (entrys.hasMoreElements()) {
            JarEntry jarEntry = entrys.nextElement();
            if (jarEntry.getName().startsWith("com/huatech/idm/") && jarEntry.getName().contains("entity") && jarEntry.getName().endsWith(".class")) {
                className.add(jarEntry.getName().replace("/", ".").replace(".class", ""));
            }
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        Object o = null;
        for (int i = 0; i < className.size(); i++) {
            Class<?> c = Class.forName(className.get(i));
            o = c.newInstance();
            hashMap.put(className.get(i), o);
        }
        HashMap<String, Object> atris = new HashMap<>();
        Object o2 = null;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!hashMap.isEmpty()) {
            for (Map.Entry o1 : hashMap.entrySet()) {
                o2 =o1.getValue();
                Field[] fields = o2.getClass().getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    arrayList.add(fields[i].toString());
                }
                atris.put((String) o1.getKey(),arrayList);
                arrayList.clear();
            }
        }
        System.out.println();

    }
}
