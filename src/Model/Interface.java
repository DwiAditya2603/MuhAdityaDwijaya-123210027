/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author PC PRAKTIKUM
 */
public interface Interface {

  int TotalHarga(int price, int duration);
    String[][] Read();
    String[][] ReadRoom();
    void Insert(String name, String id, String contact, int duration, int bill, String room);
    void Update(String id, String name, String room);
    void Edit(String name, String id, String contact);
    void Delete(String id, String name, String room);
    
}
