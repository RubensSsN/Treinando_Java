import aula07.Luta;
import aula07.Lutador;

public class Main {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[5];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75F, 68.9F, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68F, 57.8F, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65F, 80.9F, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93F, 81.6F, 13, 0, 2);

        Luta uec = new Luta();
        uec.marcarLuta(l[1], l[1]);
        uec.lutar();
    }
}