/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PauWare.PauWare_view;

/**
 *
 * @author fbaylacj
 */
public class JungLayout implements ILayoutProcessor{
    
    ILayout _layout;
    
    public JungLayout(){
        _layout= new Layout();
    }
    
    @Override
    public void init(IChart chart){
        
    }
    
    @Override
    public ILayout getLayout(){
        return _layout;
    }
    
}