¡Uff! Por más que le demos vueltas y vueltas, ninguno de los tipos existentes resuelven nuestro problema, porque...

* ...si tipamos al `arma` como `Espada arma` sólo podremos crear guerreros con espadas;
* ...y si la tipamos como `Escudo arma`, sólo podrán usar escudos. 


Pero en Ruby la cosa era más simple, ¿o no? :confused:. Mientras que el `arma` fuera un objeto que entendiera los mensajes `refuerzoOfensivo` y `refuerzoDefensivo`, alcanzaba. Dicho de otra forma, cualquier objeto que exhibiera la _interfaz_ de un arma nos era útil.  

¿No podríamos valernos de esta idea en Java? ¿Sabés que sí :sunglasses:? ¡Te presentamos a `interface`!

```java
class Guerrero {
  int puntosDeAtaqueBase;
  int puntosDeDefensaBase;
  Arma arma;
  
  int puntosDeAtaque() {
    return puntosDeAtaqueBase + arma.refuerzoOfensivo();
  }
  
  int puntosDeDefensa() {
    return puntosDeDefensaBase + arma.refuerzoDefensivo();
  }
}

interface Arma {
   int refuerzoOfensivo();
   int refuerzoDefensivo();
}
```

> ¡Momento! Agregá este código a tu solución antes de continuar.  
> 

