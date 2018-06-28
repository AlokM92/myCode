package alok;

public class StringConversition {

public static void main(String[] args) {

String number = "123456789";

String StringArray[] = number.split("\\B");

int IntegreArray[] = new int[StringArray.length];

for (int i = 0; i < StringArray.length; i++) {

IntegreArray[i] = Integer.parseInt(StringArray[i]);

System.out.print(" "+IntegreArray[i]);

}

}

}
