public class Usuario{
    private String nombre;
    private String correo;
    private String telefono;
    private int edad;
    private String genero;

    
    public Usuario(String nombre, String correo, String telefono, int edad, String genero){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.genero = genero;
    }


    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return String return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return String return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


    public String toString(){
        String mensaje = "";
        return mensaje += "Nombre: " + this.getNombre + "\n" +
                          "Correo: " + this.getCorreo + "\n" +
                          "Telefono: " this.getTelefono + "\n"+


    }

}
