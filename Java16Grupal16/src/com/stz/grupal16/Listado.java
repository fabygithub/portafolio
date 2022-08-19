package com.stz.grupal16;

import java.util.ArrayList;
import java.util.List;

/**
 * com.stz.grupal16
 *
 * @author Sergio Teran on 24-06-2022
 */
public class Listado {

    List<Usuario> lista = new ArrayList<>();

    public void agregarNuevo(Usuario e){
        lista.add(e);
    }

    public void analizarUsuario(){
        for (IAsesoria ia: lista) {
            ia.analizarUsuario();
            for (int i = 0; i < 80; i++) {
                System.out.print("=");
                if (i == 79) System.out.println("=");
            }
        }
    }
}
