This Project contains a simple languageloader.

Here's the usage:

package com.example.Main;

import de.antonstiko.languageloader.LanguageLoader;

LanguageLoader.loadLanguage("en-en"); //load languages

String output = LanguageLoader.translate("yout-translation-key"); //get a value, make sure value is loaded



Example for language files:

src/main/resources (make sure its marked as resource directory):
  en-en.json:
    {
      "hi": "Hello",
      "code": "Text"
    }


banana.json:
  {
    "hi": "Banana!",
    "hello": "Bananana!"
  }
