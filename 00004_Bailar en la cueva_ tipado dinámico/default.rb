class Linterna 
  def iluminar!
    # ...ilumina como un haz de luz potente...
  end
end

class Vela 
  def alumbrar!
    # ...ilumina con un resplandor débil...
  end
end

class Cueva
  def entrar_con!(iluminador) 
    iluminador.iluminar!
    proyectar_sombras_terrorificas!
  end
  def proyectar_sombras_terrorificas!
    #...
  end
end

class VisitaARuby 
  def realizar!
    la_cueva = Cueva.new 
    la_cueva.entrar_con! Vela.new
  end
end