import java.util.ArrayList;

public class ListaClientes {
    
    ArrayList<Cliente> clientes;

    public ListaClientes(){
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    
}
