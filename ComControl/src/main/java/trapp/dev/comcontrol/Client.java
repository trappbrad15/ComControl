package trapp.dev.comcontrol;

import java.io.BufferedWriter;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

import android.util.Log;

public class Client {

    private static Client instance;
    private Socket socket;
    PrintWriter output;
    BufferedReader input;

    private Client()
    {
    }

    public static Client Instance()
    {
        if(instance == null)
        {
            instance = new Client();
        }
        return instance;
    }

    public String sendMessage(String message)
    {

        String msgFromServer = "";

        try
        {
            //socket = new Socket()
            output = new PrintWriter( new BufferedWriter( new OutputStreamWriter(socket.getOutputStream())), true);
            input = new BufferedReader( new InputStreamReader(socket.getInputStream()));
        }
        catch (Exception e)
        {
            Log.e("ComControl", "Exception: " + e.getMessage());
            Log.e("ComControl", "Exception: ", e);
        }
        int DEFAULT_BUFFER_SIZE = 100000;
        int charsRead = 0;
        char[] data = new char[DEFAULT_BUFFER_SIZE];
        try
        {
            output.write(message);
            output.flush();
            while(charsRead == 0)
            {
                charsRead = input.read(data);
            }
            if(charsRead > 0)
            {
                msgFromServer += new String(data).substring(0, charsRead);
            }

            Log.w("ComControl", msgFromServer);

        }
        catch(Exception e){}
        try {
            socket.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return msgFromServer;
    }
}

