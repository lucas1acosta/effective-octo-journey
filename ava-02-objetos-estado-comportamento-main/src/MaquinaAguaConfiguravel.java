
public class MaquinaAguaConfiguravel {

  public final int capacidadeAgua;
  public final int capacidadeCopos200;
  public final int capacidadeCopos300;
  private int agua;
  private int copo200;
  private int copo300;

  public MaquinaAguaConfiguravel(int agua, int copo200, int copo300) {
    if(agua <= 0){
      throw new IllegalArgumentException("A quantidade de agua deve ser positiva");
    }
    if(copo200 <= 0){
      throw new IllegalArgumentException("A quantidade de copos de 200ml deve ser positiva");
    }
    if(copo300 <= 0){
      throw new IllegalArgumentException("A quantidade de copos de 300ml deve ser positiva");
    }
    this.capacidadeAgua = agua;
    this.capacidadeCopos200 = copo200;
    this.capacidadeCopos300 = copo300;
  }

  public int agua() {
    return this.agua;
  }

  public int copos200() {
    return this.copo200;
  }

  public int copos300() {
    return this.copo300;
  }

  public void abastecerAgua() {
    this.agua = this.capacidadeAgua;
  }

  public void abastecerCopo200() {
    this.copo200 = capacidadeCopos200;
  }

  public void abastecerCopo300() {
    this.copo300 = capacidadeCopos300;
  }

  public void servirCopo200() {
    if (copo200 > 0) {
      if (agua >= 200) {
        this.copo200--;
        this.agua -= 200;
      } else {
        throw new IllegalStateException("Nao ha agua");
      }
    } else {
      throw new IllegalStateException("Nao ha copos");
    }
  }

  public void servirCopo300() {
    if (copo300 > 0) {
      if (agua >= 300) {
        this.copo300--;
        this.agua -= 300;
      } else {
        throw new IllegalStateException("Nao ha agua");
      }
    } else {
      throw new IllegalStateException("Nao ha copos");
    }
  }



}
