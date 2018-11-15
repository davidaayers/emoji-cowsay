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
      Cowsay cowsay = new Cowsay(Animals.Cow);
      cowsay.say(args[0]);
   }
}
