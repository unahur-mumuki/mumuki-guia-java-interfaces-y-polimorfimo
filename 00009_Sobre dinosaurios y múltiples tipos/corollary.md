De todas formas, no todos los tipos nos son útiles. Por ejemplo, si tipamos a un velociraptor de la siguiente forma, podremos enviarle el mensaje `dormir`...

```java
Dinosaurio riley = new Velociraptor();
riley.dormir();
```

...pero no podremos enviarle el mensaje `salirACazar`, dado que fallará estáticamente al no pertenecer ese mensaje a la interfaz: 


```java
// no compila
jason.salirACazar();
```

En cambio, si lo tipamos como `Velociraptor`, sí podemos enviar ambos mensajes...


```java
Velociraptor riley = new Velociraptor();
riley.dormir();
riley.salirACazar();
```

...pero claro, sólo podrá referenciar a velociraptores :stuck_out_tongue:. Por eso, si luego hacemos...

```java
riley = new Tiranosaurio();
```

...fallará estáticamente. 

Entonces, ¿cuál es la forma correcta de tipar? ¡Depende de qué mensajes necesites enviar! 

_Si sólo necesitás un dinosaurio, tipá como dinosaurio. Pero si necesitás un velociraptor, tipá como velociraptor :sunglasses:._



