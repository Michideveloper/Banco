class CuentaBancaria {
  // Atributos
  protected float saldo;
  protected int numeroDepositos;
  protected int numeroRetiros;
  protected float tasaAnual;
  protected float comisionMensual;

  // Constructor
  CuentaBancaria(float saldo, float tasaAnual) {
    this.saldo = saldo;
    this.numeroDepositos = 0;
    this.numeroRetiros = 0;
    this.tasaAnual = tasaAnual;
    this.comisionMensual = 0;
  }

  // Metodos
  public void depositar(float cantidad) {
    this.saldo += cantidad;
    this.numeroDepositos++;
  }

  public void retirar(float cantidad) {
    if (this.saldo >= cantidad) {
      this.saldo -= cantidad;
      this.numeroRetiros++;
    } else {
      System.out.println("\nNo hay suficiente saldo");
    }
  }

  public void calcularInteresMensual() {
    float comisionMensual = (this.saldo * this.tasaAnual) / 12;
    this.comisionMensual += comisionMensual;
  }

  public String toString() {
    return "\nSaldo: " + this.saldo + "\n" +
        "Numero de depositos: " + this.numeroDepositos + "\n" +
        "Numero de retiros: " + this.numeroRetiros + "\n" +
        "Tasa anual: " + this.tasaAnual + "\n" +
        "Comision mensual: " + this.comisionMensual;
  }

}