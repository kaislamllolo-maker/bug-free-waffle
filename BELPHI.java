import java.util.Scanner;
public class BELPHI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = scanner.nextString();
        
        String result = belphi();
        System.out.println("The result of belphi(" + str + ") is: " + result);
    }
    public static String belphi() {
        // Implementation for BELPHI function
        return "";
            }
        }
    }
}
            if(str1[i] == str1[j])
            {
                freq[i]++;
                str1[j] = '0';
            }
        }
        System.out.println("Frequency of characters in the given string:");
        System.out.println("Character\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (str1[i] != ' ' && str1[i] != '0') {
                System.out.println(str1[i] + "\t\t" + freq[i]);
            }
        }
    }

