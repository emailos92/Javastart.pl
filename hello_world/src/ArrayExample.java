public class ArrayExample {
    public static void main(String[] args) {
        int [] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        int [] numbers2 = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;


        for(int i =0;i<numbers1.length;i++){
            sum += numbers1[i];
        }

        for(int i =0;i<numbers1.length;i++){
            sum += numbers2[i];
        }

        System.out.println(sum);
    }
}
