package modelo;

public class Calculadora {
    private int numero01;
    private int numero02;

    public Calculadora() {
        this.numero01 =1;
        this.numero02 =1;
    }

    public Calculadora(int numero01, int numero02) {
        this.numero01 = numero01;
        this.numero02 = numero02;
    }

    public int getNumero01() {
        return numero01;
    }

    public void setNumero01(int numero01) {
        this.numero01 = numero01;
    }

    public int getNumero02() {
        return numero02;
    }

    public void setNumero02(int numero02) {
        this.numero02 = numero02;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "numero01=" + numero01 +
                ", numero02=" + numero02 +
                '}';
    }


   public int sumar() {
      return sumador();
   }

   private int sumador() {
       return this.numero01 + this.numero02;
   }
}
