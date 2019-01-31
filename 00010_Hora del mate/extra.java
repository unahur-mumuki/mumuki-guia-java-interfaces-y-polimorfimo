class PruebasPicnic {
  void ponerEnsaladaDeFrutasYAgua() {
    Bolso bolso = new Bolso(new EnsaladaDeFrutas(), new Agua());
    bolso.sePuedeCompartir(); // devuelve false
    bolso.caloriasTotales(); // devuelve 50
  }
  void ponerMedialunasYMate() {
    Bolso bolso = new Bolso(new DocenaMedialunas(), new Mate());
    bolso.sePuedeCompartir(); // devuelve true
    bolso.caloriasTotales(); // devuelve 1524
  }
  void ponerSanguchesYMate() {
    Bolso bolso = new Bolso(new Sanguches(), new Mate());
    bolso.sePuedeCompartir(); // devuelve false (no se puede compartir :'( )
    bolso.caloriasTotales(); // devuelve 600
  }
}