class ArmaStub implements Arma {
  public int refuerzoOfensivo() {
    return 0;
  }
  public int refuerzoDefensivo() {
    return 0;
  }
}

@Test
public void se_puede_instanciar_un_guerrero_usando_un_constructor() {
  Arma a = new ArmaStub();
  Guerrero g = new Guerrero(10, 2, a);
  Assert.assertEquals("debería setear los puntos de ataque", 10, g.puntosDeAtaqueBase);
  Assert.assertEquals("debería setear los puntos de defensa", 2, g.puntosDeDefensaBase);
  Assert.assertEquals("debería setear el arma", a, g.arma);
}


@Test
public void una_espada_tiene_10_de_ataque() {
  Assert.assertEquals(10, new Espada().refuerzoOfensivo());
}

@Test
public void un_escudo_tiene_2_de_ataque() {
  Assert.assertEquals(2, new Escudo().refuerzoOfensivo());
}

@Test
public void una_espada_tiene_1_de_defensa() {
  Assert.assertEquals(1, new Espada().refuerzoDefensivo());
}

@Test
public void un_escudo_tiene_6_de_defensa() {
  Assert.assertEquals(6, new Escudo().refuerzoDefensivo());
}