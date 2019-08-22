
class CountString {
    public static void main(String... args) {
        String summer = new String("Summer"); //creates a new String object with the value "Summer".This object
                                                        //is not placed in the String constant pool
        String summer2 = "Summer"; //creates a new String object with the value "Summer"& places in the String constant pool
        System.out.println("Summer");//Doesn't need to create any new String object.It reuses the String object
        //with the value  "Summer" that already existed in the String constant pool.
        System.out.println("autumn"); //creates a new String object with value  "autumn" and places it in the String constant pool
        System.out.println("autumn"== "summer");  //reuses the String value "autumn" ftom the String constant pool.
        //It creates a String object with the value "summer" in the String constant pool
        String autumn = new String("Summer"); // creates a new String object with the value "Summer"

    }
}

