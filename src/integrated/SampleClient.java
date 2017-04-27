/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrated;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author semargl
 */
public class SampleClient {
    public static void main(String[] args) {
 
        String host = "localhost";
        int port = 1234;
        
        try{
            Socket socket = new Socket(host, port);
            DataInputStream is = new DataInputStream(socket.getInputStream());
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
                        
            int i = 12345;
            os.writeInt(i);
            System.out.println("Sending int: "+i);
            int ires = is.readInt();
            if(ires != i) error();
            
            double d = 123.2345;
            os.writeDouble(d);
            System.out.println("Sending double: "+d);
            double dres = is.readDouble();
            if(d != dres) error();
            
            
        }
        catch(IOException ioe){
            System.out.println("Client IO Exception: "+ioe.getMessage());
            System.exit(-2);            
        }
        
        System.out.println("Client finished processing. Exiting..");

    }

    private static void error() {
        System.err.println("Client error");
        System.exit(-3);
    }
    
}
