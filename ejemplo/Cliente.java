import java.util.ArrayList;

public class Cliente {
    String noCliente;
    String nombre;
    ArrayList<Cuenta> cuentas;

    public Cliente(String noCliente, String nombre, Cuenta cuenta) {
        this.noCliente = noCliente;
        this.nombre = nombre;
        cuentas = new ArrayList<>();
        cuentas.add(cuenta);
    }
    
    public String getNoCliente() {
        return noCliente;
    }

    public int indiceCuenta(){
        return cuentas.size();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }


    public void setCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }


    public void imprimirCuentas(){
       for(int i = 0;i < cuentas.size();i++){
        System.out.println(" No. de cuenta: "+cuentas.get(i).getNoCuenta()+" Saldo: "+cuentas.get(i).getSaldo());
       }
    }




    
}

