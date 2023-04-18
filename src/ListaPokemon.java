import java.util.Arrays;

public class ListaPokemon {
    private Pokemon[] listaPokemon;
    private int tamaño;

    public ListaPokemon() {
        listaPokemon = new Pokemon[1];
        tamaño = 0;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (tamaño >= listaPokemon.length) {
            listaPokemon = Arrays.copyOf(listaPokemon, listaPokemon.length + 1);
        }
        listaPokemon[tamaño++] = pokemon;
        System.out.println("¡" + pokemon.getNombre() + " ha sido añadido a la lista de Pokemon!");
    }

    public void eliminarPokemon(String nombre) {
        for (int i = 0; i < tamaño; i++) {
            if (listaPokemon[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("¡" + listaPokemon[i].getNombre() + " ha sido eliminado de la lista de Pokemon!");
                for (int j = i; j < tamaño - 1; j++) {
                    listaPokemon[j] = listaPokemon[j + 1];
                }
                listaPokemon[--tamaño] = null;
                return;
            }
        }
        System.out.println("No se encontró ningún Pokemon con el nombre: " + nombre);
    }

    public void mostrarListaPokemon() {
        System.out.println("Lista de Pokemon:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + listaPokemon[i].toString());
        }
    }

    public Pokemon obtenerPokemonPorNombre(String nombre) {
        for (Pokemon pokemon : listaPokemon) {
            if (pokemon.getNombre().equalsIgnoreCase(nombre)) {
                return pokemon;
            }
        }
        return null;
    }
}

