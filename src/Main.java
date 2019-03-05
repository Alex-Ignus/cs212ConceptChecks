public class Main {

    public static void main (String args[]){
        Pyromancer novicePyromancer = new Pyromancer(100, 100, 10);
       System.out.println(novicePyromancer.getAtrubutes().entrySet());
        System.out.println(novicePyromancer.magicRank);


        Pyromancer AprenticePyromancer = new Pyromancer(100, 200, 25);
        System.out.println(AprenticePyromancer.getAtrubutes().entrySet());
        System.out.println(AprenticePyromancer.magicRank);

        Pyromancer wannaBePyromancer = new Pyromancer();
        System.out.println(wannaBePyromancer.getAtrubutes().entrySet());
        System.out.println(wannaBePyromancer.magicRank);



    }

}
