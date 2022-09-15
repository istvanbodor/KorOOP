package hu.pterik.koroop.kor;

public class Kor {

    private int kozx;
    private int kozy;
    private int sugar;

    public Kor(int kozx, int kozy, int sugar)
    {
        this.kozx = kozx;
        this.kozy = kozy;
        this.sugar = sugar;

    }

    public Kor(int sugar) {
        this.kozx = 0;
        this.kozy = 0;
        this.sugar = sugar;
    }

    public Kor()
    {
        int n =(int)(Math.random()*10+1);

        this.kozx = rand(n);
        this.kozy = rand(n);
        this.sugar = rand(n);

    }

    private int rand(int n) {
        return (int)(Math.random()*(n +2)+1- n);
    }

}