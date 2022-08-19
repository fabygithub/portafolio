package com.stz.grupal16;

public class Main {

    public static void main(String[] args) {

        Listado listado = new Listado();

        Profesional p1 = new Profesional("Marcia", "25-05-95", 10718334, "Profesora", "18-08-2018");
        Administrativo a1 = new Administrativo("Claudia", "15-08-77", 15454587, "Ventas", 10);
        Usuario u1 = new Usuario("Paula", "23-07-88", 16252785);
        Cliente c1 = new Cliente("Camila", "21-06-96", 19176552, "+56985245555", "Prat 888", 26);
        Administrativo a2 = new Administrativo("Toribio", "30-01-80", 14555444, "Logistica", 6);

        listado.agregarNuevo(p1);
        listado.agregarNuevo(a1);
        listado.agregarNuevo(u1);
        listado.agregarNuevo(c1);
        listado.agregarNuevo(a2);

        listado.analizarUsuario();

    }
}
