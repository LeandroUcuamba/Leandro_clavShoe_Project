/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Leandro Ucuamba
 */
public class validarCampos {
    
    
    public void validarText(java.awt.event.KeyEvent evt)
    { 
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume(); 
    }
    
    
    public void validarNumeros(java.awt.event.KeyEvent evt)
    { 
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z'))evt.consume();
    }
    
    
}
