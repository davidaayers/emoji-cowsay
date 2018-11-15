package com.iamagiantnerd.emojicowsay;

public class Cowsay
{
   public String say(String toSay)
   {
      return "[" + toSay + "]- \uD83D\uDC04";
   }

   public static void main(String[] args)
   {
      Cowsay cowsay = new Cowsay();
      cowsay.say(args[0]);
   }
}
