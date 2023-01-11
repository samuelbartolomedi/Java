package app;


import entities.Lesson;
import entities.Task;
import entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Lesson> lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.println();
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char type = sc.next().charAt(0);
            System.out.print("Título? ");
            sc.nextLine();
            String title = sc.nextLine();
            if (type == 'c') {
                System.out.print("URL do vídeo? ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos? ");
                int seconds = sc.nextInt();
                lessonList.add(new Video(title, url, seconds));
            } else {
                System.out.print("Descrição? ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões? ");
                int questionCount = sc.nextInt();
                lessonList.add(new Task(title, description, questionCount));
            }
        }

        double durationSum = 0.0;
        for (Lesson lesson : lessonList) {
            int duration = lesson.duration();
            durationSum += duration;
        }

        System.out.println();
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + durationSum + " segundos");
    }
}