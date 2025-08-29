package com.acme;

public class HolaMundo {
    public static void main(String[] args) {

        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Escribe tu nombre: ");
        String apellidos = msj.solicitaDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre, apellidos);
        msj.saludar(p1);

    }


}
