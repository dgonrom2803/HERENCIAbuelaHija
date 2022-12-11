public class Principal {
    public static void  main(String[]args){
        Abuela persona1 = new Abuela();
        System.out.println("El nombre de la abuela es " + persona1.nombre + " " + persona1.apellido1);
        System.out.println("Tiene " + persona1.edad + " años");

        Madre persona2 = new Madre();
        System.out.println("El nombre de la madre es " + persona2.nombre + " " + persona2.apellido1);
        System.out.println("Su estado civil es " + persona2.estadoCivil);

        Hija persona3 = new Hija();
        System.out.println("El nombre de la hija es " + persona3.nombre + " " + persona3.apellido1 + " " + persona3.apellido2 + ". Tiene " + persona3.edad + " años. Su estado civil es " + persona3.estadoCivil);
    }
}
