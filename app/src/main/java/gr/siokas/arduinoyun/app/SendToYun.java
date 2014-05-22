package gr.siokas.arduinoyun.app;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by apostolossiokas on 5/22/14.
 */
public class SendToYun implements Runnable{

    public interface InputFromYun {
        void OnYunReply(SendToYun sendToYun, String response,
                            String errorMsg);
    }

    String server = "";
    InputFromYun inputFromYun;

    public SendToYun(String server, InputFromYun inputFromYun){
        this.server = server;
        this.inputFromYun = inputFromYun;
    }

    public void connect(){
        Thread t = new Thread(this);
        t.start();
    }

    public void run(){
        try {
            HttpClient client = new DefaultHttpClient();
            HttpPost request = new HttpPost(server);
            List<NameValuePair> postParameters = new ArrayList<NameValuePair>();
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(
                    postParameters);
            request.setEntity(formEntity);
            HttpResponse response = client.execute(request);
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));
            String x = br.readLine();
            inputFromYun.OnYunReply(this, x, "no");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
