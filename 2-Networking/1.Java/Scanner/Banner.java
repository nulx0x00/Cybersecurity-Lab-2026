import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Banner {
	public static void main (String[] agrs)
	{
		try
		{
			Scanner sc = new  Scanner(System.in);
			System.out.print("Enter a Site(www.example.com) -->");
			String site = sc.nextLine();

			System.out.print("Enter a port no for site(80) -->");
			int port = sc.nextInt();

			Socket soc = new Socket(site,port);
			System.out.print("Connection Established");

			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);


			out.println("HEAD / HTTP/1.1\r\nHost: " +site+"\r\n\r\n");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));


			String line;
			while((line = in.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch(Exception e)
		{
			System.out.print("Failed But Tried");
		}
	}
}

