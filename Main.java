public class Main {

    public static int kiemtrahocphi(boolean isStudent, double score) {
        if (isStudent) {
            if (score < 0) return -1;
            else if (score < 5) return 25000000;
            else if (score < 6) return 22000000;
            else if (score < 7) return 18000000;
            else if (score < 9) return 0;
            else return -1;
        } else {
            if (score < 0) return -1;
            else if (score < 5) return 30000000;
            else if (score < 6) return 26000000;
            else if (score < 7) return 22000000;
            else if (score < 9) return 0;
            else return -1;
        }
    }
    public static void main(String[] args) {

    }
}