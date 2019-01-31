En una tierra lejana (o quizás simplemente en un videojuego :stuck_out_tongue:) valientes guerreros y guerreras defienden a los pueblos. Cada uno trae consigo un arma, que puede ser una espada o un escudo: 

 * las espadas suman 10 puntos de ataque y 1 de defensa;
 * los escudos suman 2 puntos de ataque y 6 de defensa.  

Por ejemplo: 

```java
Guerrero xena = new Guerrero(22, 4, new Espada());
Guerrero conan = new Guerrero(18, 3, new Escudo());

xena.puntosDeAtaque(); // xena tiene 22 + 10 de su espada
xena.puntosDeDefensa(); // xena tiene 4 + 1 de su espada
conan.puntosDeAtaque(); // conan tiene 18 + 2 de su escudo 
// etc...
```

> Vamos de a poco: usando **solamente lo que vimos hasta ahora**, desarrollá las clases `Espada` y `Escudo`; ambas deben entender los mensajes `refuerzoOfensivo` y `refuerzoDefensivo`. 

