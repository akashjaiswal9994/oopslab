package com.akash.cp;
// ValidPalindrome
public class Q125 {
    public static void main(String[] args) {
        String text = "dldlfmplufydvgmuwjiipbrjvvwqjfnrbgxutzztuxgbrnfjqwvvjrbpiijwumgvdyfulpmfldld";
       // System.out.println(palindromic(text));
        String[] arr = {"ipffochejunivnvdndmjtz", "faeh", "lfdhfimkjeupwbzwjo", "vshwaoiwglrmxmwbnjxhtothkohukscgpgrxumopgkoxoipnvhxdgmmiyoztmcpokusrcxaqoulrobpunaguyqgbmvtmv", "src", "qvwkozwzkxorsjddmhogsmqbgcmjoqjwmvjclsjanwpmrsutnkmceqhikomrsemuzssrhjaahtwplhpadfvnwc", "yweeeenfwwervnycmblyygze", "cewpcgnrahtoqxernfknwdizyidjhbcbcdebqbofbp", "coktvpwqzgmxrqchnpzwcjeonhgmwxfggitgahvuyxttbrvfbwfaouppkdb", "dnsmbwyxsmdtebrqcdrpejduauaavwdqfnqvpzbuzxladgdgpvpckxrgnhbazz", "lfdgukkrttpteqnjvdbpdocbqrclkcwdvnde", "dldlfmplufydvgmuwjiipbrjvvwqjfnrbgxutzztuxgbrnfjqwvvjrbpiijwumgvdyfulpmfldld"};
        System.out.println(findPlaindrom(arr));

        //System.out.println(isPlaindrome(text));
    }

    private static String findPlaindrom(String[] words) {

        for(int i=0;i<words.length;i++){
            StringBuffer sb=new StringBuffer();
            sb.append(words[i]);
            Boolean check= sb.reverse().toString().contains(words[i]);
            if(check==true){

                return words[i];
            }

        }
        return "";
    }

        private static boolean palindromic (String text){
            text = text.toLowerCase();
            String storeString = "";
            for (int i = 0; i < text.length(); i++) {
                char check = text.charAt(i);
                if (check >= 'a' && check <= 'z' || check >= 48 && check <= 57) {
                    storeString += check;
                }

            }
            System.out.println(storeString);
            StringBuilder sb = new StringBuilder(storeString);
            boolean find = sb.reverse().toString().contains(storeString);

            return find;
        }


        private static boolean isPlaindrome (String text){
            text = text.toLowerCase();
            String checkText = text.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(checkText);
            StringBuffer sb = new StringBuffer(checkText);

            boolean check = sb.reverse().toString().contains(checkText);
            return check;

        }
    }

