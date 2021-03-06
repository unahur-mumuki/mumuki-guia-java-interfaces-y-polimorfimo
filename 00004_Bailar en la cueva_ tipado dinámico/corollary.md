Entendamos qué acaba de suceder acá: tal como estaba el código en el editor, las linternas y velas no eran polimórficas: no compartían una interfaz porque unas entendían `iluminar()` y las otras `alumbrar()`. 

Esto significaba que cuando `VisitaAWollok` enviaba el mensaje `iluminar()`, **el programa se ejecutaba, pero fallaba**, porque `iluminar()` no formaba parte de la interfaz de la `Vela` :boom:: 

```
wollok.lang.MessageNotUnderstoodException: a Vela[] does not understand iluminar()
```

En otras palabras: si en Wollok un objeto no cumple la interfaz que se espera de este, nuestro código recién **fallará cuando enviemos el mensaje** no implementado. Por eso decimos que Wollok valida que las cosas tengan el tipo correcto dinámicamente (durante la ejecución del programa) o, en términos más breves, que **tiene tipado dinámico**.

¿Y en Java?