package com.iamagiantnerd.emojicowsay;

public enum Animals
{
   Cow("Cow", "\uD83D\uDC04");

   private String name;
   private String emoji;

   Animals(String name, String emoji)
   {
      this.name = name;
      this.emoji = emoji;
   }

   public String emoji()
   {
      return emoji;
   }
}
