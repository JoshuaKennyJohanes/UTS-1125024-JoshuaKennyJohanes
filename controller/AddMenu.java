package prak5.joshuakenny.controller;

import java.util.ArrayList;

import prak5.joshuakenny.models.MenuItem;
import prak5.joshuakenny.models.Kopi;
import prak5.joshuakenny.models.Teh;
import prak5.joshuakenny.models.Roti;
import prak5.joshuakenny.exception.MenuTidakDitemukanException;
import prak5.joshuakenny.exception.StokTidakCukupException;
import prak5.joshuakenny.view.ViewCafe;

public class AddMenu {
    ArrayList<MenuItem>list = new ArrayList<>();
    
    //buat kopi duklu
    Kopi newKopi = new Kopi("KPI-1", "Kopi Susu", 15000, 10);
    Roti newRoti = new Roti("RTI-1", "Roti Bakar", 20000, 10);
    Teh newTeh = new Teh("TTI-1", "Teh Tarik", 10000, 10);
    
    //tambahin menu default
    list.add(newKopi);
    list.add(newRoti);
    list.add(newTeh);

    ViewCafe view;

    public AddMenu(ViewCafe view){
        this.view = view;
    }

    public void run(){
        int status = 1;
        while(status!=0){
            int caseNumber = view.renderMenu();
            switch (caseNumber) {
                case 1:
                    handleAddMenu();
                    break;
                case 2:
                    handleBeliMenu();
                    break;
                default:
                    status=0;
                    break;
            }
        }
    }


    public void handleAddMenu(){
        int subMenu = view.renderAddMenuOption();
        switch (subMenu) {
            case 1:
                Kopi newKopi = view.inputNewKopi();
                list.add(newKopi);
                break;
            case 2:
                Teh newTeh = view.inputNewTeh();
                list.add(newTeh);
                break;
            case 3:
                Roti newRoti = view.inputNewRoti();
                list.add(newRoti);
                break;
            
            default:
                throw new AssertionError();
        }
    }



    public void handleBeliMenu(){
        view.printMenu(list);
        String subMenu = view.renderBuyMenuOption();
        boolean found = false;
        try {
            for(MenuItem menu : list) {
                if(menu.getId().equalsIgnoreCase(subMenu)){
                    found=true;
                    if(menu.getTipeMenu().equals("Kopi")){
                        int [] kustomisasi = view.beliNewKopi();
                        if(kustomisasi[0]>menu.getStok()){
                            throw new StokTidakCukupException(subMenu);
                        }
                        menu.customize(kustomisasi);
                        //set stok 
                        int newStok = menu.getStok() - kustomisasi[0];
                        menu.setStok(newStok)

                        menu.getOrderDetail();

                    } else if (menu.getTipeMenu().equals("Teh")){
                        int [] kustomisasi = view.beliNewTeh();
                        if(kustomisasi[0]>menu.getStok()){
                            throw new StokTidakCukupException(subMenu);
                        }
                        menu.customize(kustomisasi);
                        menu.getOrderDetail();
                    } else if(menu.getTipeMenu().equals("Roti")){
                        int [] kustomisasi = view.beliNewRoti();
                        if(kustomisasi[0]>menu.getStok()){
                            throw new StokTidakCukupException(subMenu);
                        }
                        menu.customize(kustomisasi);
                        menu.getOrderDetail();
                }
            }
            }
            if(!found){
                throw new MenuTidakDitemukanException(subMenu);
            }   
        } catch(MenuTidakDitemukanException e){
            System.out.println(e.getMessage());

        } catch(StokTidakCukupException e){
            System.out.println(e.getMessage());

        } 
    }
}