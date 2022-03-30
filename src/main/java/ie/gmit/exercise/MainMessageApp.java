package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {
		Formatter formatter = new JSONFormatter();//creates formatter
		PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"));
		Message msg = new Message("This is a message");
		Messager printer = new MessagePrinter();
		printer.writeMessage(formatter, writer, msg, "test_msg.txt");
	}

}
