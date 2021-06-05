import application.signup.SignUpper;
import application.signup.User;
import api.*;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        RequestPipeline.build();
        Gson gson = new Gson();
        User user = new User("zahra","z@sbu.com","123aaaBBB@#");
        user.setBio("i am the head TA");
        SignUpper signUpper = new SignUpper(user);
        ApiHandler apiHandler = new ApiHandler(signUpper.makeRequest());
        apiHandler.sendRequest();
        Scanner in = new Scanner(System.in);
        in.next();
    }
}