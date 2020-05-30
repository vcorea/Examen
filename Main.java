public class Main(){

    public static void main(String[] args) {
        String nombre;
        String correo;
        String telefono;
        int edad;
        String genero;

        nombre = "Victor";
        correo = "Correo@mail.com";
        telefono = "123456789";
        edad = 29;
        genero = "Masculino";
        Usuario user = new Usuario(nombre,correo,telefono,edad,genero);
    }
}
