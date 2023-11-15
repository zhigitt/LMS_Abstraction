public class Main {
    public static void main(String[] args) {
        Shape tegerek = new Tegerek(10);
        Shape kvadart = new Kvadrat(5, 5);
        Shape tikBurchtuk = new TikBurchtuk(4, 8, 4, 8);
        Shape uchBurchtuk = new UchBurchtuk(4, 5, 3);
        Shape romb = new Romb(4,6);


        System.out.println("PERIMETR: ");
        System.out.println("Tegerek: " + tegerek.getPerimeter());
        System.out.println("Kvadrat: " + kvadart.getPerimeter());
        System.out.println("Tik burchtuk: " + tikBurchtuk.getPerimeter());
        System.out.println("Uch burchtuk: " + uchBurchtuk.getPerimeter());
        System.out.println("Romb: " + romb.getPerimeter());
    }
}