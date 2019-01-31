No, el código `new Guerrero(22, 2, new Espada())` aún no anda :sob:. 

> ¿No nos creés? Comprobalo enviando el código en el editor (notá que te agregamos un `main` :smile:).

¿Y por qué no funciona? Para Java, no alcanza con entender todos los mensajes: una clase implementa una interfaz solo cuando, además de definir todos los métodos necesarios:

 1. lo indica explícitamente mediante la declaración `implements`;
 2. todos los métodos que implementan la `interface` están marcados como `public`.

Por ejemplo, si tanto las golondrinas como gorriones cantan: 

```java
interface Cantante {
  void cantar();
}

// notá el implements
class Golondrina implements Cantante {

  // notá el public que llevan todos los métodos que implementen
  // una interface 
  public void cantar() {
    //...cantar como golondrina...
  }
}

class Gorrion implements Cantante {
  public void cantar() {
    //...cantar como gorrión...
  }
}
```

> Agregá los `implements`s y `public`s faltantes