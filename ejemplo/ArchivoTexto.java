import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class ArchivoTexto {

    private ListaClientes lista;
    private Cliente cliente;

    public ArchivoTexto(){
        this.lista = new ListaClientes();
    }

    public void leerArchivo(){
        String SEPARADOR = ",";
        BufferedReader bufferLectura = null;
        File archivo = new File ("clientes_banco.txt");
            try {
                bufferLectura = new BufferedReader(new FileReader(archivo));
                String linea = bufferLectura.readLine();
                Cuenta cuenta;
                while (linea != null) {
                    String[] datos = linea.split(SEPARADOR);
                    cuenta = new Cuenta(datos[2], datos[3]);
                    cliente = new Cliente(datos[0], datos[1],cuenta);
                    lista.agregarCliente(cliente);
                    linea = bufferLectura.readLine();
                }
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if (bufferLectura != null) {
                    try {
                        bufferLectura.close();
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void insertarEnArchivo(Cliente cliente) throws Exception{
            ValidarCliente validarCliente = new ValidarCliente();
            if(validarCliente.validarDatos(cliente)){
                try {
                    int indice = cliente.indiceCuenta() - 1;
                    String contenido = cliente.getNoCliente()+","+cliente.getNombre()+","+cliente.getCuentas().get(indice).getNoCuenta()+","+cliente.getCuentas().get(indice).getSaldo();
                    BufferedWriter objetoWrite = new BufferedWriter(new FileWriter("clientes_banco.txt",true));
                    objetoWrite.write(contenido);
                    objetoWrite.append('\n');
                    objetoWrite.close();
                    lista.agregarCliente(cliente);
                } catch (Exception e) {
                    e.printStackTrace();
                } 
            }
        }

        public void eliminarFila(String cadena) throws IOException{
            Path path = Paths.get("clientes_banco.txt");
            List<String> lineas = Files.readAllLines(path);
            lineas = lineas.stream()
                        .filter(linea->!linea.contains(cadena))
                        .collect(Collectors.toList());
                        Files.write(path,lineas);
            }
        

    }
