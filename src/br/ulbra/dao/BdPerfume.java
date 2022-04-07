/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Leon
 */
public class BdPerfume {

    public ArrayList<String> listaPerfume;
    public ArrayList<String> listaO;
    public BdPerfume() {
        listaPerfume = new ArrayList();
        listaO = new ArrayList<String>(listaPerfume);
    }

    public void save(String perfume) {
        listaPerfume.add(perfume);
        listaO.add(perfume);
        JOptionPane.showMessageDialog(null, "O " + perfume
                + " foi salvo com sucesso!");
    }

    public String toString() {
        String result = "Lista de Perfumes\n";
        if (!listaPerfume.isEmpty()) {
            for (int i = 0; i < listaPerfume.size(); i++) {
                result += listaPerfume.get(i) + "\n";
            }
        } else {
            result = "A base de dados encontra-se vazia!";
        }
        return result;
    }

     public String toStringO() {
         
         Collections.sort(listaO);
        String result = "Lista de Perfumes\n";
        if (!listaO.isEmpty()) {
            for (int i = 0; i < listaO.size(); i++) {
                result += listaO.get(i) + "\n";
            }
        } else {
            result = "A base de dados encontra-se vazia!";
        }
        return result;
    }
    public int getSize() {
        return listaPerfume.size();
    }

    public String getPerfume(int i) {
       String r = "";
        if(i>=0){
          r = listaPerfume.get(i);
            
        }else{
            r = "Perfume não existe";
        }
        
        return r;
    }

    public void delete(int i) {
        if (i != -1) {
            listaPerfume.remove(i);
        } else {
            JOptionPane.showMessageDialog(null, "O Perfume não existe!");
        }
    }

    public int search(String perfume) {
        boolean achou = false;
        int i = 0, r = -1;
        while (i < listaPerfume.size() && !achou) {
            if (listaPerfume.get(i).equals(perfume)) {
                r = i;
                achou = true;
            }//fim do if
            i++; //proximo perfume
        }//fim do loop
        return r;
    }

    public void update(int i, String update) {
        if (i != -1 || update.length() > 0) {
            listaPerfume.set(i, update);
            JOptionPane.showMessageDialog(null,
                    "Perfume modificado com sucesso!!");
        }else{
            JOptionPane.showMessageDialog(null,
                    "O perfume não foi modificado!!");
        }

    }

}
