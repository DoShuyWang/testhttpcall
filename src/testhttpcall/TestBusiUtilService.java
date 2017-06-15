package testhttpcall;

import httpcall.HttpCallService;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by doshuy on 06/07/2017.
 */
public class TestBusiUtilService {

    @Test
    public void checkAcctUsed() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "CHECK_ACCT_USED");
        json.put("LOGON_NAME", "test");
        Map map = new HashMap();
        map.put("RequestParam", json.toString());
        System.out.println(json.toString());

        String ret = null;
        try {
            ret = httpCallService.httpPost(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ret.toString());
    }
}
