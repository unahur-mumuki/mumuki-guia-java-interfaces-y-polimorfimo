/*...previousContent...*/

class PruebaGuerreros {
  static void main(String[] args) {
    Guerrero xena = new Guerrero(22, 4, new Espada());
    Guerrero conan = new Guerrero(18, 3, new Escudo());
    
    xena.puntosDeAtaque(); 
    xena.puntosDeDefensa(); 
    conan.puntosDeAtaque(); 
  }
}