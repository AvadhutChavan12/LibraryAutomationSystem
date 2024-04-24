/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author avadh
 */
public class TableActionCellRender extends DefaultTableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable jtable,Object o,boolean bln,boolean blnl,int i,int i1)
    {
        Component com=super.getTableCellRendererComponent(jtable,o,bln,blnl,i,i1);
        PanelAction action=new PanelAction();
        if(isSeleted==false && row % 2==0)
        {
            action.setBackground(Color.WHITE);
        }
        {
        
        }
        action.setBackground(com.getBackground());
        return action;
    }
    
}
