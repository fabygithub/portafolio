package com.stz.grupal16;

/**
 * com.stz.grupal16
 *
 * @author Sergio Teran on 24-06-2022
 */
public class Profesional extends Usuario{

    private String titulo;
    private String fechaDeIngreso;

    public Profesional(){
    };

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaDeIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    @Override
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Título: " +
                getTitulo() + ", fecha de ingreso: " + getFechaDeIngreso());
    }
}
