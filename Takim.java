public class Takim {
    int puan;
    int attigiGol;
    int yedigiGol;
    String name;

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
