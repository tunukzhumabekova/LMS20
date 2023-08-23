package LMS20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                try {
                    System.out.println("Выберите фигуру для расчета:");
                    System.out.println("1. Параллелепипед");
                    System.out.println("2. Цилиндр");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("Введите длину, ширину и высоту параллелепипеда:");
                        double length = scanner.nextDouble();
                        double width = scanner.nextDouble();
                        double height = scanner.nextDouble();

                        if (length <= 0 || width <= 0 || height <= 0) {
                           throw new IllegalArgumentException();}{
                            System.out.println(("Значения длины, ширины и высоты должны быть положительными."));
                        }

                        double surfaceArea = Parallelepiped.calculateSurfaceArea(length, width, height);
                        double volume = Parallelepiped.calculateVolume(length, width, height);

                        System.out.println("Площадь параллелепипеда: " + surfaceArea);
                        System.out.println("Объем параллелепипеда: " + volume);
                    } else if (choice == 2) {
                        System.out.println("Введите радиус и высоту цилиндра:");
                        double radius = scanner.nextDouble();
                        double height = scanner.nextDouble();

                        if (radius <= 0 || height <= 0) {
                            throw new IllegalArgumentException();}{
                            System.out.println("Значения радиуса и высоты должны быть положительными.");
                        }

                        double surfaceArea = Cylinder.calculateSurfaceArea(radius, height);
                        double volume = Cylinder.calculateVolume(radius, height);

                        System.out.println("Площадь цилиндра: " + surfaceArea);
                        System.out.println("Объем цилиндра: " + volume);
                    } else {
                        throw new IllegalArgumentException();}{
                        System.out.println("Выбран недопустимый вариант.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Введите числовые значения.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                } finally {
                    scanner.close();
                }
            }
        }
