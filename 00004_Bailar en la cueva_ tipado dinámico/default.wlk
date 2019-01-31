class Linterna {
  method iluminar() {
    // ...ilumina como un haz de luz potente...
  }
}

class Vela {
  method alumbrar() {
    // ...ilumina con un resplandor débil...
  }
}

class Cueva {
  method entrarCon(iluminador)  {
    iluminador.iluminar()
    self.proyectarSombrasTerrorificas()
  }
  method proyectarSombrasTerrorificas() {
    // ...
  }
}

class VisitaAWollok {
  method realizar() {
    const laCueva = new Cueva()
    laCueva.entrarCon(new Vela())
  }
}