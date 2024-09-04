/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author SERGIO CUERVO 20241222272
 */
import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {

//proveedor ofrece 10% de descuento sobre el producto sin iva, si tiene un valor de 500 mil o superior
//el provedor ofrece 15% de descuento sobre el producto si su producto es igual o superior a 500 mil y es de la marca Nosy
//definir cuanto seria el valor del producto con el 19% del iva incluido

int producto;
double descuento;
double Valortotalconiva;
double Valortotal;
double ValorFinal;
String Nosy;

Scanner cliente = new Scanner(System.in);
System.out.println("Cuanto es el valor del producto: ");
producto= cliente.nextInt();
Scanner Marca = new Scanner(System.in);
System.out.println("Si el producto es de la marca Nosy, escribe nosy: ");
Nosy= Marca.nextLine();

if((producto>=500 ) && Nosy.equals("nosy")){
descuento=(producto * 0.15);
Valortotal=(producto-descuento);
Valortotalconiva=(Valortotal+(Valortotal*0.19));
System.out.println("El valor de su producto es de: " + Valortotalconiva );
}else if(producto>=500){
descuento=(producto * 0.10);
Valortotal=(producto-descuento);
Valortotalconiva=(Valortotal+(Valortotal*0.19));
System.out.println("El valor de su producto es de: " + Valortotalconiva );
} } }