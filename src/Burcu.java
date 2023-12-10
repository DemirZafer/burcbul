import java.util.Scanner;

public class Burcu {
    public static void main(String[] args) {
        Scanner vr = new Scanner(System.in);
        int ay , gun  ;
        String burc ="" ;
        boolean error= false;
        System.out.println("Doğduğunuz Ay : ");
        ay = vr.nextInt();
        System.out.println("Doğduğunuz Gün : ");
        gun = vr.nextInt();

        if ((ay==1)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=22){
                    burc=("Kova Burcusunuz");
                }
            }else {
                error=true ;
            }
        }else if ((ay==2)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=19)){
                    burc=("Kova Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==2)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=20){
                    burc=("Balık Burcusunuz");
                }
            }else {
                error =true ;
            }
        }else if ((ay==3)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=20)){
                    burc=("Balık Burcusunuz.") ;
                }
            }else {
                error=true;
            }
        }
        if ((ay==3)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=21){
                    burc=("Koç Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==4)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=20)){
                    burc=("Koç Burcusunuz") ;
                }
            }else {
                error=true;
            }
        }
        if ((ay==4)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=21){
                    burc=("Boğa Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==5)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=21)){
                    burc=("Boğa Burcusunuz");
                }
            }else {
                error=true;;
            }
        }
        if ((ay==5)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=22){
                    burc=("İkizler Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==6)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=22)){
                    burc=("İkizler Burcusunuz");
                }
            }else {
                error=true;;
            }
        }
        if ((ay==6)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=23){
                    burc=("Yengeç Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==7)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=22)){
                    burc=("Yengeç Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==7)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=23){
                    burc=("Aslan Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==8)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=22)){
                    burc=("Aslan Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==8)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=23){
                    burc=("Başak Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==9)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=22)){
                    burc=("Başak Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==9)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=23){
                    burc=("Terazi Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==10)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=22)){
                    burc=("Terazi Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==10)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=23){
                    burc=("Akrep Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==11)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=21)){
                    burc=("Akrep Burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==11)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=22){
                    burc=("Yay Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==12)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=21)){
                    burc=("Yay burcusunuz");
                }
            }else {
                error=true;
            }
        }
        if ((ay==12)){
            if ((gun<=31)&&(gun>=1)){
                if (gun>=22){
                    burc=("Oğlak Burcusunuz");
                }
            }else {
                error=true;
            }
        }else if ((ay==1)){
            if ((gun<=31)&&(gun>=1)){
                if ((gun<=21)){
                    burc=("Oğlak Burcusunuzsa");
                }
            }
        }if (error){
            System.out.println("Hatalı Değer");
        }
        System.out.println(burc);
    }
}
