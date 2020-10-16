package dominio;

import dominio.*;

public class Persona{
    private String nombre;
    private Localidad lugarDeNacimiento;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Localidad getLugarDeNacimiento(){
        return lugarDeNacimiento;
    }

    public void setLugarDeNacimiento(Localidad lugarDeNacimiento){
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nLugar de nacimiento: " + lugarDeNacimiento;
    }
}
