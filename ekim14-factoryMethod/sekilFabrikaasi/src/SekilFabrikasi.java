public class SekilFabrikasi{
    public ISekilTuru SekilOlustur(int SekilNO){
        if(SekilNO==1){
            ISekilTuru sekil = new Daire();
            return sekil;
        }
        else if (SekilNO==2){
            ISekilTuru sekil = new Dikdortgen();
            return sekil;
        }
        else{
            return null;
        }
    }
}
