package com.example.gachaapp;

//import static androidx.appcompat.graphics.drawable.DrawableContainerCompat.Api21Impl.getResources;

import java.util.ArrayList;
import java.util.Random;

public class AL {
    ArrayList<Integer> arrayC = new ArrayList<>();
    ArrayList<Integer> arrayCFire = new ArrayList<>();
    ArrayList<Integer> arrayCWater = new ArrayList<>();

    ArrayList<Integer> arraySR = new ArrayList<>();
    ArrayList<Integer> arraySRFire = new ArrayList<>();
    ArrayList<Integer> arraySRWater = new ArrayList<>();

    ArrayList<Integer> arrayUR = new ArrayList<>();
    ArrayList<Integer> arrayURFire = new ArrayList<>();
    ArrayList<Integer> arrayURWater = new ArrayList<>();

    String zoku;
    String[] list={"",""};


    //コンストラクタ
    public AL() {
        for (int y = 1; y <= 41; y++) {
            arrayC.add(y);
        }
        for (int y = 1; y <= 41; y += 2) {
            arrayCFire.add(y);
        }
        for (int y = 2; y <= 40; y += 2) {
            arrayCWater.add(y);
        }
        for(int y = 1;y<=7;y++){
            arraySR.add(y);
        }
        for (int y =1;y<=7;y+=2){
            arraySRFire.add(y);
        }
        for (int y =2;y<=6;y+=2){
            arraySRWater.add(y);
        }
        for(int y = 1;y<=6;y++){
            arrayUR.add(y);
        }
        for (int y =1;y<=5;y+=2){
            arrayURFire.add(y);
        }
        for (int y =2;y<=6;y+=2){
            arrayURWater.add(y);
        }


    }

    public  String[] URGacha(String i) {
        String[] reaName = {"c", "sr", "ur"};
        String fileName = "pic_";
        Random rand = new Random();
        int value=0;
        if (i.equals( "通常")) {

            int index = rand.nextInt(arrayUR.size()); // 0〜size-1
            value = arrayUR.get(index);
            if (value%2==0){
                zoku="水";
            }else {
                zoku = "炎";
            }


        } else if (i.equals("炎")) {
            int index = rand.nextInt(arrayURFire.size()); // 0〜size-1
            value = arrayURFire.get(index);
            zoku = "炎";

        } else if (i.equals("水")) {
            int index = rand.nextInt(arrayURWater.size()); // 0〜size-1
            value = arrayURWater.get(index);
            zoku = "水";
        }
        fileName = fileName + reaName[2] + "_" + value;
        list[0]=fileName;
        list[1]=zoku;
        return list;

    }

    public  String[] SRGacha(String i) {
        String[] reaName = {"c", "sr", "ur"};
        String fileName = "pic_";
        Random rand = new Random();
        int value=0;
        if (i.equals( "通常")) {

            int index = rand.nextInt(arraySR.size()); // 0〜size-1
            value = arraySR.get(index);
            if (value%2==0){
                zoku="水";
            }else {
                zoku = "炎";
            }


        } else if (i.equals("炎")) {
            int index = rand.nextInt(arraySRFire.size()); // 0〜size-1
            value = arraySRFire.get(index);
            zoku="炎";

        } else if (i.equals("水")) {
            int index = rand.nextInt(arraySRWater.size()); // 0〜size-1
            value = arraySRWater.get(index);
            zoku="水";
        }
        fileName = fileName + reaName[1] + "_" + value;
        list[0]=fileName;
        list[1]=zoku;
        return list;

    }

    public  String[] CGacha(String i) {
        String[] reaName = {"c", "sr", "ur"};
        String fileName = "pic_";
        Random rand = new Random();

        int value=0;
        if (i.equals( "通常")) {

            int index = rand.nextInt(arrayC.size()); // 0〜size-1
            value = arrayC.get(index);
            if (value%2==0){
                zoku="水";
            }else {
                zoku = "炎";
            }


        } else if (i.equals("炎")) {
            int index = rand.nextInt(arrayCFire.size()); // 0〜size-1
            value = arrayCFire.get(index);
            zoku = "炎";

        } else if (i.equals("水")) {
            int index = rand.nextInt(arrayCWater.size()); // 0〜size-1
            value = arrayCWater.get(index);
            zoku="水";

        }
        fileName = fileName + reaName[0] + "_" + value;
        list[0]=fileName;
        list[1]=zoku;
        return list;

    }



}
