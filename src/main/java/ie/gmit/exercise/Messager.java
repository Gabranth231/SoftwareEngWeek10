package ie.gmit.exercise;

import java.io.IOException;
import java.io.PrintWriter;

public interface Messager {
   public void writeMessage(Formatter formatter, PrintWriter printWriter, Message msg
           , String fileName) throws IOException;
}
