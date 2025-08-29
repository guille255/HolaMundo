package com.acme;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        System.out.println("Esta instucción es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
