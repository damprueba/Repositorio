/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Empresa {

    ArrayList<Empleado> misEmpleados; //definimos misEmpleados del tipo Empleado

    public Empresa() {
        misEmpleados = new ArrayList<>();//creamos el conjunto de los empleados
        Empleado e = new Empleado(1, "maria", "pardo", "Maria Pardo", 1);
        misEmpleados.add(e);//añade el empleado "e"
        // misEmpleados.add(6,e); //añade el empleado "e" en la posicion 6

    }

    /**
     * Metodo para devolver todos los empleados
     * @return misEmpleados
     */
    public ArrayList<Empleado> getMisEmpleados() {
        return misEmpleados;
    }

    /**
     * Metodo de busqueda de un empleado
     * @param login usuario
     * @param contra contraseña
     * @return pos
     */
    public int buscarEmpleado(String login, String contra) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < misEmpleados.size()) {
            if (misEmpleados.get(pos).getLogin().equalsIgnoreCase(login)
                    && misEmpleados.get(pos).getPass().equals(contra)) {
                encontrado = true;
            } else {
                pos++;
            }
        }

        if (!encontrado) {
            pos = -1;
        }
        return pos;
    }

    /**
     * Metodo de busqueda del login de un empleado
     * @param login usuario
     * @return pos
     */
    public int buscarEmpleadoLogin(String login) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < misEmpleados.size()) {
            if (misEmpleados.get(pos).getLogin().equalsIgnoreCase(login)) {
                encontrado = true;
            } else {
                pos++;
            }
        }

        if (!encontrado) {
            pos = -1;
        }
        return pos;
    }

    /**
     * Metodo de busqueda del identificador del usuario
     * @param identificador identificador del usuario
     * @return pos
     */
    public int buscarEmpleadoIdentificador(int identificador) {
        int pos = 0;
        boolean encontrado = false;

        while (!encontrado && pos < misEmpleados.size()) {
            if (misEmpleados.get(pos).getIdentificador() == identificador) {
                encontrado = true;
            } else {
                pos++;
            }
        }

        if (!encontrado) {
            pos = -1;
        }
        return pos;
    }

    /**
     * Metodo para añadir un empleado
     * @param e le pasamos el empleado
     */
    public void anadirEmpleado(Empleado e) {
        misEmpleados.add(e);
    }
    
    /**
     * Metodo para eliminar un empleado
     * @param e le pasamos el empleado
     * @return <true> si le ha encontrado , <false> si no le ha encontrado
     */
    public boolean eliminarEmpleado(Empleado e){
        boolean resultado;
        int pos=buscarEmpleadoIdentificador(e.getIdentificador());
        if(pos!=-1){
            misEmpleados.remove(pos);
            resultado=true;
        }else{
            resultado=false;
        }
        
        return true;
    }

}
