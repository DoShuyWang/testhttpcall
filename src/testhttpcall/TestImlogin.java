package testhttpcall;

import com.huatech.framework.util.MD5;
import httpcall.HttpCallService;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by doshuy on 06/05/2017.
 */
public class TestImlogin {

    @Test
    public void goHtt() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        Map map = new HashMap();
        JSONObject json = new JSONObject();
        json.put("CLIENTID", "29e574fd-b0ef-486f-b46f-d1c358d86741");
        json.put("LOGON_NAME", "v_linhui");
        json.put("SECRET", "t8l6rmmhlE+Q097JNTUxFQ9vdpvIyJtIwL5SWqrdD4M=");
        json.put("PASSWD", "5412dc6fd2586cb39d171ad1429fe672");
        json.put("ACCESS_CLIENTID", "30b3e212-2821-4039-b711-40624201cbeb,b82ef1b0-1c51-4e4a-81e9-093acff22124,120fa233-bb79-4707-a088-7a72d0da89df");
        map.put("RequestParam", json.toString());
        String ret = null;
        ret = httpCallService.httpPost(map);
        JSONObject resultToken = JSONObject.fromObject(ret);
        System.out.println(resultToken);
        JSONObject tokenJson = (JSONObject) resultToken.get("TOKEN");
    }

    @Test
    public void testAcct() {
        HttpCallService httpCallService = new HttpCallService();
        Map map = new HashMap();
        JSONObject json = new JSONObject();
        String a = "token=" + "8678cf84-1ee9-4f61-b9b5-2aa360e7ec67";
        String client = "&clientId=29e574fd-b0ef-486f-b46f-d1c358d86741";
        String secret = ("&secret=t8l6rmmhlE%2BQ097JNTUxFQ9vdpvIyJtIwL5SWqrdD4M%3D");
        map.put("RequestParam", json.toString());
        String url = "http://127.0.0.1:8082/isso/rest/loginuser?" + a + client + secret;
        try {
            String result = httpCallService.httpGet(url);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testJsonNollPonit() {
        JSONObject json = new JSONObject();
        json.put("CLIENTID", "29e574fd-b0ef-486f-b46f-d1c358d86741");
        json.put("LOGON_NAME", "test");
        json.put("SECRET", "t8l6rmmhlE+Q097JNTUxFQ9vdpvIyJtIwL5SWqrdD4M=");
        json.put("PASSWD", "46f94c8de14fb36680850768ff1b7f2a");
        String obc = (String) json.get("A");
        System.out.println(obc);
        String z = (String) json.getString("B");
        System.out.println(z);

    }

    @Test
    public void testMd5() {
        System.out.println(MD5.md5("v_linhui"));

    }
}
