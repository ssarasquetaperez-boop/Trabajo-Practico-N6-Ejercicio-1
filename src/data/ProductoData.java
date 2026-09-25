package data;

import entidades.Producto;
import java.util.ArrayList;

public class ProductoData {

    private final ArrayList<Producto> lista = new ArrayList<>();

    public void guardarProducto(Producto p) {
        lista.add(p);
    }
    
    public ArrayList<Producto> obtenerProductos(){
        return lista;
    }
}
