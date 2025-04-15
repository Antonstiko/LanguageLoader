package de.antonstiko.languageloader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import com.google.gson.Gson;

public class LanguageLoader {
    private static Map<String, String> translations;

    public static void loadLanguage(String langCode) throws IOException {
        // Benutze den ClassLoader, um die Datei aus den Ressourcen zu laden
        String path = "/languages/" + langCode + ".json";
        InputStream inputStream = LanguageLoader.class.getResourceAsStream(path);

        if (inputStream == null) {
            throw new IOException("Die Sprachdatei existiert nicht: " + langCode);
        }

        String json = new String(inputStream.readAllBytes());
        translations = new Gson().fromJson(json, Map.class);
    }


    public static String translate(String key) {
        return translations.getOrDefault(key, key);
    }
}