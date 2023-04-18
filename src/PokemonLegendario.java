public class PokemonLegendario extends Pokemon{
    // Atributos
    private String localizacion;

    // Constructores
    public PokemonLegendario(String nombre, String tipo, double altura, double peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    // toString
    @Override
    public String toString() {
        String info = super.toString();
        info += "Localización: " + localizacion + "\n";
        return info;
    }
}

