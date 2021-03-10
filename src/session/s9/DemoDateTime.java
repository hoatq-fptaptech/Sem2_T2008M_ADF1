package session.s9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DemoDateTime {
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();// ngay hom nay
        System.out.println("Hom nay la ngay: "+ld);
        System.out.println("Ngay mai: "+ld.plusDays(1));
        System.out.println("Tuan sau: "+ld.plusWeeks(1));
        System.out.println("Thang sau: "+ld.plusMonths(1));
        System.out.println("Nam sau: "+ld.plusYears(1));

        System.out.println("Thang truoc: "+ld.minusMonths(1));

        System.out.println("Thang nay la thang: "+ld.getMonthValue());

        LocalDate k2x = LocalDate.parse("1990-10-25");
        System.out.println("Hom do la thu: "+k2x.getDayOfWeek());
        System.out.println("trong nam la thu: "+k2x.getDayOfYear());
        System.out.println("nam: "+k2x.getYear());

        LocalDate k3 = LocalDate.of(1999,6,19);

        // dung local date in ra danh sách các năm nhuận trong thế kỷ 21
        LocalDate kt = LocalDate.of(2001,12,31);
        System.out.println("Danh sach cac nam nhuan:");
        while (kt.getYear()<2101){
            if(kt.getDayOfYear() == 366){
                System.out.println(kt.getYear());
            }
            kt = kt.plusYears(1);
        }

        LocalDate t2 = LocalDate.parse("2001-02-28");
        System.out.println("Danh sach cac nam nhuan:");
        while (t2.getYear()<2101){
            if(t2.plusDays(1).getDayOfMonth() == 29){
                System.out.println(t2.getYear());
            }
            t2 = t2.plusYears(1);
        }

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Ngay luc nay: "+dt);
        System.out.println("ti nua: "+dt.plusHours(1));
        System.out.println("teo  nua: "+dt.plusMinutes(15));
        System.out.println("1 nua teo  nua: "+dt.plusSeconds(15));
        System.out.println("cho 1 tich tac thoi: "+dt.plusNanos(15));
    }
}
