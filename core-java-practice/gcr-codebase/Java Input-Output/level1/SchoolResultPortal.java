import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt", true));

            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");

                String name = arr[0];
                int m1 = Integer.parseInt(arr[1]);
                int m2 = Integer.parseInt(arr[2]);
                int m3 = Integer.parseInt(arr[3]);

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write(name + " Average = " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
