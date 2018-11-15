package com.iamagiantnerd.emojicowsay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CowsayTest
{
   @Test
   void cowsay_says_stuff() {
      Cowsay c = new Cowsay();
      String said = c.say("Moo!");
      assertEquals("[Moo!]- \uD83D\uDC04", said, "Cow said the right thing!");
   }
}
