public class Client {
    public static void main(String[] args){
        SekilFabrikasi sekilfab = new SekilFabrikasi();
        ISekilTuru sekil = sekilfab.SekilOlustur(1);
        sekil.Alan();
        sekil.Cevre();
    }
}
