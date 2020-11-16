import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

public class Basics {
    public static void main(String[] arg) {
        Basics thebasics = new Basics();
        int[] x = {1,3,5,7,9,13};
        int[] negs = {-1,-3,-5,-7,-9,-13};
        int[] mix = {-1,3,-5,7,-9,0,13,6,-44};
        int[] mix2 = {-1,3,-5,7,-9,0,13,6,-44};
        int[] y = {1, 5, 10, -2};
        thebasics.oneto255();
        thebasics.oddsto255();
        thebasics.sumto255();
        thebasics.iterate(x);
        thebasics.findmax(negs); // -1
        thebasics.findmax(mix); // 13
        thebasics.getaverage(x);
        thebasics.getaverage(mix);
        thebasics.oddarray();
        // [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25,
        // 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49,
        // 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73,
        // 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97,
        // 99, 101, 103, 105, 107, 109, 111, 113, 115, 117,
        // 119, 121, 123, 125, 127, 129, 131, 133, 135, 137,
        // 139, 141, 143, 145, 147, 149, 151, 153, 155, 157,
        // 159, 161, 163, 165, 167, 169, 171, 173, 175, 177,
        // 179, 181, 183, 185, 187, 189, 191, 193, 195, 197,
        // 199, 201, 203, 205, 207, 209, 211, 213, 215, 217,
        // 219, 221, 223, 225, 227, 229, 231, 233, 235, 237,
        // 239, 241, 243, 245, 247, 249, 251, 253, 255]
        thebasics.greaterthanY(mix, 2); // 4
        thebasics.squarevals(y); // [1, 25, 100, 4]]
        thebasics.maxminavg(y); // [10.0, -2.0, 3.5]
        thebasics.removenegatives(y); // [1, 5, 10, 0]



    }

    // Write a method that prints all the numbers from 1 to 255.
    public void oneto255(){
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }

    }

    // Write a method that prints all the odd numbers from 1 to 255.
    public void oddsto255(){
        for(int i = 1; i <= 255; i=i+2){
            System.out.println(i);
        }

    }

    // Write a method that prints the numbers from 0 to 255, but this
    // time print the sum of the numbers that have been printed so far.
    public void sumto255(){
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum+=i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }

    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would
    // iterate through each member of the array and print each value
    // on the screen.
    public void iterate(int[] x){
        for(int i : x){
            System.out.println(i);
        }

    }

    // Write a method that takes any array and prints the maximum value
    // in the array. Your method should also work with a given array
    // that has all negative numbers (e.g. [-3, -5, -7]), or even a
    // mix of positive numbers, negative numbers and zero.
    public void findmax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: " + max);
    }

    // Write a method that takes an array, and prints the AVERAGE of the
    // values in the array. For example for an array [2, 10, 3], your method
    // should print an average of 5. 
    public void getaverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Average: " + sum / arr.length);


    }

    // Write a method that creates an array 'y' that contains all the odd
    // numbers between 1 to 255. When the method is done, 'y' should have
    // the value of [1, 3, 5, 7, ... 255].
    public void oddarray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i++){
            if( i % 2 != 0){
                y.add(i);
            }
        }
        System.out.println(y);
    }

    // Write a method that takes an array and returns the number of values
    // in that array whose value is greater than a given value y. For example,
    // if array = [1, 3, 5, 7] and y = 3, after your method is run it will print
    // 2 (since there are two values in the array that are greater than 3).
    public void greaterthanY(int[] arr, int y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        System.out.println(count);
    }

    // Given any array x, say [1, 5, 10, -2], write a method that multiplies
    // each value in the array by itself. When the method is done, the array
    // x should have values that have been squared, say [1, 25, 100, 4].
    public void squarevals(int[] y){
        for(int i = 0; i < y.length; i++){
            y[i] = y[i] * y[i];
        }

        System.out.println(Arrays.toString(y));
        
    }

    // Given any array x, say [1, 5, 10, -2], write a method that replaces any
    // negative number with the value of 0. When the method is done, x should
    // have no negative values, say [1, 5, 10, 0].
    public void removenegatives(int[] x){
        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    // Given any array x, say [1, 5, 10, -2], write a method that returns an
    // array with the maximum number in the array, the minimum value in the
    // array, and the average of the values in the array. The returned array
    // should be three elements long and contain: [MAXNUM, MINNUM, AVG]
    public void maxminavg(int[] y){
        double max = y[0];
        double min = y[0];
        double sum = 0;
        for(int i = 0; i < y.length; i++){
            if(y[i] > max){
                max = y[i];
            }
            if(y[i] < min){
                min = y[i];
            }
            sum+=y[i];
        }
        double avg = sum / y.length;
        double[] result = {max, min, avg};
        System.out.println(Arrays.toString(result));

    }








}