package com.stz.grupal16;

/**
 * com.stz.grupal16
 *
 * @author Sergio Teran on 24-06-2022
 */
public class Administrativo extends Usuario{

    private String area;
    private int experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String nombre, String fechaNacimiento, int run, String area, int experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getArea() {
        return area;
    }

    public int getExperienciaPrevia() {
        return experienciaPrevia;
    }

    @Override
    public void analizarUsuario(){
        super.analizarUsuario();
        System.out.println("Area: " +
                 getArea() + ", años de experiencia previa: " + experienciaPrevia);
    }

}