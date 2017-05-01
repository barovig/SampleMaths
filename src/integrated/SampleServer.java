/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrated;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author semargl
 */
public class SampleServer {
    
    public static void main(String[] args) {
        
        int port = 1234;
        System.out.println("Starting server...");
        try{
            ServerSocket serverSock = new ServerSocket(port);
            Socket socket = serverSock.accept();
            DataInputStream is = new DataInputStream(socket.getInputStream());
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            
            int i = is.readInt();
            System.out.println("Received int: "+i);
            os.writeInt(i);
            double d = is.readInt();
            System.out.println("Received double: "+d);
            os.writeDouble(d);
            
            
        }
        catch(IOException ioe){
            System.out.println("Server IO Exception: "+ioe.getMessage());
            System.exit(-2);
        }
        System.out.println("Server finished processing. Exiting..");
    }
}
