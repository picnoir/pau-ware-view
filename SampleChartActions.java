/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.PauWare.PauWare_view;

/**
 *
 * @author josuah
 */
public class SampleChartActions
{

    boolean _open = false;

    public boolean isOpen() {
        return _open;
    }

    public boolean isClosed() {
        return !_open;
    }

    public void setOpen(Boolean open) {
        _open = open;
    }
}
