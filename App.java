public class App {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();

        retangulo.setLado1(8);
        retangulo.setLado2(3);

        System.out.println("O nome da figura é -> " + retangulo.getNomeFigura());
        System.out.println("A area da figura é -> "+retangulo.getArea());
        System.out.println("O perimetro da figura é -> "+retangulo.getPerimetro());

    }
}
