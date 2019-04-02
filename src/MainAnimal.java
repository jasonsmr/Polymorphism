public class MainAnimal {
    public static void main(String[] args) {
          Fish f = new Fish();
          Animal a = f;
          Object o = f;

          f.move();
          a.move();
          //Animal cannot eat, because it is an Animal and not a Fish
          //a.eat();
          // Object cannot move, because it is an Object and not a Fish
          //o.move();

//        Animal[] animals = new Animal[10];
//        animals[0] = new Bird();
//        animals[1] = new Bird();
//        animals[2] = new Fish();
//        for (int i=0; i<animals.length;i++)
//        {
//            double rand = Math.random();
//            if (rand>0.5)
//                animals[i] = new Fish();
//            else
//                animals[i] = new Bird();
//        }
//
//        for(Animal a : animals) {
//            if (a != null)
//                a.move();
//                // not possible because, the eat method is not declared in Animal-class
//                //a.eat();
//        }

    }
}
