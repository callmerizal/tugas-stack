/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random2;

/**
 *
 * @author M.T.RIZAL
 */
// mendemonstrasikan tumpukan dengan array

class tumpukanX {
    private int ukuranMaks; // ukuran array tumpukan
    private long[] arrayTumpukan;
    private int atas; // atas tumpukan
    
    //--------------------------------------------------------------
    public tumpukanX(int s) { // konstruktor
        ukuranMaks = s; // menetapkan ukuran array
        arrayTumpukan = new long[ukuranMaks]; // menciptakan array
        atas = -1; // belum ada item
    }
    
    //--------------------------------------------------------------
    public void push(long j) { // menempatkan item di atas tumpukan
        arrayTumpukan[++atas] = j; // menginkremen atas, sisip item
    }
    
    //--------------------------------------------------------------
    public long pop() { // menghapus item dari atas tumpukan 
        return arrayTumpukan[atas--]; // mengakses item, mendekremen atas
    }
    
    //--------------------------------------------------------------
    public long peek() { // mengintip ke atas tumpukan
        return arrayTumpukan[atas];
    }
    
    //--------------------------------------------------------------
    public boolean apaKosong() { // true jika tumpukan kosong
        return (atas == -1);
    }
    
    //--------------------------------------------------------------
    public boolean apaPenuh() { // true jika tumpukan penuh
        return (atas == ukuranMaks-1);
    }
} // akhir dari tumpukanX

class ujiTumpukan {
    public static void main(String[] args) {
            tumpukanX tumpukan = new tumpukanX(10); // menciptakan tumpukan
            tumpukan.push(20); // menempatkan item keatas tumpukan
            tumpukan.push(40); 
            tumpukan.push(60);
            tumpukan.push(80);
            
            while( tumpukan.apaKosong()) { // sampai kosong,
                
            }
}



