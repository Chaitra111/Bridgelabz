package com.bridgelabz.FunctioalPrograming;


import java.util.ArrayList;
import java.util.Random;

import com.bridgelabz.Utility.Utility;
/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose : To generate distinct coupon number
 */
public class CouponNumber
{
		public static void main(String[] args) {
			Utility u=new Utility();
			int count = 0;
			System.out.println("enter the value n");
			int couponNum = u.getInteger();
			ArrayList<Integer> array = new ArrayList<>();
			Random r = new Random();
			while (array.size() < couponNum) {
				int randomNumber = r.nextInt(1000);
				count++;
				if (!array.contains(randomNumber)) {
					array.add(randomNumber);
				}
			}
			System.out.println("count=" + " " + count);

			for (int i = 0; i < couponNum; i++) {
				System.out.print(array.get(i));
			}
		}

	}