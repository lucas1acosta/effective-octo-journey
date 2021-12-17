public class MaquinaAgua{

  private int copo300;
  private int copo200;
  private int agua;

  public MaquinaAgua(){
    this.copo200 = 0;
    this.copo300 = 0;
    this.agua = 0;
  }

  public int agua(){
    return this.agua;
  }

  public int copos200() {
    return this.copo200;
  }

  public int copos300() {
    return this.copo300;
  }

  public void abastecerAgua() {
    this.agua = 20000;
  }

  public void servirCopo200() {

    if (copo200 > 0 && agua >= 200) {
      this.copo200--;
      this.agua -= 200;
    } else {
      System.out.println("Erro! Sem copo ou agua.");
    }

  }

  public void abastecerCopo200() {
    this.copo200 = 100;
  }

  public void servirCopo300() {

    if (copo300 > 0 && agua >= 300) {
      this.copo300--;
      this.agua -= 300;
    } else {
      System.out.println("Erro! Sem copo ou agua.");
    }

  }

  public void abastecerCopo300() {
    this.copo300 = 100;
  }



}
