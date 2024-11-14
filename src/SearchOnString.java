public class SearchOnString {
    public static void main(String[] args) {
        String name="sampn";
        char target='p';
        System.out.println(StringSearch(name,target));
    }

    static boolean StringSearch(String name,char target){
        if (name.length()==0){
            return false;
        }

        for (int i = 0; i <name.length() ; i++) {
            char ele=name.charAt(i);
            if (ele==target){
                return true;
            }
        }
        return false;
    }
}
