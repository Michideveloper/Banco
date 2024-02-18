class CuentaCorriente extends CuentaBancaria {
  // Atributos
  private float sobregiro;

  // Constructor
  CuentaCorriente(float saldo, float tasaAnual) {
    super(saldo, tasaAnual);

    this.sobregiro = 0;
  }

  // Metodos
  @Override
  public void retirar(float cantidad) {
    this.saldo -= cantidad;
    this.numeroRetiros++;
    if (this.saldo < 0) {
      this.sobregiro = Math.abs(this.saldo);
      this.saldo = 0;
    }
  }

  @Override
  public void depositar(float cantidad) {
    if (this.sobregiro > 0) {
      if (cantidad >= this.sobregiro) {
        this.saldo += (cantidad - this.sobregiro);
        this.sobregiro = 0;
      } else {
        this.sobregiro -= cantidad;
      }
    } else {
      this.saldo += cantidad;
    }

    this.numeroDepositos++;
  }

  @Override
  public String toString() {
    return super.toString() + "\nSobregiro: " + this.sobregiro;
  }

}