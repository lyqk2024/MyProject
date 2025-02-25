import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yhh
 * @version 1.0
 */
public class ShanBayProc {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String rawPath = sc.nextLine(); // 复制的文件地址在粘贴到idea控制台时会带""，需要额外进行处理
        String filePath = rawPath.split("\"")[1]; // 去除前后"
        //System.out.println(filePath);
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String input = "", line = "";
        while ((line = br.readLine()) != null){
            input = input + line;
        }
        //System.out.println(input);
        String output = "\t\t";
        String regStr = "type=\"button\">([\\w|'|\"]+)</button>|([\\.|,](?!\\w))|\"(p)(a)(r)(a)\"";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            if (matcher.group(4) != null){
                output = output + "\n\n\t\t" ;
            } else if (matcher.group(1) != null){
            output = output + " " + matcher.group(1);
            } else {
                output = output + matcher.group(0);
            }

        }
        //System.out.println(output);
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ShanBay\\Abundant Rain Could Buffer Young Forests Against Climate Change.md"));
        bw.write(output);
        bw.close();
        System.out.println("数据处理成功~");
    }
}
