package trivial.server;

import com.google.gson.Gson;
import javax.xml.bind.Marshaller;

public class Pregunta {
    private String Categoria;
    private String Pregunta;
    private String Resp_Ok;
    private String Resp_Ko1;
    private String Resp_Ko2;
    private String Resp_Ko3;

    public Pregunta(String Categoria, String Pregunta, String Resp_Ok, String Resp_Ko1, String Resp_Ko2, String Resp_Ko3) {
        this.Categoria = Categoria;
        this.Pregunta = Pregunta;
        this.Resp_Ok = Resp_Ok;
        this.Resp_Ko1 = Resp_Ko1;
        this.Resp_Ko2 = Resp_Ko2;
        this.Resp_Ko3 = Resp_Ko3;
    }
    public Pregunta(){
        
    }

    public String getCategoria() {
        return Categoria;
    }
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public String getPregunta() {
        return Pregunta;
    }
    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }
    public String getResp_Ok() {
        return Resp_Ok;
    }
    public void setResp_Ok(String Resp_Ok) {
        this.Resp_Ok = Resp_Ok;
    }
    public String getResp_Ko1() {
        return Resp_Ko1;
    }
    public void setResp_Ko1(String Resp_Ko1) {
        this.Resp_Ko1 = Resp_Ko1;
    }
    public String getResp_Ko2() {
        return Resp_Ko2;
    }
    public void setResp_Ko2(String Resp_Ko2) {
        this.Resp_Ko2 = Resp_Ko2;
    }
    public String getResp_Ko3() {
        return Resp_Ko3;
    }
    public void setResp_Ko3(String Resp_Ko3) {
        this.Resp_Ko3 = Resp_Ko3;
    }

    public String toJson(){
        String Value = "";
        try{
            Gson gson = new Gson();
            Value = gson.toJson(this);
        }catch(Exception e){
            System.err.println("Error, parse Json!");
        }
        return Value;
    }
    
    public Pregunta toObj(String a){
        Gson gson = new Gson();
        Pregunta b = gson.fromJson(a, Pregunta.class);
        return b;
    }
    
    @Override
    public String toString(){
        
        String Value = "Categoria: " + Categoria + "\n" +
                       "Pregunta: " + Pregunta + "\n" + 
                       "Respuesta Correcta: " + Resp_Ok + "\n" + 
                       "Respuesta KO1: " + Resp_Ko1 + "\n" + 
                       "Respuesta KO2: " + Resp_Ko2 + "\n" + 
                       "Respuesta KO3: " + Resp_Ko3 + "\n";
        return Value;
    }
}
