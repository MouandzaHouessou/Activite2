package main.java;
/**
 * module-info.java .
 * Test d'ecriture, Calcul.java.
 * @author HOUESSOU
 */
public class Calcul {
/**
 * Constructeur qui empeche la classe d'etre instancie.
 * @throws Exception lorsque instancie
 */
  public Calcul() throws Exception {
    throw new Exception("cette classe ne peut pas etre instanciee");
  }
/**
 * Calcule de la somme.
 * @param a premier entier
 * @param b deuxieme entier
 * @return la somme de a et b
 */
 public static int somme(final int a, final int b) {
   return a + b;
 }
/**
 * Fonction utilitaire.
 * @param a premier entier
 * @param b deuxi�me entier
 * @return b o� a/b si b >=10
 */
 public static int maFonction(final int a, final int b) {
   final int valeurPivot = 10;
   if (b >= valeurPivot) {
     return a / b;
   }
   return b;
 }
/**
 * Calcule une division.
 * @param a premier entier
 * @param b deuxi�me entier
 * @throws IllegalArgumentException
 * si b == 0
 * @return a / b si b != 0
 */
public static int division(final int a, final int b) {
  if (b == 0) {
    throw new IllegalArgumentException("b ne doit pas etre 0");
  }
  return a / b;
 }
}


