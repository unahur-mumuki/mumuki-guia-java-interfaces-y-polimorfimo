Entendamos qué acaba de suceder acá: tal como estaba el código en el editor, las linternas y velas no eran polimórficas: no compartían una interfaz porque unas entendían `iluminar!` y las otras `alumbrar!`. 

Esto significaba que cuando `VisitaARuby` enviaba el mensaje `iluminar!`, **el programa se ejecutaba, pero fallaba**, porque `iluminar!` no formaba parte de la interfaz de la `Vela` :boom:: 

```
undefined method `iluminar!' for #<Vela:0x007fb059ace9a8>
```

En otras palabras: si en Ruby un objeto no cumple la interfaz que se espera de este, nuestro código recién **fallará cuando enviemos el mensaje** no implementado. Por eso decímos que Ruby valida que las cosas tengan el tipo correcto dinámicamente (durante la ejecución del programa) o, en términos más breves, que **tiene tipado dinámico**.

¿Y en Java?