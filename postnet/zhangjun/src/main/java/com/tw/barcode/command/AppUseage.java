package com.tw.barcode.command;

import com.tw.barcode.Command;
import com.tw.barcode.CommandResult;

public class AppUseage implements Command {
    @Override
    public CommandResult apply(String userInput) {
        return new CommandResult("1 zip to bar\n2 bar to zip\n3 exit", true);
    }

}
