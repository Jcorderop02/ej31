package dominio;

public class Localidad{
    private String nombre;
    private int numeroDeHabitantes;

    /**
     * Devuelve la informacion del nombre de la localidad
     *
     * @return nombre de la localidad
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Cambia el nombre de la localidad
     *
     * @param nombre nuevo nobre de la localidad
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumeroDeHabitantes(){
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes){
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    public String toString(){
        return "Nombre: " + nombre + "\nNumero de habitantes: " + numeroDeHabitantes;
    }
}
