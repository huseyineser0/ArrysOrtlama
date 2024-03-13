public class hormonikOrt {
    public static void main(String[] args) {
        //Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        int[] list = {2,4,6,100}; // internette baktığım bir örnek doğru

        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
                sum+=1.0/list[i];
        }
        double harmnikOrt=list.length/sum;
        System.out.println(harmnikOrt);
    }
}
