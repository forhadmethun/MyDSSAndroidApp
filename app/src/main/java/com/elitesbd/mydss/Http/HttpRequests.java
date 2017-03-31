package com.elitesbd.mydss.Http;

import android.content.ContentValues;
import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class HttpRequests {

    public HttpRequests() {

    }

    public static HttpResponse sendHttpGetRequest(String urlString, ContentValues params) {

        HttpResponse response = null;
        if (params != null && params.size() > 0) {
            ArrayList<String> nameValueList = new ArrayList<>();
            for (String key : params.keySet()) {
                nameValueList.add(key + "=" + params.get(key));
            }

            if(urlString.endsWith("?")){
                urlString += TextUtils.join("&", nameValueList);
            } else{
                urlString += "?" + TextUtils.join("&", nameValueList);
            }
        }

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(METHODS.GET);

            // add request headers
            // connection.setRequestProperty("","");
            // connection.setRequestProperty("USER-AGENT", "Mozilla/5.0");
            connection.setRequestProperty("Content-Type", "text/plain");
            connection.setRequestProperty("charset", "utf-8");

            // start the connection
            connection.connect();

            // fetch HttpResponseCode
            int responseCode = connection.getResponseCode();


            // fetch HttResponseBody
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            StringBuffer resposeBody = new StringBuffer();
            String inputLine = null;
            while ((inputLine = inputReader.readLine()) != null) {
                resposeBody.append(inputLine);
            }
            inputReader.close();

            // set the response
            response = new HttpResponse();
            response.setResponseCode(responseCode);
            response.setResponseBody(resposeBody.toString());

            // close the connection
            if (connection != null) {
                connection.disconnect();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }

    private class METHODS {
        static final String GET = "GET";
        static final String POST = "POST";

    }


    //http://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
    //http://stackoverflow.com/questions/29294479/android-deprecated-apache-module-httpclient-httpresponse-etc
    //http://stackoverflow.com/questions/8654876/http-get-using-android-httpurlconnection
    //http://stackoverflow.com/questions/4205980/java-sending-http-parameters-via-post-method-easily

}
