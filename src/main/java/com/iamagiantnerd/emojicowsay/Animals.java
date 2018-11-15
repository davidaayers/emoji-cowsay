package com.iamagiantnerd.emojicowsay;

public enum Animals
{
   Cow("\uD83D\uDC04"),
   Zebra("\uD83E\uDD93"),
   TRex("\uD83E\uDD96"),
   Squid("\uD83E\uDD91"),
   Fish("\uD83D\uDC1F"),
   Gorilla("\uD83E\uDD8D"),
   Rhino("\uD83E\uDD8F"),
   ;

   private String emoji;

   Animals(String emoji)
   {
      this.emoji = emoji;
   }

   public String emoji()
   {
      return emoji;
   }
}
