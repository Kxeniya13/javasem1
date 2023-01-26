import java.util.Scanner;

public class DZ1 {
    public static void main(String[] args){
        System.out.println("Задание 1:  ");
        Scanner l = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = l.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.round((Math.random() * 20));
            System.out.print(array[i] + " ");
            }
        System.out.println();
        maxminArray(array);
        System.out.println("Задание 2:  ");
        Scanner n = new Scanner(System.in);
        System.out.print("Введите год: ");
        int newYear = n.nextInt();
        visYear(newYear);
        System.out.println("Задание 3:  ");
        int []numArr = { 3, 2, 2, 3 };
        int val = 3;
        int []endArr = moveElementToEnd(numArr, val);
        for(int i = 0; i < numArr.length; i++) System.out.print(endArr[i] + " ");
    }   
    static void maxminArray(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);
    }
    static void visYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
    static int[] moveElementToEnd(int []array, int toMove){
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            while (i < j && array[j] == toMove)
            j--;
            if (array[i] == toMove)
            swap(array, i, j);
            i++;
        }
        return array;
    }
    static int[] swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}

