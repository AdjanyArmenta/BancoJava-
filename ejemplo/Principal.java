public class Principal {   
    public static void main(String[] args) throws Exception {

        ArchivoTexto lista = new ArchivoTexto();
        Cuenta cuenta1 = new Cuenta("1298123716128349", "120");
        Cliente cliente = new Cliente("1234567892134561", "Eyli", cuenta1);
        lista.insertarEnArchivo(cliente);


        Cuenta cuenta2 = new Cuenta("1283491283412894", "300");
        Cliente cliente2 = new Cliente("1234215671827391", "Pedro",cuenta2);
        lista.insertarEnArchivo(cliente2);


        Cuenta cuenta3 = new Cuenta("1283491283482894", "500");
        Cliente cliente3 = new Cliente("3283491283482894", "Juanito", cuenta3);
        lista.insertarEnArchivo(cliente3);


        Cuenta cuenta4 = new Cuenta("1283491553482894", "800");
        cliente.setCuenta(cuenta4);
        lista.insertarEnArchivo(cliente);

        Cuenta cuenta5 = new Cuenta("4283491553482894", "1500");
        cliente.setCuenta(cuenta5);
        lista.insertarEnArchivo(cliente);

        

    }
    
}


