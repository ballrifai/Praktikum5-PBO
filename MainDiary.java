/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak_5;

/**
 *
 * @author NITRO
 */
public class MainDiary {
    public static void main(String[] args) {
        BukuHarian diary = new BukuHarian("Iqbal");

        diary.tulisCatatan("21-09-2026", "Hari ini belajar membuat program Java.");
        diary.tulisCatatan("17-09-2026", "Mengerjakan tugas praktikum di rumah.");
        diary.tulisCatatan("23-09-2026", "Makan siang bersama teman kampus.");
        diary.tulisCatatan("19-09-2026", "Mencoba memahami konsep FileWriter.");
        diary.tulisCatatan("25-09-2026", "Istirahat setelah menyelesaikan tugas.");

        diary.bacaCatatan();

    }
}
