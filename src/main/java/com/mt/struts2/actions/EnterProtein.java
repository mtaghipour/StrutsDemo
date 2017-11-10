package com.mt.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

/*
* ActionSupport provides us more details relate to Action
* */
public class EnterProtein extends ActionSupport {
    
    private int enterProtein;
    
    public int getEnterProtein ( ) {
        return enterProtein;
    }
    
    public void setEnterProtein ( int enterProtein ) {
        this.enterProtein = enterProtein;
    }
    
    @Override
    public String execute ( ) throws Exception {
        
        ProteinTracking proteinTracking = new ProteinTracking ( );
        proteinTracking.AddStruts ( enterProtein );
        
        return ERROR;
    }
    
    
    public String getGoalText(){
        /*
        * This getText method is in ActionSupport
        * We passing a key and this method returns us the value.
        * */
        return getText ( "goal.text" );
    }
}
