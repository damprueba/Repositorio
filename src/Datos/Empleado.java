/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
public class Empleado {
    
    private int identificador;//codigo del empleado //en los arraylist, los empleados NO se identifican por la posicio nque ocupan
    private String login; //usuario
    private String pass; //contraseña
    private String nombre; //nombre del empleado
    private ArrayList <Correo> bentrada;
       
    private int tipoUsuario;//<0> para usuario <1> para administrador

    public Empleado() {
        bentrada = new ArrayList<>();
       
    }

    
    /**
     * Constructor del Empleado que recibe los datos
     * @param identificador identificador del empleado
     * @param login usuario 
     * @param pass contraseña
     * @param nombre nombre del empleado
     * @param tipoUsuario tipo de usuario <0> para usuario y <1> si es administrador
     */
    public Empleado(int identificador, String login, String pass, String nombre, int tipoUsuario) {
        this.identificador = identificador;
        this.login = login;
        this.pass = pass;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        bentrada=new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList <Correo> getBentrada() {
        return bentrada;
    }

    public void setBentrada(ArrayList <Correo> bentrada) {
        this.bentrada = bentrada;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    //Sobreescribimos el metodo toString
    @Override
    /**
     * si no pusiesemos este metodo,devuelve la direccion de memoria en la que esta almacenada
     * al ponerlo, nos devuelve el nombre del empleado
     */
    public String toString(){
        return nombre;
    }
    
    
    
}
