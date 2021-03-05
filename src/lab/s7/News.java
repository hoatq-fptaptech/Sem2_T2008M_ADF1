package lab.s7;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;

//    ArrayList<Integer> rateList;
    int[] rateList = new int[3];
    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("title:"+getTitle());
        System.out.println("publish date:"+getPublishDate());
        System.out.println("author:"+getAuthor());
        System.out.println("content:"+getContent());
        System.out.println("avg rate:"+getAverageRate());
    }

    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 gia tri:");
        for(int i=0;i<rateList.length;i++){
            rateList[i] =  sc.nextInt();
        }
        for(int i=0;i<rateList.length;i++){
            this.averageRate += rateList[i];
        }
        this.averageRate = averageRate/3;
    }
}
