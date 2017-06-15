package testhttpcall;

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
    public void lgoinIm() {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("CLIENTID", "29e574fd-b0ef-486f-b46f-d1c358d86741");
        json.put("LOGON_NAME", "test");
        json.put("SECRET", "t8l6rmmhlE+Q097JNTUxFQ9vdpvIyJtIwL5SWqrdD4M=");
        json.put("PASSWD", "46f94c8de14fb36680850768ff1b7f2a");
        Map map = new HashMap();
        map.put("RequestParam", "{\"CLIENTRANDOM\":\"1497252446\",\"CLIENTID\":\"29e574fd-b0ef-486f-b46f-d1c358d86741\",\"SECRET\":\"t8l6rmmhlE+Q097JNTUxFQ9vdpvIyJtIwL5SWqrdD4M=\",\"LOGON_NAME\":\"zhoul_test\",\"UID\":\"89009322-e90a-41f6-88ce-bd86157adcad\",\"SID\":\"3135872F5318A2B14FD78B689938863B\"}");
        System.out.println(json.toString());

        String ret = null;
        try {
            ret = httpCallService.httpPost(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ret.toString());
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
}
