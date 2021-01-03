package test.java;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test; 
import main.java.Calcul;
/**
 * Tests unitaire pour la classe Calcul
 * @author HOUESSOU
 */
public class CalculTest {
  /**
   * test du constructeur
   */
 @Test
 public void testConstructeur() {
   try {
	   new Calcul();
	   fail("l'exception pour l'instanciation de la Calcul.class aurait du etre levee");
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
   assertEquals(a / b, Calcul.maFonction(a, b));
 }
/**
 *test si b inferieur à 10
 */
 @Test
 public void testMaFonction2() {
   final int a = 2;
   final int b = 7;
   assertEquals(b, Calcul.maFonction(a, b));
 }
 /**
  *test de la somme
  */
 @Test
 public void testSomme() {
   assertEquals(5 ,Calcul.somme(2, 3));
 }
 /**
  * test de la division
  */
 @Test
 public void testDivision() {
   assertEquals(4, Calcul.division(8, 2));
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
	   fail("l'exception de la division par 0 aurait du etre levee");
   } catch (IllegalArgumentException e) {
     //ne rien faire c'est normal
   }
 }
}
