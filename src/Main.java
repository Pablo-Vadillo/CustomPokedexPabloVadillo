import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                System.out.println("¡Bienvenido a la Pokédex!");

                ListaPokemon avistados = new ListaPokemon();
                ListaPokemon capturados = new ListaPokemon();

                Scanner scanner = new Scanner(System.in);
                char opcion;

                do {
                    System.out.println("Seleccione una opción:");
                    System.out.println("a) Añadir un pokemon avistado");
                    System.out.println("b) Añadir avistamiento legendario");
                    System.out.println("c) Pasar a capturados");
                    System.out.println("d) Mostrar lista de avistados");
                    System.out.println("e) Mostrar lista de capturados");
                    System.out.println("f) Cerrar la Pokédex");
                    System.out.print("Opción: ");
                    opcion = scanner.next().charAt(0);

                    switch (opcion) {
                        case 'a':
                            scanner.nextLine();
                            System.out.print("Ingrese el nombre del Pokémon: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Ingrese el tipo del Pokémon: ");
                            String tipo = scanner.nextLine();
                            Pokemon pokemon = new Pokemon(nombre, tipo);
                            avistados.agregarPokemon(pokemon);
                            break;
                        case 'b':
                            scanner.nextLine();
                            System.out.print("Ingrese el nombre del Pokémon legendario: ");
                            String nombreLegendario = scanner.nextLine();
                            System.out.print("Ingrese el tipo del Pokémon legendario: ");
                            String tipoLegendario = scanner.nextLine();
                            System.out.print("Ingrese la localización del Pokémon legendario: ");
                            String localizacion = scanner.nextLine();
                            Pokemon legendario = new Pokemon(nombreLegendario, tipoLegendario);
                            legendario.setLocalizacion(localizacion);
                            avistados.agregarPokemon(legendario);
                            break;
                        case 'c':
                            scanner.nextLine();
                            System.out.print("Ingrese el nombre del Pokémon que desea capturar: ");
                            String nombreCaptura = scanner.nextLine();
                            Pokemon pokemonCaptura = avistados.obtenerPokemonPorNombre(nombreCaptura);
                            if (pokemonCaptura != null) {
                                avistados.eliminarPokemon(nombreCaptura);
                                System.out.print("Ingrese el peso del Pokémon capturado: ");
                                double peso = scanner.nextDouble();
                                System.out.print("Ingrese la altura del Pokémon capturado: ");
                                double altura = scanner.nextDouble();
                                scanner.nextLine();
                                System.out.print("Ingrese una descripción del Pokémon capturado: ");
                                String descripcion = scanner.nextLine();
                                pokemonCaptura.setPeso(peso);
                                pokemonCaptura.setAltura(altura);
                                pokemonCaptura.setDescripcion(descripcion);
                                capturados.agregarPokemon(pokemonCaptura);
                            } else {
                                System.out.println("No se encontró un Pokémon con ese nombre en la lista de avistados.");
                            }
                            break;
                        case 'd':
                            avistados.mostrarListaPokemon();
                            break;
                        case 'e':
                            capturados.mostrarListaPokemon();
                            break;
                        case 'f':
                            System.out.println("¡Gracias por usar la Pokédex! ¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                            break;
                    }
                } while (opcion != 'f');

                scanner.close
                        ();
            }
        }
