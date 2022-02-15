package com.arun.test;
import com.arun.utils.*;

public class TestLogger {

  public static void main(String[] args) {
    LogUtil.setHandler();
    //System.out.println(LogUtil.consoleHandler.getLevel());
    //System.out.println(LogUtil.fileHandler.getLevel());
    
    LogUtil.info("Testing first log");

  }
  
  

}
