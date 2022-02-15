package com.arun.utils;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LogUtil {
  private static final Logger LOGGER = Logger.getLogger(LogUtil.class.getName());
  public static Handler consoleHandler = null;
  public static Handler fileHandler = null;
  
  public static void setHandler() {
    try {
      consoleHandler = new ConsoleHandler();
      fileHandler = new FileHandler("./logFile.log");
      consoleHandler.setLevel(Level.ALL);
      fileHandler.setLevel(Level.ALL);
    }catch(IOException exception) {
      LOGGER.log(Level.SEVERE, "Error occured in FileHandler.", exception);
    }
  }
  
  public static void info(String message) {
    setHandler();
    LOGGER.log(Level.INFO, message);
  }
  
  

}
