package com.iamagiantnerd.emojicowsay;

public class Cowsay
{
   private final Animals animal;

   public Cowsay(Animals animal)
   {
      this.animal = animal;
   }

   public String say(String toSay)
   {
      return "[" + toSay + "]- " + animal.emoji();
   }

   public static void main(String[] args)
   {
      // default to cow
      Animals sayAnimal = Animals.Cow;
      if(args.length>1) {
         for (Animals animal : Animals.values())
         {
            if(animal.name().equals(args[1])) {
               sayAnimal = animal;
               break;
            }
         }
      }
      Cowsay cowsay = new Cowsay(sayAnimal);
      System.out.println(cowsay.say(args[0]));
   }
}
