import java.util.Scanner;

public class Forno {

    protected final int volume;
    protected final int tensao;
    protected final int potencia;
    protected final int largura;
    protected final int altura;
    protected final int profundidade;
    private int timer;
    private boolean ligado;
    private float temperatura;

    public Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade) {
        this.volume = volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.temperatura = 0;
        this.ligado = false;
        this.timer = 0;
    }

    public float temperatura() {
        return this.temperatura;
    }

    public boolean ligado() {
        return this.ligado;
    }

    public void aumentarTemperatura() {
        if(ligado() == false){
            ligar();
        }
        if(this.temperatura == 200){
            this.temperatura += 20;
        }else{
            if(this.temperatura == 220){
                this.temperatura += 30;
            }else{
                if(this.temperatura < 300){
                    this.temperatura += 50;
                }else{
                    System.out.println("Temperatura no máximo");
                }
            }
        }
        
        
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
        this.temperatura = 0;
    }

    public void diminuirTemperatura() {
        if(this.temperatura == 300 || this.temperatura > 200){
            if(this.temperatura == 234.0){
                this.temperatura -= Math.round(33.33F);
                this.temperatura -= 1;                
            }else{
                this.temperatura -= Math.round(33.33F);
            }
        }else{
            if(this.temperatura > 50){
                this.temperatura -= 50;
            }else{
                System.out.println("Temperatura em 0");
            }
        }
    }

    public void setTimer(int i) {
        Scanner in = new Scanner(System.in);
        while(timer < 1 && timer > 120 ){
            System.out.println("Timer deve ter entre 1 minuto e 120 minutos");
            i = in.nextInt();
        }
        in.close();
        this.timer = i;
    }

    public int tempoRestante() {
        return timer;
    }

    public void tick() {
        if(this.timer > 0){
            this.timer--;
            if(this.timer == 0){
                desligar();
            }
        }else{
            System.out.println("Erro. Timer já está em 0.");
        }
        
    }
    
}
