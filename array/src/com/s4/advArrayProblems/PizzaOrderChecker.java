
//There are two types of discounts in the pizza shop:

//- The first discount works only if you buy two pizzas in one day

//The second is a coupon that allows buying one pizza for two consecutive days (two pizzas in total)

//As you order a lot of pizza at this place, you are a golden client, and you can use an unlimited number
 //of discounts and coupons of any type on any day. You want to order exactly ai pizzas for your visitors
 //on the ith day while using only discounts and coupons, essentially never paying full money for a single pizza.

//Note that individual pizzas are ordered per visitor, and you never buy more pizzas than you need on a particular day.
 //Can you determine whether you can buy the proper amount of pizzas each day if you are allowed to use only coupons and discounts?
 //Note that it is also prohibited to have any active coupons after the end of the day N. It is possible not to have any visitors on a day


package com.s4.advArrayProblems;

import java.util.*;

public class PizzaOrderChecker {

    public static String canOrderPizzas(List<Integer> visitors) {
        int carryOverCoupon = 0;

        for (int i = 0; i < visitors.size(); i++) {
            int pizzasNeeded = visitors.get(i) + carryOverCoupon;

            if (pizzasNeeded % 2 != 0 && carryOverCoupon==1 ) {
                carryOverCoupon = 0;
                pizzasNeeded--;
            }
            // If the number of pizzas needed is odd, use one coupon and carry one over to the next day
            if (pizzasNeeded % 2 != 0 && carryOverCoupon==0) {
                carryOverCoupon = 1;
                pizzasNeeded--;
			} 
            if (pizzasNeeded < 0 || (i == visitors.size() - 1 && carryOverCoupon == 1)) {
                return "No";
            }
        }

        // At the end, there should be no carry over coupons
        return carryOverCoupon == 0 ? "Yes" : "No";
    }

    public static void main(String[] args) {
        List<Integer> visitors = Arrays.asList(1, 3, 2);
        System.out.println(canOrderPizzas(visitors));  // Should print No
    }
}

