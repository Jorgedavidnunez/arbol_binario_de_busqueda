/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author david
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frm_arbol_binario frm = new frm_arbol_binario();
        frm.show();
        /*Random aleatorio = new Random();
        Arbol_binario arbol = new Arbol_binario();
        for (int i=1; i<=1000000; i++){
            int value = aleatorio.nextInt(10000000-(-10000000)+1)+(-10000000);
            try {
                arbol.agregarNodo(value, value);
            } catch (Exception e) {
                System.out.println("ERROR..."+e);
            }
            
            
        }
        System.out.println("Realizado crack");*/
        //arbol.inOrder(arbol.raiz);
        //arbol.preOrder(arbol.raiz);
        //arbol.postOrder(arbol.raiz);
        
        //Prueba
        //Arbol_binario arbol = new Arbol_binario();
        /*int opcion=0, elemento;
        int nombre;
        do{
            try {
                opcion  = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar un Nodo\n"
                        +"2.Salir\n"
                        +"3.Recorrer inOrden\n"
                        +"Elige una opcion...","Arboles Binarios",JOptionPane.QUESTION_MESSAGE)); 
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del nodo","Agregando nodo",JOptionPane.QUESTION_MESSAGE));
                        nombre = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del nodo","Agregando nodo",JOptionPane.QUESTION_MESSAGE));
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        if(!arbol.arbolVacio()){
                            arbol.inOrder(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio","UnU",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta","Mula",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println("ERRROR... "+e.getMessage());
            }
        }while(opcion!=2);*/
    }
    
}
