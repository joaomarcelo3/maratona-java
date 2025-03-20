package introducao.aula07_Arrays_Multi_Dimensionais;

public class MultiDimensionais_inicializacao {
    public static void main(String[] args) {

        int[] array = {1,2,3};

        int[][] arraInt = new int[3][];

        arraInt[0] = new int[2];
        arraInt[1] = array;
        arraInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arraInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6},};

        for (int[] arrayBase : arraInt2) {
            System.out.println("\n----");
            for (int num : arrayBase) {
                System.out.print(num + " ");       
            }
        }
    }
}
