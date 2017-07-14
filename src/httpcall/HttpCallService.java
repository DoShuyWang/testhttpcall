package httpcall;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.Consts;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HttpCallService {

    private String url = "http://127.0.0.1:8082/isso/rest/oauth/imlogon";
    private String clientUserName = "6777b1df-e5ce-43b0-8cd7-b2acf7ede08a";
    private String clientPassword = "UJxCosnw6glKtyeEy0I6yTlFje9olo7uKDxu+6O2Hcg=";
    private int connectionRequestTimeout = 9999;
    private int connectTimeout = 9999;
    private int socketTimeout = 9999;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public void setConnectionRequestTimeout(int connectionRequestTimeout) {
        this.connectionRequestTimeout = connectionRequestTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }

    public HttpCallService() {
    }

    public String httpGet(String url) throws Exception {
        HttpGet httpGet = null;
        InputStreamReader is = null;
        BufferedReader br = null;

        StringBuilder result = new StringBuilder();
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();

            httpGet = new HttpGet(url);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(socketTimeout)
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectionRequestTimeout)
                    .build();//设置请求和传输超时时间
            httpGet.setConfig(requestConfig);

            //生成验证信息
            String auth = clientUserName + ":" + clientPassword;
            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic " + new String(encodedAuth);
            httpGet.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

            CloseableHttpResponse response = httpclient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() != 200) {
                throw new Exception("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            is = new InputStreamReader((response.getEntity().getContent()), "UTF-8");
            br = new BufferedReader(is);

            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        } finally {
            if (null != br) {
                br.close();
            }
            if (null != is) {
                is.close();
            }
            if (null != httpGet) {
                httpGet.releaseConnection();
            }
        }
        return result.toString();
    }

    public String httpPost(Map paramMap) throws Exception {
        HttpPost httpPost = null;
        InputStreamReader is = null;
        BufferedReader br = null;

        StringBuilder result = new StringBuilder();
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();

            List<NameValuePair> params = new ArrayList<NameValuePair>();
            if ((null != paramMap) && (0 < paramMap.size())) {
                Set<Map.Entry<String, String>> entrySet = paramMap.entrySet();
                for (Map.Entry<String, String> e : entrySet) {
                    String name = e.getKey();
                    String value = e.getValue();
                    NameValuePair pair = new BasicNameValuePair(name, value);
                    params.add(pair);
                }
            }

            httpPost = new HttpPost(url);
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(socketTimeout)
                    .setConnectTimeout(connectTimeout)
                    .setConnectionRequestTimeout(connectionRequestTimeout)
                    .build();//设置请求和传输超时时间
            httpPost.setConfig(requestConfig);

            //生成验证信息
            String auth = clientUserName + ":" + clientPassword;
            byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = "Basic Njc3N2IxZGYtZTVjZS00M2IwLThjZDctYjJhY2Y3ZWRlMDhhOlVKeENvc253NmdsS3R5ZUV5MEk2eVRsRmplOW9sbzd1S0R4dSs2TzJIY2c9";
            //httpPost.setHeader(HttpHeaders.AUTHORIZATION, authHeader);

            httpPost.setEntity(new UrlEncodedFormEntity(params, Consts.UTF_8));
            CloseableHttpResponse response = httpclient.execute(httpPost);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new Exception("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
            }

            is = new InputStreamReader((response.getEntity().getContent()), "UTF-8");
            br = new BufferedReader(is);

            String line;
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        } finally {
            if (null != br) {
                br.close();
            }
            if (null != is) {
                is.close();
            }
            if (null != httpPost) {
                httpPost.releaseConnection();
            }
        }
        return result.toString();
    }

}
