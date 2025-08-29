package com.acme;

public record PersonaRegistro(String nombre, String apellido) {

    @Override
    public String toString() {
        // Guillermo comenté la línea que considero se puede eliminar.
        // System.out.println("Esta instucción es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
