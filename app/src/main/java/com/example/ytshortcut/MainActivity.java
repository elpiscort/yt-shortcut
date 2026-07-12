package com.example.ytshortcut;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        try {
            // Создаем интент для открытия веб-страницы
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.youtube.com"));
            
            // Заставляем систему искать только браузеры (категория BROWSABLE)
            webIntent.addCategory(Intent.CATEGORY_BROWSABLE);
            
            // Очищаем данные о конкретном компоненте, чтобы не сработало приложение YouTube
            webIntent.setComponent(null);
            webIntent.setSelector(null);
            
            startActivity(webIntent);
        } catch (Exception e) {
            // На случай, если на устройстве вообще нет ни одного браузера
            Toast.makeText(this, "Не удалось найти браузер", Toast.LENGTH_SHORT).show();
        } finally {
            // Закрываем активити, чтобы приложение не оставалось белым экраном в фоне
            finish();
        }
    }
}
