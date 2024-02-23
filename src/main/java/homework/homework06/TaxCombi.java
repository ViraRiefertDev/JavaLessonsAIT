package homework.homework06;

import java.util.Scanner;

public class TaxCombi {
    public static void main(String[] args) {
        //Комбинированный налог: Создайте программу для расчёта налога, который зависит от категории товара и региона
        //покупателя. Налог на электронику 10%, на одежду 5%. Если покупатель из региона A, применяется дополнительный налог 2%.
        Scanner scan = new Scanner(System.in);
        double price, tax;
        String regionA;
        System.out.print("Введите цену товара в $: ");
        price = scan.nextDouble();
        System.out.println("Для расчета налога выберите категорию товара");
        System.out.println("Если товар находится в категории: Електорника - введите букву E");
        System.out.println("Eсли товар находится в категории: Одежда - введите букву C");
        char category = scan.next().charAt(0);
        if (category == 'C' || category == 'E') {
            System.out.println("Категория принята!");

            System.out.println("Подскажите находится ли покупатель в регионе А?");
            System.out.println("Eсли покупатель находится в регионе А введите yes, если в другом регионе введите no");
            regionA = scan.next();
            if (regionA.equals("yes") || regionA.equals("no")) {
                System.out.println("Ура получилось! Рассчитываем налог на товар");
                if (category == 'C')
                    tax = 5;
                else
                    tax = 10;
                if (regionA.equals("yes"))
                    tax += 2;
                System.out.println("Налог на товар составляет:" + tax + "%");
                price = price + price * tax/100;
                price =Math.round(price*100.0)/100.0;
                System.out.println("Цена товара с учетом налога: " + price + "$");
            } else {
                System.out.println("Вы ввели чтото другое! Надо ввести yes/no");
                System.out.println("Не отчаивайтесь, в следующий раз у Вас обязательно получится. До свидания!");
            }
        }
        else{
                System.out.println("Вы ввели неизвестную категорию! До свидания!");
            }
        scan.close();

        }
    }
