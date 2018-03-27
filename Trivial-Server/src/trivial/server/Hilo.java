package trivial.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Hilo extends Thread{
    
    Socket newSocket;
    boolean running = true;
    
    public Hilo(Socket a){
        this.newSocket = a;
    }
    
    public void run(){
        try{
        DataInputStream entrada = new DataInputStream(newSocket.getInputStream());
        DataOutputStream a = new DataOutputStream(newSocket.getOutputStream());
        String name = entrada.readUTF();
        this.setName(name);
        System.out.println(this.getName() + " se conectado");
            while(running){
                String mensaje = null;

                String text = entrada.readUTF();
                System.out.println(text);
                switch(text){
                    case "0": //Ciencias
                        mensaje = MysqlData.getPregunta("Ciencias").get(getrandom(MysqlData.getPregunta("Ciencias").size())).toJson();
                        break;
                    case "1": //Historia
                        mensaje = MysqlData.getPregunta("Historia").get(getrandom(MysqlData.getPregunta("Historia").size())).toJson();
                        break;
                    case "2": //Cultura
                        mensaje = MysqlData.getPregunta("Cultura").get(getrandom(MysqlData.getPregunta("Cultura").size())).toJson();
                        break;
                    case "3": //Deporte
                        mensaje = MysqlData.getPregunta("Deportes").get(getrandom(MysqlData.getPregunta("Deportes").size())).toJson();
                        break;
                }  
                System.out.println("asdf" + mensaje);
                a.writeUTF(mensaje);

            }

        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public static int getrandom(int num){
        return (int) (Math.random() * num);
    }
}

