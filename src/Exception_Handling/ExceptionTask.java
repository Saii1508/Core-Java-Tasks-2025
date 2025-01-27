package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionTask {
//Exception handling with own custom exceptions code
    public void checkFile(String fileName) throws Exception {
        File file = new File(fileName);
        int asciValue;
        FileInputStream fis = new FileInputStream(file);
        if (fis.read() == -1) {
            throw new EmptyFileException("File is Empty");
        }
        System.out.println(fis.read());
        while ((asciValue = fis.read()) != -1) {
            System.out.print((char) asciValue);
        }
    }

    public static void main(String[] a) throws Exception {
        try {
            ExceptionTask obj = new ExceptionTask();
            obj.checkFile("/home/sysquare/Desktop/sampleFile");
        } catch (FileNotFoundException oe) {
            throw new MyOwnException("There is no File found with the file you given");
        } catch (EmptyFileException ae) {
            throw new MyOwnException("The given file has no content - " + ae.getMessage());
        }
    }
}
