Hagamos una pausa para visitar (con una linterna :flashlight: en la mano) a nuestro buen amigo Wollok <i class="da da-wollok"></i>, que se internó en una oscura cueva. 

Miremos un momento el código que está en el editor. Está bastante claro que si en `VisitaARuby.realizar()` hacemos `laCueva.entrarCon(new Linterna())`, todo andará perfectamente. Pero, ¿qué sucede si hacemos `laCueva.entrarCon(new Vela())`?

> Probalo vos mismo: 
> 
>  1. Primero, enviá el código en el editor. **Mirá el detalle de los errores**. 
>  2. Después, envialo de nuevo, pero renombrando `alumbrar()` por `iluminar()` en la clase `Vela`, para que las velas y linternas sean polimórficas. 


