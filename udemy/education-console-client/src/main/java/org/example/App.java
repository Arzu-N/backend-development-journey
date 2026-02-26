package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class App
{
    public static void main( String[] args )
    {
       try {
           CloseableHttpClient client = HttpClients.createDefault();
           HttpGet request = new HttpGet("http://localhost:9091/education/students");
           CloseableHttpResponse response = client.execute(request);
           String responsebody = EntityUtils.toString(response.getEntity());
           ObjectMapper mapper = new ObjectMapper();
           mapper.registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule());
           CommonResponse common = mapper.readValue(responsebody, CommonResponse.class);
           for (StudentResponse obj : common.getObj()) {
               System.out.println(obj.getEmail());
           }
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    }

        }