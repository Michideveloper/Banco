class CuentaAhorros extends CuentaBancaria{
  // Atributos
  private boolean estaActiva;

  // Constructor
  CuentaAhorros(float saldo, float tasaAnual){
    // Heredamos atributos y metodos de la clase padre CuentaBancaria
    super(saldo, tasaAnual);

    /*
    if(this.saldo < 1000){
      this.estaActiva = true;
    }else{
      this.estaActiva = true;
    }
     */
  }

  
}