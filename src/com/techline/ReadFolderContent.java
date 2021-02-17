package com.techline;
import java.io.File;

public class ReadFolderContent {
    public static void main(String[] args){
        // creates a file object
        File file = new File("/home/mike/Documents/personal/NODE_PROJECTS/ELECTRON_ROJECTS/First_Approach/SchoolLine/src/htmlpages");

        // returns an array of all files
        String[] fileList = file.list();

        if (fileList != null) {
            for(String str : fileList) {
                System.out.println("$$"+str+"%%");
            }
        }else{
            System.out.println("file list is null");
        }
    }


}
