public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("totalSudut(60)     = " + s.totalSudut(60));
        System.out.println("totalSudut(60, 50) = " + s.totalSudut(60, 50));
        System.out.println("keliling(3, 4, 5)  = " + s.keliling(3, 4, 5));
        System.out.println("keliling(3, 4)     = " + s.keliling(3, 4));
    }
}