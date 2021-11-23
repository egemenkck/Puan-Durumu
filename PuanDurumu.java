public class PuanDurumu {
    public static void main(String[] args) {
        Takim gs = new Takim();
        Takim fb = new Takim();
        Takim bjk = new Takim();
        Takim ts = new Takim();

        Takim[] takimlar=new Takim[4];

        takimlar[0]=gs;
        takimlar[1]=fb;
        takimlar[2]=bjk;
        takimlar[3]=ts;
        for (int i=0;i<=3;i++) {
            int takim1=4, takim2=3, takim3=2, takim4=1;

            takimlar[0].attigiGol=takim1;
            takimlar[1].attigiGol=takim2;
            takimlar[2].attigiGol=takim3;
            takimlar[3].attigiGol=takim4;

        }




    }
    public static void PuanDurumuGoster(){
        System.out.println("*******************************");
        System.out.println("Takım            Attıgı Gol      Yedigi Gol     Puan");
            }

}

public class Takim {
    int puan=0;
    int attigiGol=0;
    int yedigiGol=0;

    public int GolAtti(int gol){
        attigiGol=attigiGol+gol;
        return attigiGol;
    }
    public int GolYedi(int gol){
        yedigiGol=yedigiGol+gol;
        return yedigiGol;
    }
    public int PuanAldi(int eklenenPuan){
        puan=puan+eklenenPuan;
        return puan;
    }
    public void AttigiGolGoster(){
        System.out.println(attigiGol);
    }
    public void YedigiGolGoster(){
        System.out.println(yedigiGol);
    }
    public void PuanGoster(){
        System.out.println(puan);
    }
}