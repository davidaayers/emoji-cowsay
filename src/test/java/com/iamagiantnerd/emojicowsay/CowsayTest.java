package com.iamagiantnerd.emojicowsay;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CowsayTest
{
   @Test
   void cowsay_says_stuff()
   {
      Cowsay c = new Cowsay(Animals.Cow);
      String said = c.say("Moo!");
      assertEquals("[Moo!]- " + Animals.Cow.emoji(), said, "Cow said the right thing!");
   }

   @Test
   void says_with_different_animal() {
      Cowsay c = new Cowsay(Animals.Rhino);
      String said = c.say("Snort!");
      assertEquals("[Snort!]- " + Animals.Rhino.emoji(), said, "Rhino said the right thing!");
   }

   @Test
   void command_line_finds_matching_animal() {
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(outContent));

      Cowsay.main(new String[] {"BlubBlub", "Fish"});

      assertEquals("[BlubBlub]- " + Animals.Fish.emoji(), outContent.toString().trim(), "Fish said the right thing!");

      System.setOut(originalOut);
   }
}
