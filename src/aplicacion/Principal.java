package aplicacion;

import dominio.*;

public class Principal{
    public static void main(String[] args){
        Localidad madrid = new Localidad();
        madrid.setNombre("Madrid");
        madrid.setNumeroDeHabitantes(3500000);

        Persona juan = new Persona();
        juan.setNombre("Juan");
        juan.setLugarDeNacimiento(madrid);

        System.out.println(juan);
    }
}
