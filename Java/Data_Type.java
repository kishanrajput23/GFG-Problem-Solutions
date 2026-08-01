class Solution {
    static int dataTypeSize(String str) {
        // code here
        int a = 0;

        switch(str){

            case "Character" : 

                a = 1;

                break;

            case "Integer" :

                a = 4;

                break;

            case "Double" :

                a = 8;

                break;

            case "Float" :

                a =  4;

                break;

            case "Long" :

                a = 8;

                break;

        }

        return a;
