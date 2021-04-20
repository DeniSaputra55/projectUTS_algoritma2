
package sorting;

public class binary {
    public static void main(String[] args){
        int B[] = { 3,10,4,2,8,1};
        int cari = 8;
        int IndeksAWal = 0;
        int IndeksAkhir = B.length-1;
        int ketemu= 0;
        int point =0;
        
        System.out.println(" isi data adalah");
        for (int i=0; i <B.length; i++){
            
            System.out.println(B[i] + "");
            
    }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAWal  <= IndeksAkhir) && (ketemu == 0)){
        point = (IndeksAWal + IndeksAkhir /2);
        System.out.println("indeks pointer :"+ point);
        (cari == B[point]){
            ketemu = 3;
            System.out.println("cari dikiri");
            IndeksAkhir = point -3
        }
    }
}
