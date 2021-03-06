import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int[] weightList;
    private int[] valueList;
    private List<Integer> elementsInside = new ArrayList<>();
    private int currentWeight = 0;
    private int nElements;
    private int maxWeight;
    private List<Integer> index = new ArrayList<>();
    
    public Bag(String argv[]) throws IOException{
        checkArgs(argv);
    }

    public int getWeightOfIndex(int i) {
        return weightList[i];
    }

    public int getValueOfIndex(int i) {
        return valueList[i];
    }

    public int[] getWeightList() {
        return weightList;
    }

    public int[] getValueList() {
        return valueList;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getnElements() {
        return nElements;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public List<Integer> getElementsInside() {
        return elementsInside;
    }

    public void setElementsInside(int element) {
        this.elementsInside.add(element);
    }

    public void setWeightList(int[] weightList) {
        this.weightList = weightList;
    }

    public void setValueList(int[] valueList) {
        this.valueList = valueList;
    }
    
    
    private void checkArgs(String argv[]) throws IOException {
        for (int i = 0; i < argv.length; i++) {
            switch(argv[i]){
                case "-f":
                    fileReader(argv[i + 1]);
                    break;
                case "-d":
                    System.out.println("opcion d");
                    break;
                default:
                    System.out.println("sin opcion valida");
                    break;
            }
        }
    }

    private void fileReader(String file) throws FileNotFoundException, IOException {
        String str;
        boolean flag = true;
        int i = 0;
        
        FileReader f = new FileReader(file);
        BufferedReader buffer = new BufferedReader(f);
        
        while ((str = buffer.readLine()) != null){
            if (flag){
                String[] parts = str.split("\\s");
                this.nElements = Integer.parseInt(parts[0]);
                this.maxWeight = Integer.parseInt(parts[1]);
                flag = false;
                this.valueList = new int[this.nElements];
                this.weightList = new int[this.nElements];
            }else{
                String[] parts = str.split("\\s");
                this.valueList[i] = Integer.parseInt(parts[0]);
                this.weightList[i] = Integer.parseInt(parts[1]);
                index.add(this.valueList[i]);
                i++;   
            }
        }
        buffer.close();
        f.close();
    }
   
    private void OptionDT (){
    
    }
}


