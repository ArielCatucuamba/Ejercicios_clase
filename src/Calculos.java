public class Calculos {
    int valor1;
    int valor2;
    int valor3;
    public Calculos(int valor1,int valor2,int valor3){
        this.valor1=valor1;
        this.valor2=valor2;
        this.valor3=valor3;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
}
class sumar extends Calculos{
    public sumar(int valor1,int valor2,int valor3){
        super(valor1, valor2, valor3);
    }
    public void sumatoria(){
        int sumafinal=getValor1()+getValor2()+getValor3();
        System.out.println("LA suma de los valores "+getValor1()+"- "+getValor2()+"-"+getValor3());
        System.out.println(sumafinal);
    }


}
