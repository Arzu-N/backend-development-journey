package com.example.education_client.Restclient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.Collections;
import java.util.List;

public class EducationRestClient {
    private static final  ObjectMapper MAPPER = new ObjectMapper();
    public static List<CommonResponse.StudentResponse> getstudents() {
        try {
            CloseableHttpClient client = HttpClients.createDefault();
            HttpGet request = new HttpGet("http://localhost:9091/education/students");
            CloseableHttpResponse response = client.execute(request);
            String responsebody = EntityUtils.toString(response.getEntity());

            MAPPER.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
            CommonResponse common = MAPPER.readValue(responsebody, CommonResponse.class);
            return common.getObj();
        } catch (Exception ex) {
            ex.printStackTrace();
            return Collections.emptyList();
        }

    }
}

