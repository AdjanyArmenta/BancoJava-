public class ValidarCliente {

    public boolean validarNoCuenta(String noCuenta){
        boolean validado = false;
        if(noCuenta.matches("[0-9]{16}")){
            validado = true;
        }
        if(!validado){
            System.out.println("El numero de cuenta " +noCuenta+ " no es valido");
        }
        
        return validado;
    }

    public boolean validarNombre(String nombre) throws Exception{
        boolean validado = false;
        if(nombre.matches("[a-zA-Z]{2,9}")){
            validado = true;
        }
        if(!validado){
            throw new Exception("El nombre" + nombre+ " no pudo ser validado");
        }
        return validado;
    }

 
    public boolean validarNoCliente(String noCliente){
        boolean validado = false;
        if(noCliente.matches("[0-9]{16,16}")){
            validado = true;
        }
        if(!validado){
            System.out.println("El numero de cliente " +noCliente+ " no es valido ");

        }
        return validado;
    }

    public boolean validarDatos(Cliente cliente) throws Exception{
        boolean validado = false;

       if(validarNoCliente(cliente.getNoCliente()) && validarNombre(cliente.getNombre()) && validarNoCuenta(cliente.getCuentas().get(0).getNoCuenta())){
            validado = true;
       }
        return validado;
    }
   
    
}
