¡Bien! Ahora intentemos declarar la clase `Guerrero`: 

```java
class Guerrero {
  int puntosDeAtaqueBase;
  int puntosDeDefensaBase;
  ??? arma;
  
  //...constructor...
  
  int puntosDeAtaque() {
    return puntosDeAtaqueBase + arma.refuerzoOfensivo();
  }
  
  int puntosDeDefensa() {
    return puntosDeDefensaBase + arma.refuerzoDefensivo();
  }
}
```

¿Qué problema tenemos acá? ¿Cómo podríamos tipar el atributo arma?

