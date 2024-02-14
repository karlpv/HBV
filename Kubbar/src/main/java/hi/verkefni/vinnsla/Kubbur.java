package hi.verkefni.vinnsla;

public class Kubbur {
    private Stykki[][] bord = new Stykki[3][3];
    private int stig = 0;
    private int valinTala = 0;

    public Kubbur() {
        upphafsstillBord();
    }

    public void upphafsstillBord() {
        int tala = 1;
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                bord[i][j] = new Stykki(tala++);
            }
        }
    }
    public boolean athugaGisk(int row, int column) {
        if (bord[row][column].getTala() == valinTala) {
            stig++;
            return true;
        } else {
            stig--;
            return false;
        }
    }

    public int getStig() {
        return stig;
    }

    public void setValinTala(int tala) {
        this.valinTala = tala;
    }
}
