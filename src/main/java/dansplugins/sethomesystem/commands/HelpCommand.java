package dansplugins.sethomesystem.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand {

    public boolean execute(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!player.hasPermission("msh.help")) {
                sender.sendMessage(ChatColor.RED + "You don't have permission to use this command.");
                return false;
            }
        }
        sender.sendMessage(ChatColor.AQUA + "/msh help - View a list of helpful commands.");
        sender.sendMessage(ChatColor.AQUA + "/sethome - Set your home location.");
        sender.sendMessage(ChatColor.AQUA + "/home - Teleport to your home location.");
        sender.sendMessage(ChatColor.AQUA + "/msh forcesave - Force a save from the console.");
        sender.sendMessage(ChatColor.AQUA + "/msh forceload - Force a load from the console.");
        return true;
    }

}
