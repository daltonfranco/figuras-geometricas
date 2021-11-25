public class Retangulo extends FigurasGeometricas{
    
    private int lado1;
    private int lado2;

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado2(){
        return lado2;
    }

    @Override
    public int getArea() {
        int area = this.lado1 * this.lado2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }

    @Override
    public int getPerimetro() {
        int perimetro = (this.lado1*2) + (this.lado2*2);
        return perimetro;
    }


  
}
