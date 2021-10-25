package ru.dataart.academy.java;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) {
        Integer maxCountChar = 0;
        File file = unzipInFileTxt(zipFilePath);
        char[] chars = fileToSimbols(file.getPath());
        for (char currentChar : chars) {
            if (currentChar == character) {
                maxCountChar++;
            }
        }
        return maxCountChar;
    }

    public static char[] fileToSimbols(String filePath) {
        File file = new File(filePath);
        StringBuilder sb = null;
        try {
            sb = new StringBuilder();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str = sb.toString();
        return str.toCharArray();
    }

    public static File unzipInFileTxt(String zipFilePath) {
        String filePath = zipFilePath.replaceAll("zip", "txt");
        File file = new File(filePath);
        BufferedReader br = null;
        FileWriter fw = null;
        try {
            ZipFile zf = new ZipFile(zipFilePath);
            Enumeration<? extends ZipEntry> iter = zf.entries();
            while (iter.hasMoreElements()) {
                ZipEntry ze = iter.nextElement();
                if (!ze.isDirectory()) {
                    br = new BufferedReader(new InputStreamReader(zf.getInputStream(ze)));
                    fw = new FileWriter(file, true);
                    String line;
                    while ((line = br.readLine()) != null) {
                        fw.write(line);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) {

        return 0;
    }

}
