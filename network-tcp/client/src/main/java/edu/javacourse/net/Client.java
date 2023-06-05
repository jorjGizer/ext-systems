package edu.javacourse.net;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        for (int i = 0; i < 8; i++) {
            SimpleClient sc = new SimpleClient(i);
            sc.start();
        }
    }
}
class SimpleClient extends Thread {
    private static final String[] COMMAND = {
            "HELLO", "MORNING", "DAY ","EVENING"};
    private int cmdNumber;
    public SimpleClient(int cmdNumber){
        this.cmdNumber =  cmdNumber;
    }
    @Override
    public void run() {
        try (Socket client = new Socket("127.0.0.1", 25225);
             BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))) {

            String command = COMMAND[cmdNumber % COMMAND.length];
            String sb = command + " Georgii";
            bw.write(sb);
            bw.newLine();
            bw.flush();
            String readLine = br.readLine();
            System.out.println("Client got string: " + readLine);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }

}
