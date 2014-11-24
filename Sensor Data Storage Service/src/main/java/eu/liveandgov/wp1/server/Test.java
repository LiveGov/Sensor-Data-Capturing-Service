package eu.liveandgov.wp1.server;

import java.io.*;
import java.util.zip.GZIPInputStream;

/**
 * Created by hartmann on 10/30/14.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File outFile = new File("/home/hartmann/test_not_working.csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(outFile)), "UTF8"));
        String line = "";
        int i = 0;
        while((line = reader.readLine()) != null){
            if(i++ > 10) break;
            System.out.println(line);
        }
    }
}
