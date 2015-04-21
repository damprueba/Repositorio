/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import fecha.Fecha;

/**
 *
 * @author dani
 */
public class Correo {
    private String asunto;
    private String texto;
    private int codigoEmisor;//quien ha enviado el correo
    private Fecha fecha;
    
    private String prueba;
    
    public Correo(){
        
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getCodigoEmisor() {
        return codigoEmisor;
    }

    public void setCodigoEmisor(int codigoEmisor) {
        this.codigoEmisor = codigoEmisor;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
    
}
