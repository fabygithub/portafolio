package com.stz.grupal16;

/**
 * com.stz
 *
 * @author Sergio Teran on 22-06-2022
 */
public class Usuario implements IAsesoria{

    private String nombre;
    private String fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }

    public String mostrarEdad(){
        int edad = (int) (Math.random() * 82 + 18);
        return "El usuario tiene " + edad + " años";
    }

    @Override
    public void analizarUsuario() {
        System.out.println("El nombre del usuario es " + getNombre());
    }
}

