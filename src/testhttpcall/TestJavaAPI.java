package testhttpcall;

import com.huatech.framework.util.AesEcbMd5Helper;
import com.huatech.framework.util.MD5;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by doshuy on 06/06/2017.
 */
public class TestJavaAPI {

    @Test
    public void startWiths() {
        String url = "1http://192.168.82.101:88/wui/main.jsp";
        if (url.startsWith("http")) {
            System.out.println("ok");
        } else {
            System.out.println("error");
        }
    }

    @Test
    public void testMd5() {
        String md5PassWd = MD5.md5("Sunriver123qwe");
        System.out.println(md5PassWd + "    " + md5PassWd.length());
    }


    @Test
    public void testEas() {
        String a = "6EEA73C8-F417-4C18-B921-C183773F39C0";
        String pwd = "81F8VOilAz+ggxAl0Mkq6A==";

        String realPassword = null;
        try {
            a = DigestUtils.md5Hex(a);
            SecretKeySpec secretKeySpec = new SecretKeySpec(a.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            byte[] var3 = Base64.decode(a);
            byte[] encVal = cipher.doFinal(var3);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(realPassword);

    }

    @Test
    public void testSub() {
        String url = "https://exmail.qq.com/cgi-bin/frame_html?sid=edT_L1o7PikXb0Yf,2&r=6e5d06eae33079a169da4fbbcca7e891";
        System.out.println(url.substring(url.indexOf("?"), url.length()));
    }
}
