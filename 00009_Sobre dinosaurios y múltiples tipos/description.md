Analicemos el siguiente modelo: 

![](http://www.plantuml.com/plantuml/png/bSuz3i8m30NWFQV8MCx0XCh00H2xSOsmbCJHSze1rBlp8uh4X3ezoNh-zBGqmOLOubwBEOrGY_SGusGwnC6G5Trc6-OGE95xF2heMzHSasGfpV-yVmxdqPdG4s15wSSzIJ9-shKPLhjEIR7hwKRBs6Kjb0NKhFfgb2qB3YgOgBk-uqK_0000)

Antes de introducir las interfaces, si en Java declarábamos una variable que referenciaba una instancia de `Triceratops`, lo hacíamos así: 

```java
Triceratops billy = new Triceratops();
```

Pero, ahora que las conocemos, sabemos que si `Triceratops` implementa `Dinosaurio`, también podemos hacer:

```java
Dinosaurio billy = new Triceratops();
```

Esto significa que una variable puede ser tipada de múltiples formas, o en otras palabras, **que un objeto tiene más de un tipo**: uno por cada interfaz que implemente :open_mouth:.

> Veamos si se entiende hasta acá: ¿de qué formas podemos tipar a las siguientes variables?
> 


<!--
@startuml
interface Dinosaurio {
  void dormir();
}

class Tiranosaurio implements Dinosaurio {
  void dormir();
  void buscarCarronia();
}

class Velociraptor implements Dinosaurio {
  void dormir();
  void salirACazar();
}


class Triceratops implements Dinosaurio {
  void dormir();
  void comerHierva(hierva);
}
@enduml
-->
