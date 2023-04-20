package com.company;

public class Main extends CreateDirAndFiles {
    public static void main(String[] args) {
        String gameDir = "D:/Games/";
        createDir(gameDir + "src");
        createDir(gameDir + "res");
        createDir(gameDir + "savegames");
        createDir(gameDir + "temp");
        createDir(gameDir + "src/main");
        createDir(gameDir + "src/test");
        createDir(gameDir + "res/drawables");
        createDir(gameDir + "res/vectors");
        createDir(gameDir + "res/icons");
        createFile(gameDir + "src/main/Main.java");
        createFile(gameDir + "src/main/Utils.java");
        createFile(gameDir + "temp/temp.txt");

        GameProgress gameProgress = new GameProgress(100, "Gun", 1, 100);
        GameProgress gameProgress1 = new GameProgress(200, "Machine gun", 2, 200);
        GameProgress gameProgress2 = new GameProgress(300, "Rifle", 3,
                500);

        saveGame("save.dat", gameProgress);
        saveGame("save2.dat", gameProgress1);
        saveGame("save3.dat", gameProgress2);
        zipFiles(SAVEPATHLIST, "allSaves.zip");
        for (String file:SAVEPATHLIST) {
            deleteFile(SAVE + file);
        }
        openZip(SAVE + "allSaves.zip", SAVE);
        System.out.println(openProgress(SAVE + "save.dat"));
        LogWriter(gameDir + "temp/temp.txt");
    }
}
