public class Pokemon {
        // Atributos
        private String nombre;
        private String tipo;
        private double altura;
        private double peso;
        private String descripcion;

        // Constructores
        public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.altura = altura;
            this.peso = peso;
            this.descripcion = descripcion;
        }

        public Pokemon(String nombre, String tipo) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.altura = 0.0;
            this.peso = 0.0;
            this.descripcion = "";
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public double getAltura() {
            return altura;
        }

        public double getPeso() {
            return peso;
        }

        public String getDescripcion() {
            return descripcion;
        }

        // Setters
        public void setAltura(double altura) {
            this.altura = altura;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }


        @Override
        public String toString() {
            String info = "Nombre: " + nombre + "\n";
            info += "Tipo: " + tipo + "\n";
            info += "Altura: " + altura + " metros\n";
            info += "Peso: " + peso + " kg\n";
            info += "Descripción: " + descripcion + "\n";
            return info;
        }

        public void setLocalizacion(String localizacion) {
        }
    }

