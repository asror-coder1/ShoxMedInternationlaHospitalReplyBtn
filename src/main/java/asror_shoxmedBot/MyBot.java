package asror_shoxmedBot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        MyBotService myBotService = new MyBotService();

        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();


            if (text.equals("/start")) {
                try {
                    execute(myBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83C\uDDFA\uD83C\uDDFF O'zbekcha")) {
                try {
                    execute(myBotService.ozbektili(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83C\uDDFA\uD83C\uDDFF Ўзбекча")) {
                try {
                    execute(myBotService.kriltili(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDDF7\uD83C\uDDFA Русский")) {
                try {
                    execute(myBotService.rustili(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDDEC\uD83C\uDDE7 English")) {
                try {
                    execute(myBotService.ingliztili(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E")) {
                try {
                    execute(myBotService.fikrmulohazabosilgandaUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCDD Отзыв \uD83D\uDC4D\uD83D\uDC4E")) {
                try {
                    execute(myBotService.fikrmulohazabosilgandaRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCDD Фикр-мулоҳаза \uD83D\uDC4D\uD83D\uDC4E")) {
                try {
                    execute(myBotService.fikrmulohazabosilgandaKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCDD Feedback \uD83D\uDC4D\uD83D\uDC4E")){
                try {
                    execute(myBotService.fikrmulohazabosilgandaEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("✅ Natijalar")){
                try {
                    execute(myBotService.resultsUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("✅ Натижалар")){
                try {
                    execute(myBotService.resultsKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("✅ Результаты")){
                try {
                    execute(myBotService.resultsRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("✅ Results")){
                try {
                    execute(myBotService.resultsEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE48 Shifokor yozuvini o'qib berish")){
                try {
                    execute(myBotService.shifokoryozuviniuqishUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE48 Шифокор ёзувини ўқиб бериш")){
                try {
                    execute(myBotService.shifokoryozuviniuqishKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDE48 Разбор почерка направления")){
                try {
                    execute(myBotService.shifokoryozuviniuqishRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE48 Decode doctor's handwritings")){
                try {
                    execute(myBotService.shifokoryozuviniuqishEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish")){
                try {
                    execute(myBotService.qungiroqbuyurtmaqilishUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83D\uDCF2 Қўнғироқ буюртма қилиш")){
                try {
                    execute(myBotService.qungiroqbuyurtmaqilishKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCF2 Перезвонить мне")){
                try {
                    execute(myBotService.shifokoryozuviniuqishRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCF2 Request a call")){
                try {
                    execute(myBotService.qungiroqbuyurtmaqilishEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("☎\uFE0F Biz bilan bog'lanish")){
                try {
                    execute(myBotService.boglanishUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("☎\uFE0F Биз билан боғланиш")){
                try {
                    execute(myBotService.boglanishKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("☎\uFE0F Наши контакты")){
                try {
                    execute(myBotService.boglanishRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("☎\uFE0F Our contacts")){
                try {
                    execute(myBotService.boglanishEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCD Bizning manzillarimiz")){
                try {
                    execute(myBotService.mahalllaUzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCD Бизнинг манзилларимиз")){
                try {
                    execute(myBotService.mahalllaKril(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCD Наши локации")){
                try {
                    execute(myBotService.mahalllaRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCD Our locations")){
                try {
                    execute(myBotService.mahalllaEnglish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER")){
                try {
                    execute(myBotService.location1Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER")){
                try {
                    execute(myBotService.locationMessage1Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX INTERNATIONAL HOSPITAL")){
                try {
                    execute(myBotService.location2Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX INTERNATIONAL HOSPITAL")){
                try {
                    execute(myBotService.locationMessage2Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("MED ZDOROVAYA SEMYA CENTER")){
                try {
                    execute(myBotService.location3Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("MED ZDOROVAYA SEMYA CENTER")){
                try {
                    execute(myBotService.locationMessage3Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("SHOX MED PEDIATRIYA")){
                try {
                    execute(myBotService.location4Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("SHOX MED PEDIATRIYA")){
                try {
                    execute(myBotService.locationMessage4Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED REABILITATSIYA")){
                try {
                    execute(myBotService.location5Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED REABILITATSIYA")){
                try {
                    execute(myBotService.locationMessage5Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER ANDIJON")){
                try {
                    execute(myBotService.location6Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER ANDIJON")){
                try {
                    execute(myBotService.locationMessage6Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER ANDIJON MIKRORAYON")){
                try {
                    execute(myBotService.location7Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER ANDIJON MIKRORAYON")){
                try {
                    execute(myBotService.locationMessage7Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SHOX MED CENTER FILIAL")){
                try {
                    execute(myBotService.location8Uzb(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
           if (text.equals("SHOX MED CENTER FILIAL")){
               try {
                   execute(myBotService.locationMessage8Uzb(chatId));
               } catch (TelegramApiException e) {
                   throw new RuntimeException(e);
               }
           }

        }

    }

    @Override
    public String getBotUsername() {
        return "shoxMedAsrorbot";
    }

    @Override
    public String getBotToken() {
        return "8436607504:AAGCji241yKWjfIUooQggukek4Cxn_pufk8";
    }
}
