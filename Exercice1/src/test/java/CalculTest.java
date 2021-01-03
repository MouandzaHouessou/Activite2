package test.java;
import org.junit.Assert;
import org.junit.Test;
import main.java.Calcul;
/**
 * Tests unitaire pour la classe Calcul
 * @author HOUESSOU
 */
public class CalculTest {
 @Test
 public void testConstructeur() {
  try {
	new Calcul();
	Assert.fail("l'exception pour l'instanciation de la Calcul.class aurait du être levée");
  } catch (Exception e) {
	//ne rien faire
  }
 }
/**
 * test si b >= 10 
 */
 @Test
 public void testMaFonction1() {
   final int a = 2;
   final int b = 14;
   Assert.assertEquals(a / b, Calcul.maFonction(a, b));
 }
/**
 * test si b<10
 */
 @Test
 public void testMaFonction2() {
   final int a = 2;
   final int b = 7;
   Assert.assertEquals(b, Calcul.maFonction(a, b));
 }
 
 @Test
 public void testSomme() {
  Assert.assertEquals(5 ,Calcul.somme(2, 3));
 }
 @Test
 public void testDivision() {
  Assert.assertEquals(4, Calcul.division(8, 2));
 }
/**
 * test IllegalArgumentException sur Division();
 */
 @Test
 public void testDivision2() {
   try {
     final int a = 23;
     final int b = 0;
     final int resultat = Calcul.division(a, b);
	 Assert.fail("l'exception de la division par 0 aurait dû être levée");
   } catch (IllegalArgumentException e) {
     //ne rien faire c'est normal
   }
 }
}
