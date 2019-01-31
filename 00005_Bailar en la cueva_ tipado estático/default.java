interface Iluminador {
  void iluminar();
}

class Linterna implements Iluminador {
  public void iluminar() {
    // ...ilumina como un haz de luz potente...
  }
} 

class Vela implements Iluminador {
  void alumbrar() {
    // ...ilumina con un resplandor débil...
  }
} 

class Cueva {
  void entrarCon(Iluminador iluminador) {
    iluminador.iluminar();
    proyectarSombrasTerrorificas();
  }
  void proyectarSombrasTerrorificas() {
    // ...    
  }
}

class VisitaAJava {
  void realizar() {
    Cueva laCueva = new Cueva();
    laCueva.entrarCon(new Vela());
  }
} 