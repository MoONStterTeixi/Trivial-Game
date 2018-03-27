package trivial.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TrivialServer {

    public static void main(String[] args) throws IOException {
        try{
            MysqlData.open();
        }catch(Exception e){
            System.out.println("SOY GILIPOLLAS!");
        }
        Socket newSocket = null;
        InetSocketAddress addr = new InetSocketAddress("localhost", 5555); 
        ServerSocket serverSocket = new ServerSocket(5555);
        int usernum = 0;
        while (true) {
            try{
            newSocket = serverSocket.accept();
            Hilo a = new Hilo(newSocket);
            a.setName("Usuario"+usernum);
            a.start();
            usernum++;
            }catch(Exception e){
                
            }
        }
    }
}