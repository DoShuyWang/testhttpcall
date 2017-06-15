package testhttpcall;

import httpcall.HttpCallService;
import net.sf.json.JSONObject;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by doshuy on 05/22/2017.
 */
public class TestHttpCall {

    @Test
    public void orgAdd() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ORG_ADD");
        json.put("SP_DEPT_ID", "0000003");
        json.put("DEPT_NAME", "IPS测试_测试二个");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_DEPT_ID", "");
        json.put("SP_PARENT_DEPT_CODE", "");
        json.put("COMP_ID", "");
        json.put("COMP_CODE", "");
        json.put("DEPT_CODE", "00000000");
        json.put("DEPT_DESC", "1");
        json.put("DEPT_TYPE_ID", "2");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "5");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void orgAddSon() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ORG_ADD");
        json.put("SP_DEPT_ID", "SP_DEPT_ID_SON1");
        json.put("DEPT_NAME", "DEPT_NAME");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_DEPT_ID", "SP_DEPT_ID");
        json.put("SP_PARENT_DEPT_CODE", "SP_DEPT_ID");
        json.put("COMP_ID", "");
        json.put("COMP_CODE", "");
        json.put("DEPT_CODE", "DEPT_CODE");
        json.put("DEPT_DESC", "1");
        json.put("DEPT_TYPE_ID", "2");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "5");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void orgEdit() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ORG_EDIT");
        json.put("SP_DEPT_ID", "测试兼职的机构");
        json.put("DEPT_NAME", "测试兼职的机构123");
        json.put("UPDATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_ODEPT_ID", "");
        json.put("DEPT_CODE", "测试兼职的机构");
        json.put("DEPT_DESC", "2");
        json.put("DEPT_TYPE_ID", "1");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "6");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void orgDel() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ORG_DEL");
        json.put("SP_DEPT_ID", "SP_ORG_ID");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void groupAdd() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "GROUP_ADD");
        json.put("SP_DEPT_ID", "411");
        json.put("POST_TITLE", "测试岗位");
        json.put("SP_POST_ID", "GROUP000001111");
        json.put("POST_DESC", "POST_DESC");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("CREATED_DT", "");

        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void groupAdd2() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "GROUP_ADD");
        json.put("SP_DEPT_ID", "测试兼职的机构");
        json.put("POST_TITLE", "测试兼职的岗位");
        json.put("SP_POST_ID", "测试兼职的岗位");
        json.put("POST_DESC", "测试兼职的岗位");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("CREATED_DT", "");

        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }


    @Test
    public void acctAdd() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_ADD");
        json.put("SP_DEPT_ID", "SP_DEPT_ID_SON1");
        json.put("SP_STAFF_ID", "测试一下帐户兼职");
        json.put("SP_POST_ID", "SP_POST_ID");
        json.put("STAFF_NAME", "测试一下帐户兼职");
        json.put("LOGON_NAME", "测试一下帐户兼职");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("CONT_EMAIL", "1@1.com");
        json.put("OFFICE_PHONE", "110");
        json.put("CONT_PHONE", "110");
        json.put("BIRTHDAY", "2017-5-23 15:12:23");
        json.put("SEX", "1");
        json.put("ORDER_ID", "1");
        json.put("STAFF_TYPE", "1");
        json.put("STAFF_NATURE", "1");
        json.put("SEC_LEVEL", "1");
        json.put("MANAGER_ID", "1");
        json.put("OUTSIDE_TYPE", "1");
        json.put("CONTACT_ID", "1");
        json.put("ADDRESS", "ADDRESS");
        json.put("ZIPCODE", "100000");
        json.put("EFF_DT", "2017-5-23 00:17:25");
        json.put("EXP_DT", "2117-5-23 00:17:25");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void acctEdit() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_EDIT");
        json.put("SP_DEPT_ID", "SP_ORG_ID");
        json.put("SP_STAFF_ID", "SP_STAFF_ID_1113");
        json.put("SP_POST_ID", "SP_POST_ID");
        json.put("STAFF_NAME", "就想试试能不能改成功。");
        json.put("LOGON_NAME", "nameyigezhanghu11113");
        json.put("CONT_EMAIL", "1@1.com");
        json.put("OFFICE_PHONE", "110");
        json.put("CONT_PHONE", "110");
        json.put("BIRTHDAY", "2017-5-23 15:12:23");
        json.put("SEX", "1");
        json.put("ORDER_ID", "1");
        json.put("STAFF_TYPE", "1");
        json.put("STAFF_NATURE", "1");
        json.put("SEC_LEVEL", "1");
        json.put("MANAGER_ID", "1");
        json.put("OUTSIDE_TYPE", "1");
        json.put("CONTACT_ID", "1");
        json.put("ADDRESS", "ADDRESS");
        json.put("ZIPCODE", "100000");
        json.put("EFF_DT", "2017-5-23 00:17:25");
        json.put("EXP_DT", "2117-5-23 00:17:25");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }


    @Test
    public void acctDel() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_DEL");
        json.put("SP_STAFF_ID", "SP_STAFF_ID_1113");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void acctPartTimeAdd() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_PART_TIME_ADD");
        json.put("SP_STAFF_ID", "测试一下帐户兼职");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_DEPT_ID", "测试兼职的机构");
        json.put("SP_POST_ID", "测试兼职的岗位");
        json.put("SEC_LEVEL", "1");
        json.put("MANAGER_ID", "1");
        json.put("DEPT_NAME", "测试兼职的机构123");
        json.put("UPDATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_ODEPT_ID", "");
        json.put("DEPT_CODE", "测试兼职的机构");
        json.put("DEPT_DESC", "2");
        json.put("DEPT_TYPE_ID", "1");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "6");
        json.put("EFF_DT", "2017-5-23 00:17:25");
        json.put("EXP_DT", "2117-5-23 00:17:25");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void acctPartTimeEdit() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_PART_TIME_EDIT");
        json.put("SP_STAFF_ID", "测试一下帐户兼职");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_DEPT_ID", "测试兼职的机构");
        json.put("SP_POST_ID", "测试兼职的岗位");
        json.put("SEC_LEVEL", "1");
        json.put("MANAGER_ID", "1");
        json.put("DEPT_NAME", "测试兼职的机构123");
        json.put("UPDATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_ODEPT_ID", "");
        json.put("DEPT_CODE", "测试兼职的机构");
        json.put("DEPT_DESC", "2");
        json.put("DEPT_TYPE_ID", "1");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "6");
        json.put("EFF_DT", "2017-5-23 00:17:25");
        json.put("EXP_DT", "2117-5-25 11:49:23");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }

    @Test
    public void del() throws Exception {
        HttpCallService httpCallService = new HttpCallService();
        JSONObject json = new JSONObject();
        json.put("BUSI_CODE", "ACCT_PART_TIME_EDIT");
        json.put("SP_STAFF_ID", "测试一下帐户兼职");
        json.put("CREATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_DEPT_ID", "测试兼职的机构");
        json.put("SP_POST_ID", "测试兼职的岗位");
        json.put("SEC_LEVEL", "1");
        json.put("MANAGER_ID", "1");
        json.put("DEPT_NAME", "测试兼职的机构123");
        json.put("UPDATED_STAFF_ID", "SP_ORG_ID");
        json.put("SP_PARENT_ODEPT_ID", "");
        json.put("DEPT_CODE", "测试兼职的机构");
        json.put("DEPT_DESC", "2");
        json.put("DEPT_TYPE_ID", "1");
        json.put("DEPT_TYPE", "3");
        json.put("ORDER_ID", "4");
        json.put("DEPT_LEVEL", "6");
        json.put("EFF_DT", "2017-5-23 00:17:25");
        json.put("EXP_DT", "2117-5-25 11:49:23");
        Map map = new HashMap();
        map.put("requestParam", json.toString());
        String ret = httpCallService.httpPost(map);
        System.out.println(ret.toString());
    }


    @Test
    public void getBase() {
        String clientUserName = "6777b1df-e5ce-43b0-8cd7-b2acf7ede08a";
        String clientPassword = "UJxCosnw6glKtyeEy0I6yTlFje9olo7uKDxu+6O2Hcg=";
        String auth = clientUserName + ":" + clientPassword;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        System.out.println(authHeader);
    }

}
