@Test
public void bolso_Con_Ensalada_De_Frutas_Y_Agua_No_Se_Puede_Compartir() {
  Bolso bolso = new Bolso(new EnsaladaDeFrutas(), new Agua());
  Assert.assertFalse(bolso.sePuedeCompartir());
}

@Test
public void bolso_Con_Ensalada_De_Frutas_Y_Agua_Tiene_50_Calorias() {
  Bolso bolso = new Bolso(new EnsaladaDeFrutas(), new Agua());
  Assert.assertEquals(50, bolso.caloriasTotales(), 0.1);
}
  
@Test
public void bolso_Con_Medialunas_Y_Mate_Se_Puede_Compartir() {
  Bolso bolso = new Bolso(new DocenaMedialunas(), new Mate());
  Assert.assertTrue(bolso.sePuedeCompartir()); 
}

@Test
public void bolso_Con_Medialunas_Y_Mate_Tiene_1524_Calorias() {
  Bolso bolso = new Bolso(new DocenaMedialunas(), new Mate());
  Assert.assertEquals(1524, bolso.caloriasTotales(), 0.1); 
}

@Test
public void bolso_Sanguches_Y_Mate_No_Se_Puede_Compartir() {
  Bolso bolso = new Bolso(new Sanguches(), new Mate());
  Assert.assertFalse(bolso.sePuedeCompartir()); 
}

@Test
public void bolso_Sanguches_Y_Mate_Tiene_600_Calorias() {
  Bolso bolso = new Bolso(new Sanguches(), new Mate());
  Assert.assertEquals(600, bolso.caloriasTotales(), 0.1); 
}