package net.alpenblock.bungeeperms;

import net.alpenblock.bungeeperms.platform.Sender;

public class Messages
{

    //todo make caps
    public static final String Error = Color.Error + "An error occured! Please contact an Administrator";
    public static final String TooLessArgs = Color.Error + "Too little arguments!";
    public static final String TooManyArgs = Color.Error + "Too many arguments!";
    public static final String NoRights = Color.Error + "Hey, you have Insufficient permissions to use this. If you believe this is an error please contact an administrator.";

    public static void sendErrorMessage(Sender sender)
    {
        sender.sendMessage(Error);
    }

    public static void sendTooLessArgsMessage(Sender sender)
    {
        sender.sendMessage(TooLessArgs);
    }

    public static void sendTooManyArgsMessage(Sender sender)
    {
        sender.sendMessage(TooManyArgs);
    }

    public static void sendNoRightsMessage(Sender sender)
    {
        sender.sendMessage(NoRights);
    }
}
