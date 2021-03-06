package org.sphinx;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lesson
{
    Path path;

    public Lesson(String lessontitle) {
        /*for (int i = 0; i < lessontitle.length(); i++)
        {
            char c = lessontitle.charAt(i);

        }*/

        lessontitle.toUpperCase();

        path = Paths.get("c:\\Users\\public\\Lessons");

        if (!folderExists())
        {
            createFolder();
        }

        /*String link = "https://raw.githubusercontent.com/SphinxCombine/Qwerty/" + lessontitle + ".html";
        URL gitlink = new URL(link);
        HttpURLConnection githttp = (HttpURLConnection) gitlink.openConnection();
        Map<String, List<String>>  This will download the html file off github*/

        path = Paths.get("c:\\Users\\public\\Lessons\\" + lessontitle + ".html");

    }

    private boolean folderExists()
    {
        return Files.exists(path);
    }

    private void createFolder()
    {
        File lessonDir = new File(path.toString());             //may not work
        lessonDir.mkdirs();
    }
}
