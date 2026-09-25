package data;

import entidades.Categoria;
import java.util.ArrayList;

public class CategoriaData {

    public ArrayList<Categoria> obtenerCategoria() {
        ArrayList<Categoria> lista = new ArrayList<>();
        lista.add(new Categoria("Electrónica"));
        lista.add(new Categoria("Ropa"));
        lista.add(new Categoria("Alimentos"));
        return lista;
    }

}
