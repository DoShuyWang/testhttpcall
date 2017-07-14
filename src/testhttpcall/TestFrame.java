package testhttpcall;

import com.huatech.framework.util.EncrypAES;
import com.huatech.framework.util.Logger;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
}
