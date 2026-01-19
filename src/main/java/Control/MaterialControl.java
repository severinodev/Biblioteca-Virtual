package Control;

import Biblioteca.Material;
import java.util.ArrayList;

public class MaterialControl {
    private ArrayList<Material> listaMateriales = new ArrayList<>();

    public void agregarMaterial(Material m) {
        listaMateriales.add(m);
    }

    public ArrayList<Material> obtenerMateriales() {
        return listaMateriales;
    }

    public void eliminarMaterial(int index) {
        if (index >= 0 && index < listaMateriales.size()) {
            listaMateriales.remove(index);
        }
    }

    public void modificarMaterial(int index, Material nuevo) {
        if (index >= 0 && index < listaMateriales.size()) {
            listaMateriales.set(index, nuevo);
        }
    }
    
    public boolean modificarTituloPorId(String id, String nuevoTitulo) {
    for (Material m : listaMateriales) {
        if (m.getId().equalsIgnoreCase(id)) {
            m.setTitulo(nuevoTitulo);
            return true;
        }
    }
    return false;
   }
}