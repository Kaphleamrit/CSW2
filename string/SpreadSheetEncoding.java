// spreadsheets use an alphabetical 

// implement a function that converts a spreadsheet column id to integer

public class SpreadSheetEncoding {

    public static void main(String[] args) {
        System.out.println(encode("AZ"));
    }

    static int encode(String s) {
        int toReturn = 0;

        for(int i=0; i<s.length() ; i++) {
            toReturn = toReturn*26 + s.charAt(i) - 'A' + 1;
        }

        return toReturn;
    }
    
}
