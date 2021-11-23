public class PuanDurumu {
    public static void main(String[] args) {
        

        Takim[] takimlar=new Takim[4];

        takimlar[0] = new Takim();
        takimlar[1] = new Takim();
        takimlar[2] = new Takim();
        takimlar[3] = new Takim();

        takimlar[0].name="Galatasaray";
        takimlar[1].name="Fenerbahçe";
        takimlar[2].name="Beşiktaş";
        takimlar[3].name="Trabzonspor";
         
        for(int i=1;i<=3;i++){

            HaftaninMaclariniGoster(i, takimlar);
            System.out.println();

            PuanDurumuGoster();

        }




    }
    public static void PuanDurumuGoster(){
        System.out.println("*******************************");
        System.out.println("Takım            Attıgı Gol      Yedigi Gol     Puan");
            }
    
    public static void HaftaninMaclariniGoster(int i, Takim[]takimlar){
        if(i==1){
            System.out.println(i+". Haftanın Maçları Şu Şekilde");
            System.out.println(takimlar[0].name+ " - " +takimlar[1].name);
            System.out.println(takimlar[2].name+ " - " +takimlar[3].name);
        }
        else if(i==2){
            System.out.println(i+". Haftanın Maçları Şu Şekilde");
            System.out.println(takimlar[0].name+ " - " +takimlar[2].name);
            System.out.println(takimlar[1].name+ " - " +takimlar[3].name);
        }
        else if(i==3){
            System.out.println(i+". Haftanın Maçları Şu Şekilde");
            System.out.println(takimlar[0].name+ " - " +takimlar[3].name);
            System.out.println(takimlar[1].name+ " - " +takimlar[2].name);
            }
        }

}
