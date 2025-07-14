package http_server;

import java.net.http.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

//http://localhost:host number

public class server {
    
    public static void main(String[] args) throws IOException {
        final ServerSocket server = new ServerSocket(80); 

        while(true){

            Socket socket = server.accept();
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                OutputStream o = socket.getOutputStream();
                o.write(httpResponse.getBytes("UTF-8"));
                // o.close();
                // o.write(01); //this makes you downlaod the website . no clue why though
                // o.flush();
                
            

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String requestLine = in.readLine();
            if (requestLine != null && requestLine.startsWith("GET")) {
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html");
                out.println("");
                out.println("<html><body><h1>Hello from Java Server!</h1></body></html>");
                String y = in.readLine();
                if(in.ready()){ //if the buffered reader is in the "ready state" (whatever that means) then the following occurs.
                    out.println("you win the prize!");
                    out.println("fiona fung is gonna die.");
                }
            } else {
                out.println("HTTP/1.1 404 Not Found");
                out.println("Content-Type: text/plain");
                out.println("");
                out.println("404 Not Found");
            }

            socket.close();

            // final Socket client = server.accept();
            // InputStreamReader isr = new InputStreamReader(client.getInputStream());
            // BufferedReader reader = new BufferedReader(isr);
            // String line = reader.readLine();            
            // while (!line.isEmpty()) {
            //     System.out.println(line);
            //     line = reader.readLine();
            // }
            // was to manually keep the server on without actually producing anything out of it.
                
        }

    }
}