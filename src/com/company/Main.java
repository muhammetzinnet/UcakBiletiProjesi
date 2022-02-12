package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int year, tripType,distance;;
        double discount = 0, fee = 0.10,totalPrice;
        boolean isError = false;

        System.out.println("*****************PATİKA HAVA YOLLARI BİLET İŞLEMLERİ*****************");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütefen gitmek istediğiniz mesafeyi giriniz = ");
        distance = scanner.nextInt();

        System.out.print("Lütfen yaşınızı giriniz = ");
        year = scanner.nextInt();



        System.out.print("1- Tek Yön mü ? \t2- Gidiş dönüş mü ? ");
        tripType = scanner.nextInt();

        totalPrice = (distance*fee);
        if (distance<0){
            isError=true;
        }else if (tripType<=0 && tripType>=3){
            isError=true;
        }else if (year<0){
            isError = true;
        }


        if (tripType==1){
            if (year<12){
                discount = totalPrice - (totalPrice*0.50);
            }else if (year>=12 && year<=24){
                discount = totalPrice - (totalPrice*0.10);
            }else if (year>=65){
                discount = totalPrice - (totalPrice*0.30);
            }else {
                discount = totalPrice;
            }
        }else if (tripType==2){
            if (year<12){
                discount = totalPrice - (totalPrice*0.50);
            }else if (year>=12 && year<=24){
                discount = totalPrice - (totalPrice*0.10);
            }else if (year>=65){
                discount = totalPrice - (totalPrice*0.30);
            }else {
                discount = totalPrice - (totalPrice * 0.20);
            }
        }else {
            isError = true;
        }

        if (isError){
            System.out.println("Lütfen geçerli bir işlem yapınız...");
        }else {
            System.out.println("İndirimsiz Tutar = "+ totalPrice);
            System.out.println("İndirimli bilet fiyatınız = "+discount);
        }
    }
}
