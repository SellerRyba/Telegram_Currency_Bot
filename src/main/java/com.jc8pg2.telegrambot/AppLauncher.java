package com.jc8pg2.telegrambot;


import com.jc8pg2.telegrambot.telegram.bot.CurrencyTelegramBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class AppLauncher {
    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new CurrencyTelegramBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}