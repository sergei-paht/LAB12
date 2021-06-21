class Lab12 {
    public static void main(String[] args) {
        System.out.println(Size.XXS + " Номер размера " + Size.XXS.eroSize());
        Size.XXS.getDescription();
        System.out.println(Size.L + " Номер размера " + Size.L.eroSize());
        Size.L.getDescription();
        System.out.println(Size.S + " Номер размера " + Size.S.eroSize());
        Size.S.getDescription();
        Studio man = new Studio();
        Studio woman = new Studio();
        woman.dressWoman();
        man.dressMan();
    }
}
interface ManClothes{
    default void dressMan(){
    }
}

interface WomanClothes{
    default void dressWoman(){
    }
}

abstract class Clothes{
    String SIze;
    String Color;
    String Price;
}
class T_shirt extends Clothes implements WomanClothes, ManClothes{
 }
 class pants extends Clothes implements WomanClothes, ManClothes{
}
class Skirt extends Clothes implements WomanClothes, ManClothes{
}
class Tie extends Clothes implements WomanClothes, ManClothes{
}
class Studio {
    String[] mas = {"Футболка", "штаны", "юбка", "галстук"};
    String[] mas1 = {"Футболка", "штаны", "галстук"};
    public void dressWoman(){
        System.out.println("--------------");
        System.out.println("Женская одежда");
        System.out.println("--------------");
        for (String dress:mas){
            System.out.println(dress);
        }
    }
    public void dressMan(){
        System.out.println("--------------");
        System.out.println("Мужская одежда");
        System.out.println("--------------");
        for (String dress:mas1){
            System.out.println(dress);
        }
    }
}
enum Size { XXS("32"), XS("34"), S("36"), M("38"), L("40");
    private String num;

    Size(String code) {

        this.num = code;
    }

    public String eroSize() {

        return num;
    }

    public void getDescription() {
        switch (num) {
            case "40":
                System.out.println("Взрослый размер");
                break;
            case "38":
                System.out.println(" Взрослый размер");break;
            case "36":
                System.out.println("Взрослый размер");
                break;
            case "34":
                System.out.println("детский размер");
                break;
            case "32":
                System.out.println("детский размер");
                break;
            }
        }
    }

