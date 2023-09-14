package com.example;

import java.util.*;

/**
 * Hello world!
 */
public class App 
{
    static final int nameMinLenth = 2;
    static final int nameMaxLenth = 50;
    static final int minAmount = 1;
    static final int maxAmount = 65000;


    public static void main(String[] args)
    {
        int maxAmount  = 5000;
       
        Queue<Product> lstProducts = new PriorityQueue<>();
        try {
            Product p1 = new Product("p1", maxAmount);
            Product p2 = new Product("p2", maxAmount);
            Product p3 = new Product("p3", maxAmount);
            Product p4 = new Product("p4", maxAmount);


            lstProducts.add(p1);
            lstProducts.add(p2);
            lstProducts.add(p3);
            lstProducts.add(p4);

            lstProducts.remove();
            //lstProducts.poll();
            //lstProducts.poll();

            //lstProducts.peek();

            

            Iterator<Product> it = lstProducts.iterator();

            while (it.hasNext()){
                System.out.println(it.next());

            }
                



        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }


    int getProductMinPrice(TreeSet<Integer> lstPrices){
        Integer min = (int)lstPrices.first();

        return min;
    }

    //recherche, abs, finances, ass,
    //sncf, 

   /// -- esn
    
}



/**
 * @brief our product class implement comparable interface in order to allow 
 * ordering
 */
class Product implements Comparable<Product>{

    String name;
    int amount;

    static final int nameMinLenth = 2;
    static final int nameMaxLenth = 50;
    static final int minAmount = 1;
    static final int maxAmount = 65000;



    

    public Product(String name, int amount) throws Exception {
        if(name.length() >= nameMinLenth && name.length()<= nameMaxLenth){
            this.name = name;
            this.amount = amount;
        }
        else{
            throw new Exception("wrong product data");
        }
    }


    @Override
    public int compareTo(Product oProduct) {

        if(this.amount>oProduct.amount){
            return 1;
        }
        else if (this.amount == oProduct.amount){
            return 0;
        }
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " -- " + amount;
    }


    /*
     * 
     */
    static Product genNewProduct(int nameLength){

        Product oProduct = null;

        //generate name
        String name= "";
        for(int i=0; i<nameLength; i++){
            name += (char)(Math.random()*126 + 65);
        }

 


        //generate price
        int amount = (int)(Math.random()*(Product.maxAmount- Product.minAmount) + Product.minAmount);
        

        try {
            oProduct = new Product(name, amount);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
        System.out.println(oProduct.toString());

        return oProduct;

    }

}






