package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int a = 0;
        // while `counter` is less than length of array
        do {result = result+personArray[a];
        a++;}
        while (a<personArray.length);

            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable

            // end loop

        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
            for (int b=0;b<personArray.length;b++){
               result = result+personArray[b];
            }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        for(Person c : personArray){
            result = result+c;

        }

        return result;
    }


    public Person[] getPersonArray() {
        for(Person c : personArray){

        }
        return personArray;
    }
}
